import java.util.Scanner;

/**
 * Clase que pidiendo al usuario el radio y la altura nos calcule el volumen de un cilindro
 * @author Judith Bartolome
 * @version 1.0
 */

public class Actividad6 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el radio: ");
        double radio = lector.nextDouble();
        System.out.println("Introduce la altura: ");
        double altura =lector.nextDouble();

        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println("El volumen de un cilindro es: " + volumen);

        lector.close();


    }
}
