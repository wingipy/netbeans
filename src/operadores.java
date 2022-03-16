
public class operadores {
    public static void main(String args[]){
        
        //OPERADORES ARITMETICOS
        int a=5,b=10;
        var resultado = a + b; //se cambia el operador + - * / % 
        System.out.println("El resultado es: "+resultado);
        /*
        para usar la division debes asegurarte de definir bien los decimales con la letra D 
        para que no salga entero y error.
        */
        resultado= a % b;  //es un modulo
        System.out.println("resultado = " + resultado);
        
        if ( a % 2 == 0)
            System.out.println("Es par");
        else 
            System.out.println("Es impar");
        
        if ( b % 2 == 0)
            System.out.println("Es par");
        else 
            System.out.println("Es impar");
        
        //OPERADORES DE ASIGANCION
        
        a += 6; // a = a + 6 
        System.out.println("a = " + a);
        
        b -= 3; 
        System.out.println("b = " + b);
        
        //lo mismo pasa con * / % 
        
    }
    
}
