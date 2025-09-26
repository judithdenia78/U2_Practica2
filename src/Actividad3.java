import java.util.Scanner;

/**
 * Clase que introudiciendo 3 notas me haga la media de las 3
 * @author Judith Bartolomé
 * @version 1.0
 */
public class Actividad3 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");
        double num1 = lector.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        double num2 = lector.nextDouble();
        System.out.println("Introduce la tercera nota: ");
        double num3 = lector.nextDouble();

        double media = (num1 + num2 + num3) / 3;
        System.out.println("Media: " + media);

        lector.close();
    }

    }
