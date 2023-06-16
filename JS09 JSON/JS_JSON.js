/* Hoisting. Es un comportamiento especial en el cual las declaraciones de variables y funciones se mueven al principio de ámbito, es decir, antes de que se ejecute el código.
*/

//Ejemplo de hoisting en funciones
saludoGatito();

function saludoGatito(){
    console.log("Hola, soy un gatito");
};

/* JSON (JavaScript Object Notation), Notación de objetos de JS.
    Es un formato estándar ligero basado en texto y que nos sirve para representar datos estructurados basados en la sintaxis de JS.

    Es utilizado para transmitir datos en aplicaciones web, desde el usuario al servidor y viceversa.
*/
//Objeto común de JS
let laika = {
    nombre: "Laika",
    edad: 5,
    color: "café"
};

console.log(laika);
console.log(typeof(laika));

//Objeto JSON
let laikaJSON = `{
    "nombre": "Laika",
    "edad": 5,
    "color": "café"
}`;

console.log(laikaJSON);
console.log(typeof(laikaJSON));

/*Los JSON son útiles para transmitir datos a través de la red, pero deben ser convertidos a objetos nativos de JS para acceder a sus datos.

-- Serialización. Proceso para convertir un objeto en una secuencia de bytes o en una cadena de caracteres que puede ser almacenada o transmitida.

-- Deserealización. Proceso de tomar una secuencia de bytes o una cadena de caracteres serializados y convertirlos en un objeto en la memoria.
*/
//JSON
let sultan = `{
    "nombre": "Sultán",
    "edad": 4,
    "color": "Crema"
}`;

//Nativo JS 
let milaneso = {
    nombre: "Milaneso",
    edad: 7,
    color: "Blanco"
};

/* Para convertir (serialización y deserealización) los diferentes tipos de objetos (nativos y JSON), recurrimos a dos métodos de JS:
    - JSON.parse() analiza una cadena de texto como JSON, transformándolo
    - JSON.stringify() convierte un objeto de JS en una cadena de texto tipo JSON
*/

//Método parse(). De JSON a Object
let sultanTransformado = JSON.parse(sultan);
console.log(sultanTransformado);

//Método stringify(). De Object a JSON
let milanesoTransformado = JSON.stringify(milaneso);
console.log(milanesoTransformado);

/* Anidación de objetos en objetos*/
const employees = { employees : [
    {firstName: "Carlos", lastName: "Navarro", age:29},
    {firtName: "Jonathan", lastName: "Mendoza", age: 25},
    {firstName: "Nancy", lastName: "Pérez", age: 24}]
};
console.log(typeof(employees));
console.log(employees);

let employeesTransform = JSON.stringify(employees);
console.log(employeesTransform);
console.log(typeof(employeesTransform));

//RickAndMortyAPI
let rickSanchez = `{"id":1,"name":"Rick Sanchez","status":"Alive","species":"Human","type":"","gender":"Male","origin":{"name":"Earth (C-137)"}}`;

console.log(rickSanchez);
console.log(typeof(rickSanchez));
let rickSanchezObject = JSON.parse(rickSanchez);
console.log(rickSanchezObject);

// console.log(rickSanchezObject.gender);
// console.log(rickSanchezObject.origin);