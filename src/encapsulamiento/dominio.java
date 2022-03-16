
package encapsulamiento;

public class dominio {
    private int idEmpleado;
    private String nombre;
    private int edad;
    public static int contador;
    
    
    public dominio(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
        dominio.contador++;
        this.idEmpleado=contador;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        dominio.contador = contador;
    }

    @Override
    public String toString() {
        return ":{" + "idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
