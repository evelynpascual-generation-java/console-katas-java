import java.util.Scanner;

public class Kata3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double input;

        double subtotal = 0;

        do {
            System.out.println("Ingresa el precio del producto (0 para terminar)");
            input = sc.nextDouble();

            if (input > 0) {
                subtotal = subtotal + input;
            } else if (input < 0) {
                System.out.println("Error: El precio no puede ser negativo");
            }

        } while (input != 0);

        double iva = 0.19 * subtotal;
        double totalConIVA = subtotal + iva;
        double descuento;
        double totalFinal;

        System.out.println("Subtotal: $" + String.format("%,.2f",subtotal));
        System.out.println("IVA (19%): $" + String.format("%,.2f",iva));
        System.out.println("Total con IVA: $" + String.format("%,.2f",totalConIVA));

        if (totalConIVA > 50000) {
            descuento = totalConIVA * 0.1;
            totalFinal = totalConIVA - descuento;
            System.out.println("Descuento (10%): $" + String.format("%,.2f",descuento));
        } else {
            totalFinal = totalConIVA;
        }

        System.out.println("Total a pagar: $" + String.format("%,.2f",totalFinal));
        sc.close();
    }
}
