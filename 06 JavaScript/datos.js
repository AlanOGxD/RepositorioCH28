// TIPOS DE DATOS Y VARIABLES EN JS

/*

Declaración de variables

var: utilizamos esta palabra reservada para variables globales - que se pueden usar a lo largo de todo
nuestro código

let: utilizamos esta alabra reservada para variables locales - se pueden utilizar en un bloque
específico de código

const: esta palabra reservada la utilizamos para datos o información que no pueden cambiar su valor

var nombreDeVariable = x;


*/

// Tipos de Dato numérico (Number)

/*
Los tipos de dato numérico se expresan sin comillas
Se pueden trabajar enteros, decimales, positivos, negativos

*/

var edad = 22;
var altura = 1.76;
var añoDeNacimiento = 2001;
var diaDeLaSemana = 5;

var edadTexto = "22";

var nuevaEdad = Number(edadTexto);


// Tipo de Dato cadena de texto (string)

/*
Los tipos de datos string o cadenas de texto utilizan
comillas dobles o sencillas para asignar un valor


Son un tipo de dato sumamente flexible, sin embargo,
hay que utilizarlos con cuidado.

*/

var nombre = "Fernando";
var ciudad = "CDMX";
var colorFav = 'negro';

var edadString = String(edad);


// Tipo de Dato booleano (boolean)

/*

Los tipos de dato Booleanos solo arrojan 2 resultados

true
false

*/

var esRegio = false;
var escuchaMusica = true;

var condicion = Boolean(10 < 5); //False

var nuevaVariable = null;


const pi = 3.141592;


/////////////////////////////////////////

// Arrays y objetos

/*

Array, también conocido como Arreglo, es un tipo
de dato que pertenece a JS, en el cual
almacena una coleccion de elementos de manera
ordenada

Primer elemento = indice 0.
Hasta n cantidad de indices.


*/

var ejemploDeArray = ["Saludos", "Que onda", "Que hay", "Buenos días"];
var otroArray = [34, 254, 117, 6, 321];

/*

Objetos, los encontramos como Object
Son tipos de dato similares a los Arrays, sin embargo
NO SON LO MISMO y su estructura y semántica indican al
motor de JS del navegador como trabajar con estos 
elementos

key = llave
value = valor
No tienen un orden
Formato JSON

*/

var ejemploDeObjeto = {
    nombre: "Fernando",
    apellido: "Aguilar",
    edad: 22,
    esEstudiante: true,
};
