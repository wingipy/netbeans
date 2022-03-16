
package ejercicioCaja;


public class Ejercicio {
    int alto;
    int ancho;
    int prof;
    
    public Ejercicio(){
        System.out.println("Constructor vacio");
    }
    public Ejercicio(int arg1,int arg2,int arg3){
        arg1=2;
        arg2=3;
        arg3=5;
        System.out.println("Constructor con args " + arg1+arg2+arg3);
    }
    public void calculando(int num1, int num2,int num3){
        this.alto=num1;
        this.ancho=num2;
        this.prof=num3;
       int calcular = num1*num2*num3;
        System.out.println("La dimension de la caja es "+ calcular);
    }
}
