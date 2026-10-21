import java.util.Scanner;

public class Kata6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalClientes = 0;
        int contadorHoras = 0;
        int horaPico = -1;
        int maxClientes = -1;

        while (true) {
            System.out.println("Ingresa la hora (0-23, -1 para terminar): ");
            int hora = sc.nextInt();

            if (hora == -1) {
                break;
            }

            if (hora < 0 || hora > 23) {
                System.out.println("Hora invalida");

            } else {
                System.out.println("Ingresa el número de clientes en esa hora: ");
                int clientes = sc.nextInt();

                if (clientes < 0) {
                    System.out.println("Cantidad invalida de clientes");

                } else {
                    totalClientes = totalClientes + clientes;
                    contadorHoras = contadorHoras + 1;
                    if (clientes > maxClientes) {
                        maxClientes = clientes;
                        horaPico = hora;
                    }
                }
            }
        }

        if (contadorHoras == 0) {
            System.out.println("No se ingresaron datos");

        } else {
            double promedio = (double) totalClientes / contadorHoras;

            System.out.println("--- Reporte de Clientes ---");
            System.out.println("Total de clientes: " + totalClientes);
            System.out.println("Promedio por hora: " + String.format("%.2f", promedio));
            System.out.println("Hora con más clientes: " + horaPico + " (" + maxClientes + " clientes)");
        }

        sc.close();
    }
}
