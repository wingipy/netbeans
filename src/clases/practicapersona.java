
package clases;

public class practicapersona {
    public static void main(String[] args) {
        persona persona2= new persona();
        persona2.name="Lucia";
        System.out.println("El nombre original es: "+persona2.name);
        //le otorga el nombre de lucia primero, envia al metodo cambiar y es reemplazado por el nombre de Andrea
        cambiar(persona2);
        System.out.println("Nombre cambiado: "+persona2.name);
    }
    public static void cambiar(persona persona){
        persona.name="Andrea";
    }
}
