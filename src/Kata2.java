import java.util.Scanner;

public class Kata2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el nombre de la bebida: ");
        String nombreBebida = sc.nextLine();

        System.out.println("Ingresa la temperatura: ");
        double temperatura = sc.nextDouble();

        String clasificacion;

        if (temperatura > 60) {
            clasificacion = "Caliente";
        } else if (temperatura < 30) {
            clasificacion = "Fría";
        } else{
            clasificacion = "Templada";
        }

        System.out.println(nombreBebida +": " + clasificacion);
        sc.close();
    }
}
