import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaConversor {
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
                                   double cantidadAConvertir, double valorMoneda){

        double monedaConvertida = valorMoneda * cantidadAConvertir;

        return "El valor de " + cantidadAConvertir + " [" + monedaConsultada + "] corresponde al valor final de =>> " +
                monedaConvertida + "[" + monedaRespuesta + "]";
    }
}
