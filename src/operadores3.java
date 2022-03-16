
import java.util.Scanner;

public class operadores3 {
    public static void main(String args[]){
        //OPERADORES RELACIONALES < O > 
        
        int a = 4, b=7;
        var c = (a >=b); // se ccambia la variable o el signo
        System.out.println("c = "+ c);
        
        var d = (a <= b);
        System.out.println("d = " + d);
        
        if (a % 2 ==0){ //se cambia la variable
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        
        var edad = 13;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var name = consola.nextLine();
        System.out.println("Escribe tu edad: ");
        var age= Integer.parseInt(consola.nextLine());
        var numer = 18;
       
        if (age >= numer){ //tambien se puede usar un numero, pero con cuidado el orden
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }


    }
}
