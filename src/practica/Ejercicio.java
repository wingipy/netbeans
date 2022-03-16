
package practica;

import java.util.Scanner;

public class Ejercicio {
    static public void main(String args[]){
        int casa = 4;
        System.out.println(casa);
        
        //Las comillas deben ser dobles para que sean cadenas de texto
        
      var cada = "Claudia";
      System.out.println(cada);
      
      //concatenacion
      
      var cara = 4;
      var caza = 78;
      System.out.println("Es igual ha: " + (cara+caza));
      System.out.println("es igual ha " + cara+caza);
      System.out.println(cara+caza +" "+ "es igual ha");
      
  //comandos basicos
  
  var nombre = "Claudia";
  
  System.out.println("Nueva linea: \n" +nombre); //Imprimer eso primero y aparte la variable
  System.out.println("Tabulador: \t" +nombre); //Imprime dejando un tab de espacio (margen)
  System.out.println("Retroseso: \b\b" +nombre); //Imprime sin dejar espacio 
  
  // Clase scanner aprener de memoria
  
  System.out.println("Escribe un numero: ");
  Scanner consola = new Scanner(System.in);
  var a =Integer.parseInt(consola.nextLine());
  System.out.println("Escribe tu otro numero:");
  var b = Integer.parseInt(consola.nextLine());
  System.out.println("La suma de lo dos numeros es: "+(a + b));
    }
}
