import java.util.Scanner;

/**
 * Clase que solicitando una palabra al usuario me la muestre por pantalla 3 veces
 * @author Judith Bartolome
 * @version 1.0
 */
public class Actividad1 {
    public static void main(String[] args) {


        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = lector.nextLine();

        System.out.println(palabra + "-" + palabra + "-" + palabra);

        lector.close();


}
}