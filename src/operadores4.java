
public class operadores4 {
    public static void main(String args[]){
        //OPERADORES CONDICIONALES
         var numer=50;
         var maximvalue=20;
         var minimvalue=0;
         var resultado = numer <= maximvalue && numer >= minimvalue;
         // && es un y en una condicion, 
         // si uno de los enunciados es falso todo será falso
         System.out.println("resultado = " + resultado);
         
         var vacaciones=true;
         var descanso=false;
         
         if (vacaciones || descanso){ //es la variables de o para una condición
        System.out.println("Duerme hasta tarde" );
    }
         else{
                 System.out.println("No puede dormir hasta tarde" );
                 }
       
    }
    
}
