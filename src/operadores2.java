
public class operadores2 {
    public static void main(String args[]){
        //OPERADORES UNARIOS
         
        var a = 6;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var ab=true;
        var ba=!ab;
        System.out.println("ab = " + ab);
        System.out.println("ba = " + ba);
        
        // INCREMENTO
        // 1. PRE INCREMENTO
        
        var c = 2;
        var d = ++c;  //aumenta en 1 la unidad y los signos van antes de la variable
        System.out.println("c = " + c); //desde el ++ aumenta la variable ya definida de c= 3
        System.out.println("d = " + d);
        
        // 2. POST INCREMENTO
        
        var e = 8;
        var f = e++;  // desde la variable definida de e se le aumenta 1 (9) mientras que a f no se agrega (8) 
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        
        //DECREMENTO ES LO MISMO QUE EL INCREMETNO PERO EN REVERSO Y CON EL SIGNO -
        
        
        
        /*
        OPERADORES DE IGUALDAD 
        */
         int r=10, s=11;
         var numerthree = (r == s);
         System.out.println("numerthree = " + numerthree);
         
         //EN CADENAS
         
         var name= "Hola";
         var surname="Adios";
         var names = (name == surname); //Consulta la refecia de la variable, no el contenido
         System.out.println("names = " + names);
         
         var namees = name.equals(surname); // compara el contnido de la cadena con la expresion equals
         
         //OPERADORES DIFERENCIALES
         var numerfour = r != s; //puede o no llevar parentesis, se ejecuta de derecha a izquierda
         System.out.println("numerfour = " + numerfour);
         
         
         
         
        
    }
}
