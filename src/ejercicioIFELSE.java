
import java.util.Scanner;

public class ejercicioIFELSE {
    public static void main(String args[]){
//        System.out.println("Ingresa el nombre: ");
//        Scanner consola = new Scanner (System.in);
//        var name = consola.nextLine();
//        System.out.println("Ingresa la nota: ");
//        var nota = Integer.parseInt(consola.nextLine());
//        if( nota < 10){
//            System.out.println( name + "Esta desaprobado");
//        } else if (nota > 10 && nota <=14){
//            System.out.println( name + " Esta en recuperación");
//        } else if (nota >= 15 && nota <= 16){
//            System.out.println( name + " Esta aprobado");
//        } else if( nota >16 && nota <= 20){
//            System.out.println(name + " Es sobresaliente");
//        }
//        else{
//            System.out.println("No es valido el dato ingresado");
//        }
        
        
        //SWITCH
   
    
        System.out.println("Ingrese el nombre del mes en el que se encuentra: ");
        Scanner consola = new Scanner(System.in);
        var mounth= consola.nextLine();
        
    var estacion="Desconocido";
    
    switch (mounth){
        case "Enero": case "Febrero": case "Marzo":
            estacion = "Invierno";
            break;
        case "Abril": case "Mayo": case "Junio":
            estacion = "Primavera";
            break;
        case "Julio":case "Agosto": case "Septiembre":
            estacion = "Verano";
            break;
        case "Octubre": case "Noviembre" : case "Diciembre":
            estacion = "Otonio";
            break;
            
        default: //puede servir como caso final o como caso contrario
           System.out.println("No conincide con ningun mes"); 
    }
        System.out.println("La estación actual es: "+estacion);
    
    }
    
}
