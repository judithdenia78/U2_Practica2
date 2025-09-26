import java.util.Scanner;

/**
 * Clase que introduciendo la temperatura en Celsius nos la convierta en Fahrenheit y Kelvin
 * @author Judith Bartolomé Gómez
 * @version 1.0
 */
public class Actividad4 {

    public static void main(String[] args) {

        Scanner lector= new Scanner(System.in);
        System.out.println("Introduce la temperatura en Celsius: ");
        double temperatura = lector.nextDouble();

        double fahrenheit = temperatura * 1.8;

        System.out.println("Temperatura en Fahrenheit: " + fahrenheit );

        double kelvin = temperatura + 273.15;
        System.out.println("La temperatura en Kelvin es: " + kelvin);

        lector.close();

    }
}
