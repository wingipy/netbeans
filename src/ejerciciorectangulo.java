
import java.util.Scanner;


public class ejerciciorectangulo {
    public static void main(String args[]){
        System.out.println("Ingresa el ancho del rectangulo: ");
        Scanner consola = new Scanner(System.in);
        var ancho = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el largo del rectangulo:");
        var largo = Integer.parseInt(consola.nextLine());
        System.out.println("El area del rectagulo es: " + (ancho * largo));
        System.out.println("El perimetro del rectangulo es: " + ((2 * ancho)+(2*largo)));
        
        
    }
    
}
