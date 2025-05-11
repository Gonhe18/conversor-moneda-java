import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ConversorMoneda solicitarConversion;
        double valorMoneda;
        String conversionExitosa;

        int opcion = 0;

        String menu = """
                    ****************************************
                    1) Dolar =>> Peso argentino
                    2) Peso argentino =>> Dolar
                    3) Dolar =>> Real brasileño
                    4) Real brasileño =>> Dolar
                    5) Dola =>> Peso colombiano
                    6) Peso colombiano =>> Dolar
                    7) Salir
                    
                    Elija una opción válida:
                    ****************************************
                    """;

        String solicitudValor = "Ingrese el valor que desea convertir: ";

        ConsultaConversor consulta = new ConsultaConversor();

        while(opcion != 7 ){

            double cantidad;

            System.out.println(" \n Sea bienvenido/a al Conversor de Moneda =] \n");
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("USD");
                    valorMoneda = solicitarConversion.conversion_rates().get("ARS");

                    conversionExitosa = consulta.conversionMoneda("USD",
                            "ARS",
                            cantidad,
                            valorMoneda);

                    System.out.println(conversionExitosa);
                    break;
                case 2:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("ARS");
                    valorMoneda = solicitarConversion.conversion_rates().get("USD");

                    conversionExitosa = consulta.conversionMoneda("ARS",
                            "USD",
                            cantidad,
                            valorMoneda);

                    System.out.println(conversionExitosa);
                    break;
                case 3:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("USD");
                    valorMoneda = solicitarConversion.conversion_rates().get("BRL");

                    conversionExitosa = consulta.conversionMoneda("USD",
                            "BRL",
                            cantidad,
                            valorMoneda);

                    System.out.println(conversionExitosa);
                    break;
                case 4:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("BRL");
                    valorMoneda = solicitarConversion.conversion_rates().get("USD");

                    conversionExitosa = consulta.conversionMoneda("BRL",
                            "USD",
                            cantidad,
                            valorMoneda);

                    System.out.println(conversionExitosa);
                    break;
                case 5:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("USD");
                    valorMoneda = solicitarConversion.conversion_rates().get("COP");

                    conversionExitosa = consulta.conversionMoneda("USD",
                            "COP",
                            cantidad,
                            valorMoneda);

                    System.out.println(conversionExitosa);
                    break;
                case 6:
                    System.out.println(solicitudValor);
                    cantidad = teclado.nextDouble();

                    solicitarConversion = consulta.solicitarConversionMoneda("COP");
                    valorMoneda = solicitarConversion.conversion_rates().get("USD");

                    conversionExitosa = consulta.conversionMoneda("COP",
                            "USD",
                            cantidad,
                            valorMoneda);

                    System.out.println(conversionExitosa);
                    break;
                case 7:
                    System.out.println("Sesión finalizada. Gracias por utilizar nuestro conversor de monedas!!");
                    break;

                default:
                    System.out.println("Opción ingresada no válida");
                    break;
            }
        }

    }
}