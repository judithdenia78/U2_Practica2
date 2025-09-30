import java.util.Scanner;

/**
 * Clase que nos calcula el area y el perimetro de un rectángulo.
 * @author Judith Bartolome
 * @version 1.0
 */

public class Actividad5 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        int base = lector.nextInt();
        System.out.println("Introduce la altura: ");
        int altura = lector.nextInt();

        int area = base * altura;
        int perimetro = 2 * (base + altura);

        System.out.println("El área de un rectángulo es: " +  area);
        System.out.println("El perimetro de un rectánguloe es: " + perimetro);

        lector.close();

    }
}
