import java.util.Scanner;
/**
 * Clase que pidiendo al usuario su nombre y apellido solo nos de las iniciales de amnbas
 * @author Judith Bartolome
 * @version 1.0
 */

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = lector.nextLine();
        System.out.println("Introduce tu primer apellido:");
        String apellido = lector.nextLine();

        char inicialNombre = nombre.charAt(0);
        char inicialApellido = apellido.charAt(0);

        System.out.println("Las iniciales son: " + inicialNombre + "." + inicialApellido);

        lector.close();
    }
}
