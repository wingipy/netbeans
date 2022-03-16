
public class operadorTernario {
    public static void main(String args[]){
        //Se usa para simplificar una condicional de if y else
        //Tiene 3 partes, declara variable (var, int, ...), condición verdadera (?), condición falsa (:)
        
        var resultado =(5 < 6) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        //PRECEDENCIA DE OPERADORES (sesion 4, grabación 32)
        
        //orden en el que se evaluan los operadores en una expresion que se usará en java
        // de izquierda a derecha y 
        
        var x = 5;
        var y = 8;
        var z = ++x + y--;
        
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
       var resultado2 = 4 + 5 * 6 / 3;
        System.out.println("resultado = "+ resultado);
        
        resultado2 = (4 + 5)* 6 / 3;
        
        System.out.println("resultado= "+ resultado2);
        
        
        
    }
}
