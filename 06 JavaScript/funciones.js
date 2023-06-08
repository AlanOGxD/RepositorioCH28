// Hoisting (elevación)

/*

El hoisting es un concepto fundamental sobre las
variables y funciones dentro de JS, el cual, nos explica el 
proceso de ejecucuión de estas mismas.

Hoisting es el comportamiento en JavaScript donde 
las declaraciones de variables y funciones se 
mueven al principio del alcance antes de la 
ejecución del código.

Es importante que mencionar es que podemos utilizar
tanto variables como funciones sin haberlas declarado en el código
previamente.

La principal razón del hoisting es brindar flexibilidad 
en la forma en que se escribe el código y permitir
que las declaraciones de variables y funciones se 
ubiquen en diferentes partes del flujo de código 
sin generar errores de referencia.

console.log(x);
var x = 117;
console.log(x);

https://developer.mozilla.org/es/docs/Glossary/Hoisting
*/

//Scope (ámbito o mira)



/*

El término scope se refiere al ámbito en el que
una variable, función y otros elementos tienen
alcance dentro del programa, es decir, en que partes
del código se puede hacer referencia a una variable
o función y/o acceder a esta misma


Los ámbitos dentro de JS son los siguientes:

Global : las variables declaradas de manera
global son accesibles en cualquier parte del
código.

Función o locales: las variables declaradas
de manera local solo se puede acceder a ellas
dentro de la función a la que pertenecen.

Bloque: las palabras reservadas let y const son
esenciales para entender el ámbito de bloque de
una variable, ya que cualquier espacio delimitado
por llaves {} le darán un ámbito o uso ilimitado
dentro de ese bloque de llaves

https://developer.mozilla.org/es/docs/Glossary/Scope
*/

// Arreglos (Array)

/*

Se trata de un almacenamiento de elementos
de manera ordenada, este orden comienza por
el índice 0 hasta n cantidad de índices

Su uso se centra en las colecciones ordenadas
de elementos


https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Global_Objects/Array
*/

    let ejemploArray = [36, 42, 57, 33];
    ejemploArray[2];
    let segundoEjemploArray = ["que onda", "hola", "saludos", "que hay"];

// Objetos (Object)

/*

Es otro de los tipos de dato que encontramos en JS
Similares a los arrays, pero con diferencias
significativas tanto en su estructura, como su
uso, etc.

Los objetos almacenan datos estructurados, no como
tal colecciones ordenadas de elementos, así mismo,
hay métodos específicos para consultar datos
dentro de un objeto

A cada valor dentro de un objeto se le asigna una clave


https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Global_Objects/Object
*/

let ejemploObjeto = {

    nombre : "Fernando",
    apellido : "Aguilar",
    edad : 22,
    signoZodiacal : "Piscis",
    esEstudiante : true,

};



// Funciones

// Estructura básica de una función

/*

Qué es una función?

Es un conjunto de instrucciones que se puede invocar a través
del nombre que le asignemos


Estructura básica

palabra reservada - function
nombre de la función - nombreFuncion
parámetros - (parámetro n)
bloque de código - {}

https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Functions
*/

// Ejemplo Hola Mundo

function helloWorld() {
    let greeting = "Hello World !";
    //console.log(greeting);
    return greeting;
}

helloWorld();

/*

Cómo invocar una función?

De la misma manera en que invocábamos o mandábamos a llamar
a nuestras variables, solo que tendrá una ligera diferencia

nombreFuncion();

Se puede colocar al final de nuestro bloque de código
o directamente desde la consola

Característica principal de una función

Toda función retorna un valor, para esto, basta colocar
al final de una instrucción la palabra reservada
return, seguida del parámetro a devolver.

Ejemplo
return variable, parametro, etc;

Dentro de una función, se pueden colocar tantas
instrucciones como sean necesarias
*/

///////////////////////////////////////////////

// Parámetros

/*

Una función puede recibir 0 o n cantidad de
parámetros, con los cuales comienza a trabajar

*/

// Ejemplo Hello World con parámetros

function helloAgain(name, age) {
    // console.log("Your name : " + name);
    // console.log("Your age: " + age);
    let message = "Hello World !, my name is " + name + " and I'm " + age + " y/o";
    return message;
}

let newMessage = helloAgain("Fernando", 22);
console.log(newMessage);


////////////////////////////////////

// Funciones anónimas

