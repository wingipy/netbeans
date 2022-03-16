
package clases;

public class person1 {
    public static void main(String args[]){
        persona person1;
        person1 = new persona(); //para definir el objeto se crea un nuevo desde la clase persona ya creada
//        ya creado el objeto desde la clase, te apareceran los atributos y metodos
//         que previamente ya creaste.
        person1.name = "Claudia";
        person1.fullname = "Guadalupe";
        person1.DNI = 72486626;
        person1.telefono = 944990468;
        person1.desplegarInfo();
        
//      se pueden crear más de un objeto en la clase 

        persona person2 =new persona();
        person2.name ="Lola";
        person2.fullname="Perez";
        person2.DNI = 9876543;
        person2.telefono= 987897878;
        person2.desplegarInfo();
    }
    
}
