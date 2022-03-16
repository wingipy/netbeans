
import java.util.Scanner;

public class bucleFor {
    public static void main(String args[]){
//        for( var cuenta = 0; cuenta <= 10 ; cuenta++ ){
//            System.out.println("El contador es= "+ cuenta);
//            
//        }
        System.out.println("Ingrese nombre: ");
        Scanner consola = new Scanner(System.in);
        var name= consola.nextLine();
        System.out.println("Ingrese numero:");
        var num = Integer.parseInt(consola.nextLine());
        
        for(int i=0 ; i < 10;i++){
            System.out.println("El contador es= "+i);
        }
        
    }
}
