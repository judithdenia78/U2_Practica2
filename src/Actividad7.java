
import java.util.Scanner;

/**
 * Clase que pide al usuario minutos y segundos de dos canciones y las suma para ver el tiempo total
 * @author Judith Bartolome
 * @version 1.0
 */

public class Actividad7 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce los minutos de la primera canción:");
        int min1 = lector.nextInt();
        System.out.println("Introduce los segundos de la primera canción:");
        int seg1= lector.nextInt();
        System.out.println("Introduce los minutos de la segunda canción:");
        int min2 = lector.nextInt();
        System.out.println("Introdice los segundos de la segunda canción:");
        int seg2 = lector.nextInt();

        int totalmin = min1 + min2;
        int totalseg = seg1 + seg2;

        totalmin += totalseg/60;
        totalseg = totalseg %60;

        System.out.println("La duración total de las canciónes es de: " + totalmin + ":" + totalseg);

        lector.close();
    }

    }
