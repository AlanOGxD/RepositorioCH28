/* Tutorial para instalar un paquete de npm
1. Crear una carpeta con un archivo .js
2. Abrir la ubicación de nuestra carpeta en la terminal
3. Ejecutar alguno de los comandos siguientes:
    $ npm init ===> package propio
    $ npm init -y ===> package de npm existente
4. Instalar el paquete desde la línea de comandos. p.e. con el package colors sería:
    $ npm install colors
5. Importar el paquete desde el archivo main/index.js
6. Ejecutar el paquete mediante la terminal utilizando nodeJS
    $node archivo.js

*/

const colors = require('colors');

console.log(colors.green("Hola"));
console.log(colors.red.underline('i like cake and pies'));
console.log(colors.inverse('inverse the color'));
console.log(colors.rainbow('diomio como e posible este suceso!'));

colors.setTheme({
    silly: 'rainbow',
    input: 'grey',
    verbose: 'cyan',
    prompt: 'grey',
    info: 'green',
    data: 'grey',
    help: 'cyan',
    warn: 'yellow',
    debug: 'blue',
    error: 'red'
});

console.log("this is an error".error);