
package clases1;

public class operador {
    int a;
    int b;
    
    //CONSRUCTOR
    
public operador(){
    System.out.println("Es un constructor");
    //por default a los enteros da 0
}
    
public void suma( int a, int b){ //metodo 1, si lleva un void no necesita retornar
    int sumado= a + b;
    System.out.println("La suma es: "+ sumado);
}

public void muestra( int a, int b){
    int resta = a - b;
    System.out.println("La resta es: "+ resta);
}
public int retornando(int a, int b){ //metodo 2
    int retornando= a + b;
    return retornando;
}

public int argumentos(int args1, int args2){ //metodo 3
    this.a=args1; //se frecomeinda usar this para referirse a un atributo de la clase dentro del metodo 
    this.b=args2;
//    return this.retornando();
return a + b;
}
}
