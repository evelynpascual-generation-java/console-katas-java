import java.util.Scanner;

public class Kata5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        double totalPedido = 0;

        while (opcion != 6) {

            System.out.println("--- Menu de la Cafetería ---");
            System.out.println("1. Café ($4.000)");
            System.out.println("2. Muffin ($3.500)");
            System.out.println("3. Sandwich ($7.500)");
            System.out.println("4. Jugo ($5.000)");
            System.out.println("5. Té ($3.000)");
            System.out.println("6. Salir");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Producto agregado: Café ($4.000)");
                    totalPedido += 4000;
                }
                case 2 -> {
                    System.out.println("Producto agregado: Muffin ($3.500)");
                    totalPedido += 3500;
                }
                case 3 -> {
                    System.out.println("Producto agregado: Sandwich ($7.500)");
                    totalPedido += 7500;
                }
                case 4 -> {
                    System.out.println("Producto agregado: Jugo ($5.000)");
                    totalPedido += 5000;
                }
                case 5 -> {
                    System.out.println("Producto agregado: Té ($3.000)");
                    totalPedido += 3000;
                }
                case 6 -> {
                }

                default -> System.out.println("Opción inválida");
            }
        }

        System.out.println("Total del pedido: $" + String.format("%,.2f", totalPedido));
        sc.close();
    }
}