/*

Las funciones anónimas nos permiten no asignarle a un nombre
un conjunto de instrucciones que deseemos sin necesidad
de asociarlo

Esto quiere decir que, si queremos desarrollar
una función, sin necesidad de asignarle un nombre
para no tener la necesidad de invocarla a través de 
este nombre

Sintaxis

Se coloca un doble paréntesis ()() para aislar la función


*/

// Ejemplo 1 de funcion anonima
(
    function () {
        let message = "Hi there";
        //console.log(message);
        return message;
    }
)()


// Ejemplo 2 de funcion anonima
let saludando = function (nombre) {
    let mensaje = "Hola, " + nombre;
    return mensaje;
}


///////////////////////////////////////////

// Callbacks

/*
Una función puede recibir funciones con parámetros
tales como strings, booleanos, números, objetos, etc.

Sin embargo una función también puede recibir una función
como parámetro, lo cual es una práctica bastante común
en el desarrollo con JS.

A esto le llamamos función callback, las cuales van 
ampliamente relacionadas con las funciones anónimas

Son muy utilizados gracias a su apoyo para realizar
y ejecutar procesos asíncronos, es decir,
permiten la ejecución de código después de que se 
haya completado una operación, como una solicitud 
de red, una lectura de archivo o una respuesta de
una base de datos. 

Se utiliza mucho cuando trabajamos con Jquery

https://developer.mozilla.org/es/docs/Glossary/Callback_function

*/

/*

Declaración:

palabra reservada function
nombre de función: funcionCallBack
parámetros (datoAleatorioA, datoAleatorioB, funcion1, funcion2)

*/
function funcionCallBack(parametroA, parametroB, funcionSumarCallBack, funcionRestarCallBack) {

    //Operación a realizar con parámetro a y b
    let suma = parametroA + parametroB;

    //Otra operación a realizar con parámetro a y b
    let resta = parametroA - parametroB;

    //Función sumar como parámetro
    //Recibe como parámetro suma declarado anteriormente
    funcionSumarCallBack(suma);

    //Función restar como parámetro
    funcionRestarCallBack(resta);
}

//Invocación de funcionCallBack, con funciones como parámetros
//Sintaxis de funcion anonima, con parametro resultado, el resultado ya
//se encuentra contenido dentro del llamado realizado en la función
funcionCallBack(8, 6, function (resultado) {
    console.log("Suma", resultado);
}, function (resultado) {
    console.log("Resta", resultado);
});

///////////////////////////////////////////

// Promesas

/*
Esencialmente, una promesa es un objeto devuelto 
al cual se adjuntan funciones callback, en lugar 
de pasar callbacks a una función.

https://developer.mozilla.org/es/docs/Web/JavaScript/Guide/Using_promises
*/

///////////////////////////////////////////

// Funciones flecha | Fat arrow | Funciones Lambda

/*

Las funciones flecha se identifican por el símbolo
=>, simplifican la sintaxis de una función normal

Algo importante que mencionar es que su uso es limitado
y no se puede utilizar en todas las situaciones.

primero se declara una nueva variable, ya sea let,
var o const, después, se coloca el parámetro
que recibe la función y posteriormente elsímbolo =>,
que indica lo que la función va a retornar

Si envío más de un parámetro, tengo que encapsularlo
entre (datoA, datoB) y si quiero realizar más operaciones,
las encapsulo dentro de 

https://developer.mozilla.org/es/docs/Web/JavaScript/Reference/Functions/Arrow_functions
*/

//Declaración básica de una función flecha o lambda
let funcionFlecha = parametro => "Hola " + parametro;
console.log(funcionFlecha("Fernando"));


//Encapsulamiento para realizar multiples operaciones
let encapsular = (dato1, dato2) => {
    let dato3 = 8;
    return dato1 + dato2 + dato3;
}

//Declaración que no recibe parámetros
let sinParametro = () => {
    return "funcion lambda sin parametros";
}


//////////////////////////////////

// Ejercicios

/*

Realizar una función que realice o saatisfaga los siguientes escenarios

Realizar en manera de función general y funcion flecha.

1. Calcular el cuadrado de un número.

2. Escribir un código que convierta de grados celsius
a grados farenheit

3. Realizar una función que calcule el valor de
Voltaje, recibiendo como entradas o parámetros
Resistencia y Corriente.

4. Elaborar una función que calcule el volumen de
un cubo, recibiendo como dato de entrada Lado.

5. Calcular el área de un triángulo

6. Calcular el volumen de una esfera

7. Convertir una cadena de texto a mayúsculas, usando el método .toUpperCase()

*/
