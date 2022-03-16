// //Formas de declarar una variable y los tipos de datos
// var recipiente = "Pedro"; -usa toda la variable global
// let name = "carlos"; - usa solo una parte de la variable
// const numer = 12; - una vez definida no cambia

var namee = prompt("Escribe tu nombre: ")

// document.write("Hola "+ namee)

let numero = 12, numero2 = 3, numero3 = 39, numero4 = 43;
var numero5 = "12";

op_logicos = (numero<numero2 && numero2 > numero3);

extra = numero === numero2; //pregunta si son extremadamente igual ( valor y contenido)
extra1 = numero == numero5; //pregunta si es igual el contenido
extra2 = numero != numero3; //pregunta si es diferente el contenido
extra3= numero !== numero2; //pregunta si es extremadamente diferente
extra4= numero ** numero2; //exponente
extra5= --numero; //decremento 
extra6 =  ` hola ${namee} textoo`; //concatenación correcta dentro de programas

 document.write(extra6);
