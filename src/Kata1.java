import java.util.Scanner;

public class Kata1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el total de la cuenta:");
        double total = sc.nextDouble();

        if (total <= 0) {
            System.out.println("Error: total inválido");
            sc.close();
            return;
        }

        System.out.println("Ingresa el porcentaje de propina:");
        double propina = sc.nextDouble();

        if (propina < 0 || propina > 100) {
            System.out.println("Error: porcentaje inválido");
            sc.close();
            return;
        }
        double valorPropina = (propina / 100) * total;
        System.out.println("Propina: $" + String.format("%,.2f", valorPropina));

        double totalPago = total + valorPropina;
        System.out.println("Total a pagar: $" + String.format("%,.2f", totalPago));

        if (propina > 30) {
            System.out.println("¡Propina generosa!");
        } else if (propina < 5) {
            System.out.println("Propina muy baja");
        }

    }
}
