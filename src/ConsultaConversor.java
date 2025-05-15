import com.google.gson.Gson;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class ConsultaConversor {

    ArrayList<String> listaConversiones = new ArrayList<>();
    String historial = "Historial de conversiones: \n";

        public ConversorMoneda solicitarConversionMoneda(String moneda){
            URI url = URI.create("https://v6.exchangerate-api.com/v6/6d13fd38e9c26a14c0c0ac65/latest/"+moneda);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(url)
                    .build();

            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                return new Gson().fromJson(response.body(),ConversorMoneda.class);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw new RuntimeException("No logró realizar la conversión");
            }
        }

    public String conversionMoneda(String monedaConsultada, String monedaRespuesta,
                                   double cantidadAConvertir, double valorMoneda, Integer ultimaConsulta){

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date fechaYHoraActual = new Date();

        double monedaConvertida = valorMoneda * cantidadAConvertir;

        Instant conversionFechaYHora = Instant.ofEpochSecond( ultimaConsulta );
        Date fechaYHoraUltimaConversion = Date.from( conversionFechaYHora );

        String texto = "Fecha consulta: " + dateFormat.format(fechaYHoraActual) + " -> " + cantidadAConvertir + " [" +
                monedaConsultada + "] ==> " + monedaConvertida + " [" + monedaRespuesta + "] ->> Última conversión: " +
                dateFormat.format(fechaYHoraUltimaConversion);

        listaConversiones.add(texto);

        return "El valor de " + cantidadAConvertir + " [" + monedaConsultada +
                "] corresponde al valor final de =>> " + monedaConvertida + "[" + monedaRespuesta + "] \n";
    }


    public String mostrarHistorialConversion(){
        for (String listaConversiones : listaConversiones) {
            historial += listaConversiones + '\n';
        }

        return historial;
    }
}
