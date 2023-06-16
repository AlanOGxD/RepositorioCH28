/* Módulo de exportación.
module.exports ... es una propiedad especial de NodeJS que se utiliza para exportar valores (funciones, variables) o módulos para quue puedan ser utilizados en otros archivos o módulos de nodeJS.
*/

module.exports = function(numero){
    (numero % 2 === 0) ? console.log(`El número ${numero} es par`) : console.log(`El número ${numero} es impar`);
}
