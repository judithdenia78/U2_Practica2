import java.util.Scanner;

/**
 * Clase que pidiendo al usuario dos números te haga la suma
 * @author Judith Bartolomé
 * @version 1.0
 */

public class Actividad2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int num1 = lector.nextInt();

        System.out.println("Introduce el segundo número: ");

        int num2 = lector.nextInt();
        int resultado = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + resultado);

        lector.close();
    }

}
