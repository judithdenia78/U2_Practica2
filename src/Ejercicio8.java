import java.util.Scanner;
/**
 * Clase que pidiendo una cantidad de dinero, nos separe los euros y céntimos
 * @author Judith Bartolome
 * @version 1.0
 */

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce un precio en euros: ");
        double precio = lector.nextDouble();

        // Convertimos el número double a entero.
        int euros = (int) precio;
        int centimos = (int) (precio - euros) * 100; // Usamos el *100 porque convierte 0.34 centimos en 34 centimos.

        System.out.println("Euros: " + euros);
        System.out.println("Centimos: " + centimos);

        lector.close();
    }
}
