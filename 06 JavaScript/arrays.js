/* ARRAYS
* Recursividad. Se refiere a la capacidad de una función para llamarse así misma dentro de su propio cuerpo y resolver un problema de manera repetitiva.
*/

//Factorial. Teniendo un conjunto de números (1 - 5) se multiplican cada uno hasta llegar al número final
//5! = 1 * 2 * 3 * 4 * 5 = 120
function factorial(n){
    if(n === 0){
        return 1;
    }
    return n * factorial(n - 1);
}
console.log(factorial(5));

/* 
--- Creando arrays
Sintaxis
    const array_name = [item1, item2, item3...];
*/

const carros = [
    "Nissan", 
    "Kia", 
    "Jeep", 
    "Mazda", 
    "Volkswagen"
];
console.log(carros);

//Array vacío
const computadoras = [];
console.log(computadoras);
//Agregar elementos a mi array vacío
computadoras[0] = "Dell";
computadoras[1] = "hp";
computadoras[2] = "Mac";
computadoras[3] = "Toshiba";
console.log(computadoras);

//Otra manera de crear arrays
const celulares = new Array("Samsung", "Apple", "Motorola", "Huawei", "LG");
console.log(celulares);

//Longitud de un array
console.log(celulares.length);
// Guardándolo en una variable
let longitudCelulares = celulares.length;
console.log(longitudCelulares);

//Acceso a los elementos del Array. Para acceder hacemos referencia al número de indice del array
console.log(celulares[0]);
console.log(celulares[2]);
console.log(celulares[5]);//undefined
console.log(celulares[3]);

//Acceder al último elemento del array.
let ultimoElementoCelulares = celulares[celulares.length-1];
console.log(`El último elemento de mi Array celulares es ${ultimoElementoCelulares}`);

//Modificar un elemento del array mediante indices
const listaDeCompras = ["Jamón", "Queso", "Yogurt", "Tortillinas", "Pan"];
console.log(listaDeCompras);
    //Cambiar el yogurt por yogurt griego oikos
listaDeCompras[2] = "Yogurt griego oikos";
console.log(listaDeCompras);

// Arreglos multidimensionales o arreglos de arreglos
console.log("*Arreglos multidimensionales o arreglos de arreglos*");

/*Platillos, paises, menu
    tacos de pastor, México
    arepas, Venezuela
    sushi, Japón
    pizza, Italia
*/
const platillos = ["tacos de pastor", "arepas", "sushi", "pizza"];
const paises = ["Japón", "Venezuela", "Italia", "México"];

const menu = [platillos, paises];
//Traer información de los dos arrays
console.log(menu[1][3]);

//Output: En Japón se come sushi
console.log(`En ${menu[1][0]} se come ${menu[0][2]}`);

/* ==== Métodos de Arrays ====
-- Métodos de cola (queue). Los métodos de cola implican agregar elementos al final del array y eliminar elementos del principio del array. Sigue el principio FIFO (First-In-First-Out).
    * push
    * shift
    * unshift

-- Métodos de pila (stack). Implican agregar elementos al final del array y eliminar elementos del final del array. Sigue el principio LIFO (Last-In-First-Out).
    * push
    * pop
*/
console.log("***** Métodos de Arrays*****");
//Array de la CH28
const ch28 = ["Mari", "Andrea", "Pessy", "Ana Fer", "Ingrid", "Blanca", "Pau", "Nancy", "Pessy"];
console.log(ch28);

//--- indexOf() retorna el primer indice en el que se puede encontrar un elemento dado en el array, o retorna -1 si el elemento no está presente.
console.log(ch28.indexOf("Pessy"));//output: 2
console.log(ch28.indexOf("Yareri"));//output: -1
console.log(ch28.indexOf("Pessy", 3));//output: 8
console.log(ch28.indexOf("Andrea", 2));//output: -1

//--- pop() Elimina el último elemento de un Array
let popCh28 = ch28.pop();
console.log(ch28);

//--- push() Agrega un nuevo elemento al final de un array
let pushCh28 = ch28.push("JuanK");
console.log(ch28);

//--- splice() Elimina uno o varios elementos a partir de su posición
//let spliceCh28 = ch28.splice(8,1); //A partir del indice 0 voy a eliminar un elemento
console.log(ch28);

//* replaced... Reemplaza uno o varios elementos a partir de su posición
let replacedCh28 = ch28.splice(8, 1, "Yare");
console.log(ch28);

//--- unshift() añadir un elemento al principio de un array
let unshiftCh28 = ch28.unshift("Osvaldo");
console.log(ch28);

//--- shift() elimina un elemento del principio del array
let shiftCh28 = ch28.shift();
console.log(ch28);

//--- slice() elimina elementos anteriores a la posición definida sin modificar el array original
let sliceCh28 = ch28.slice(7);
console.log(ch28);
console.log(sliceCh28);

let agregandoMagali = ch28.unshift("Magali");
console.log(ch28);

//--- forEach. Recorre el array, itera sobre cada elemento y ejecuta unafunción de devolución para cada elemento
ch28.forEach(elemento => console.log(elemento));

//--- sort() Ordenamiento de arrays de A a Z
let sortCh28 = ch28.sort();
console.log(ch28);

//--- reverse() cambia el sentido del ordenamiento
let reverseCh28 = ch28.reverse();
console.log(ch28);

/***** OBJETOS EN PROGRAMACIÓN
Un automóvil es un objeto en la vida, ya que tiene propiedades y métodos específicos.

--- Propiedades del automovil
nombre
modelo
número de llantas
peso
color
etc...

--- Métodos
frenar
avanzar
arrancar
etc...

A pesar de tener propiedades similares, los valores de dichas propiedades son diferentes entre cada uno.
También los métodos son similares, se van a ejecutar en momentos diferentes.
Todos los objetos poseen propiedades y métodos con valores diferentes

Sintaxis
    const object = {key1(property1): value1, key2(property2): value2, key3(property3): value3, ...};
*/
//Objeto en JavaScript
const automovil = {
    marca: "Kia",
    clase: "Forte",
    peso: 900,
    color: "Gris óxido",
    modelo: 2022,
    llantas: 4,
    puertas: 4
};
console.log(automovil);

//Acceder a las propiedades y valores de un objeto.
let marcaAutomovil = automovil.marca;
console.log(marcaAutomovil);

console.log(automovil.modelo);