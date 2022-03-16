
package encapsulamiento2;

import encapsulamiento.Empleado; //se importa el paquete 

public class Empleado2 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carla",45,false); //se crea el objeto llenando con los atributos
        
//se llama a los metodos
        empleado1.getNombre();
        System.out.println("Nombre enviado: "+empleado1.getNombre());
        empleado1.setNombre("Josefina");
        System.out.println("Nombre cambiado con el set: "+empleado1.getNombre());
        
        empleado1.getEdad();
        System.out.println("Edad enviada: "+ empleado1.getEdad());
        empleado1.setEdad(15);
        System.out.println("Edad modiifcada con set: "+ empleado1.getEdad());
    }
}
