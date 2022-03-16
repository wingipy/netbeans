
public class Arreglos {
    public static void main(String[] args) {
        int numeros[] = new int[5];
        System.out.println("Arreglo 1: "+ numeros);
        
    //Editar cada indice del arreglo.
        numeros[0] = 10;
        numeros[1] = 14;
        numeros[2] = 12;
        numeros[3] = 20;
        numeros[4] = 30;
    // 1 forma de imprimir los indices de los arreglos
        System.out.println("Arreglo: " + numeros[0]);
        System.out.println("Arreglo: " + numeros[1]);
        System.out.println("Arreglo: " + numeros[2]);
        System.out.println("Arreglo: " + numeros[3]);
        System.out.println("Arreglo: " + numeros[4]);
        
    //2 forma de imprimir todos los datos de los indices ya modificados.
            for( int i=0; i< numeros.length; i++){
                System.out.println("Se imprimen: "+ numeros[i]);
            }
        

    }
}
