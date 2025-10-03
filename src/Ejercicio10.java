import java.util.Scanner;
/**
 * Clase que introduciendo dia, mes y año nos salga por pantalla la fecha completa
 * @author Judith Bartolome
 * @version 1.0
 */

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el día:");
        int dia = lector.nextInt();
        System.out.println("Introdice el mes:");
        int mes = lector.nextInt();
        System.out.println("Introduce el año:");
        int anio = lector.nextInt();

        //Creamos un if porque los meses son solo 12, tenemos que indicar que hay error si nos dicen meses mas altos.
        if (mes < 1 || mes > 12) {
            System.out.println("Error: El mes debe estar entre 1 y 12.");
        } else {
            System.out.println("La fecha es: " + anio + "-" + mes + "-" + dia);
        }

        lector.close();
    }
}
