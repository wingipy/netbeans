
package encapsulamiento;

public class Empleado {
    public String nombre;
    private int edad;
    private boolean retirado;

    
    //constructor
public Empleado(String nombre, int edad, boolean retirado){
    this.nombre=nombre;
    this.edad=edad;
    this.retirado=retirado;
}
//METODO DEL ATRIBUTO NOMBRE
public String getNombre(){ //envia info
    return this.nombre;
}
public void setNombre(String nombre){ //modifica
    this.nombre = nombre;
}
//METODO DEL ATRIBUTO EDAD
public int getEdad(){
    return this.edad;
}
public void setEdad(int edad){
    this.edad = edad;
}
//METODO DEL ATRIBUTO RETIRADO
public boolean isRetirado(){
    return this.retirado;
}
public void setRetirado(boolean retirado){
    this.retirado=retirado;
}
}
