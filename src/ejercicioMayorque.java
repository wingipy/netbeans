
import java.util.Scanner;


public class ejercicioMayorque {
    public static void main(String args[]){
        System.out.println("Ingrese el primer valor: ");
        Scanner consola = new Scanner(System.in);
        int numer1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el segundo valor: ");
        int numer2 = Integer.parseInt(consola.nextLine());
        if (numer1 < numer2){
            System.out.println("Es menor "+ numer1);
        }
        else{
            System.out.println("Es menor "+ numer2);
        }
        
    }
    
}
