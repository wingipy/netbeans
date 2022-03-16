
package encapsulamiento;

import encapsulamiento.dominio;

public class Encapsulamiento {
    
    public static void main(String[] args) {
        
        dominio empleado1 = new dominio("Anita",24);
        System.out.println("Empleado 1: "+ empleado1);
        
        dominio empleado2 = new dominio("Luciana",34);
        System.out.println("Empleado 2: "+ empleado2);
        
        dominio empleado3 = new dominio("Fabiano", 19);     
        System.out.println("Empleado 3: "+empleado3);
    }
    
}
