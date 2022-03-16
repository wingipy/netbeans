
import java.util.Scanner;


public class conversionDatos {
    public static void main(String args[]){
        var edad=Integer.parseInt("3"); //Pero la edad es un numero! 
        //usando el metodo parse se convierte y guarda el nuevo valor
        
//        var num = Byte.parseByte("45");
//        System.out.println(num);
//        var num1= Short.parseShort("2");
//        System.out.println(num1);
//        var num2= Long.parseLong("12");
//        System.out.println(num2);
//      
//        var num3= Double.parseDouble("555.9");
//        System.out.println(num3);  
//        var num4=Float.parseFloat("44");
//        System.out.println(num4);
        
        
        System.out.println("Escribe un numero: ");
        Scanner consola = new Scanner(System.in);
        var num11 = Integer.parseInt(consola.nextLine());
        System.out.println("Escribe otro numero: ");
        var num12 = Integer.parseInt(consola.nextLine());
        System.out.println("La suma de ambos numeros es: "+ (num11+num12));
        

        
    }
    
}
