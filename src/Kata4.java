import java.util.Scanner;

public class Kata4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el día (1=Lunes, 7=Domingo): ");
        int dia = sc.nextInt();

        System.out.println("Ingresa la hora (0-23): 13)");
        int hora = sc.nextInt();

        if (dia < 1 || dia > 7) {
            System.out.println("Error: día invalido");
            sc.close();
            return;
        }

        if (hora < 0 || hora > 23) {
            System.out.println("Error: hora invalida");
            sc.close();
            return;
        }

        String estado = switch (dia) {
            case 1, 2, 3, 4, 5 -> {
                if (hora >= 6 && hora < 20) {
                    yield "abierta";
                } else {
                    yield "cerrada";
                }
            }
            case 6 -> {
                if (hora >= 7 && hora < 14) {
                    yield "abierta";
                } else {
                    yield "cerrada";
                }
            }
            case 7 -> "cerrada";
            default -> "cerrada";
        };

        String horarioTexto = switch (dia) {
            case 1, 2, 3, 4, 5 -> "lunes a viernes: 6:00 AM - 8:00 PM";
            case 6 -> "sabado: 7:00 AM - 2:00 PM";
            case 7 -> "domingo: cerrado todo el día";
            default -> "";
        };

        System.out.println("La cafetería está " + estado + ".");
        System.out.println("Horario de " + horarioTexto);

        sc.close();


    }
}
