import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idioma = 6;
        String[] cliente = new String[99];
// seleccion de lenguaje
        /*
        while (idioma < 1 || idioma > 5) {
            System.out.printf("please Select your lenguaje\n" +
                    "por favor seleccione su lenguaje\n" +
                    "1. English\n" +
                    "2. Español\n" +
                    "3. Français\n" +
                    "4. Italiano\n" +
                    "5. Ruso\n");
            idioma = teclado.nextInt();
            switch (idioma) {
                case 1:
                    System.out.println("Hello, welcome to our platform!");
                    break;
                case 2:
                    System.out.println("Bienvenido a nuestra plataforma!");
                    System.out.println("menu principal: \n"+
                            "1 registrar cliente\n"+
                            "2 buscar cliente\n"+
                            "3 modificar cliente\n"+
                            "4 eliminar cliente\n"+
                            "5 salir");



                    break;
                case 3:
                    System.out.println("Bienvenue à notre plateforme!");
                    break;
                case 4:
                    System.out.println("Benvenuto nella nostra piattaforma!");
                    break;
                case 5:
                    System.out.println("Приветствуем в нашей платформе!");
                    break;
            }
        }

         */

        String nombre = "tony stark";
        String tipoCuenta = "corriente";
        double saldo = 1599.99;
        int opcion = 0;
        double retiro = 0;
        double deposito = 0;

        System.out.println("********************************");
        System.out.println("\nCliente: " + nombre);
        System.out.println("el tipo de cuenta: " + tipoCuenta);
        System.out.printf("El saldo actual es: $%.2f", saldo);
        System.out.println("\n********************************");

        String menu = ("""
                \n*** escriba la opcion de tu preferencia ***
                1 - consultar saldo 
                2 - retirar dinero
                3 - depositar dinero
                4 - salir
                """);
        System.out.println(menu);
        while (opcion != 4) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("\nEl saldo actual es: $%.2f", saldo);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de dinero a retirar: $");
                    retiro = teclado.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("No hay suficiente saldo.");
                    } else {
                        saldo -= retiro;
                        System.out.printf("\nEl saldo actual es: $%.2f", saldo);
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de dinero a depositar: $");
                    deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.printf("\nEl saldo actual es: $%.2f", saldo);
                    break;
            }
        }
    }


}
