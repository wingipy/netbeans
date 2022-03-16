
import java.util.Scanner;

public class tiendaLibros {
    public static void main(String args[]){
        System.out.println("Titulo: ");
        Scanner consola=new Scanner(System.in);
        var nombre= consola.nextLine();
        System.out.println("Codigo: ");
        var cod=Integer.parseInt(consola.nextLine());
        System.out.println("Precio");
        var pre=Double.parseDouble(consola.nextLine());
        System.out.println("Envio gratis");
        var envio=Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(cod+" "+nombre);
        System.out.println(nombre+" "+ pre);
        System.out.println(nombre+" "+ pre+" "+envio);
        
    }
}
