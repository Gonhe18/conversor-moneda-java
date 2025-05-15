import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ConversorMoneda solicitarConversion;
        double valorMoneda;
        String conversionExitosa;
        Integer ultimaConsulta;

        int opcion = 0;

        String menu = """
                    ****************************************************
                    Sea bienvenido/a al Conversor de Moneda =]
                    
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dolar =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Dolar =>> Euro
                    8) Euro =>> Dolar
                    9) Euro =>> Peso argentino
                    10) Peso argentino =>> Euro
                    11) Historial de conversiones
                    12) Salir
                    
                    Elija una opción válida:
                    ****************************************************
                    """;

        String solicitudValor = "Ingrese el valor que desea convertir: ";

        ConsultaConversor consulta = new ConsultaConversor();

        while(opcion != 12 ){

            double cantidad;

            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("USD");
                    valorMoneda = solicitarConversion.conversion_rates().get("ARS");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("USD",
                            "ARS",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 2:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("ARS");
                    valorMoneda = solicitarConversion.conversion_rates().get("USD");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("ARS",
                            "USD",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 3:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("USD");
                    valorMoneda = solicitarConversion.conversion_rates().get("BRL");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("USD",
                            "BRL",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 4:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("BRL");
                    valorMoneda = solicitarConversion.conversion_rates().get("USD");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("BRL",
                            "USD",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 5:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("USD");
                    valorMoneda = solicitarConversion.conversion_rates().get("COP");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("USD",
                            "COP",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 6:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("COP");
                    valorMoneda = solicitarConversion.conversion_rates().get("USD");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("COP",
                            "USD",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 7:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("USD");
                    valorMoneda = solicitarConversion.conversion_rates().get("EUR");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("USD",
                            "EUR",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 8:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("EUR");
                    valorMoneda = solicitarConversion.conversion_rates().get("USD");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("EUR",
                            "USD",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 9:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("EUR");
                    valorMoneda = solicitarConversion.conversion_rates().get("ARS");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("EUR",
                            "ARS",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 10:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("ARS");
                    valorMoneda = solicitarConversion.conversion_rates().get("EUR");
                    ultimaConsulta = solicitarConversion.time_last_update_unix();

                    conversionExitosa = consulta.conversionMoneda("ARS",
                            "EUR",
                            cantidad,
                            valorMoneda,
                            ultimaConsulta);

                    System.out.println(conversionExitosa);
                    break;
                case 11:
                    String historialConversion = consulta.mostrarHistorialConversion();
                    System.out.println(historialConversion);
                    break;
                case 12:
                    System.out.println("Sesión finalizada. Gracias por utilizar nuestro conversor de monedas!!");
                    break;

                default:
                    System.out.println("Opción ingresada no válida");
                    break;
            }
        }

    }
}