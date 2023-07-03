package org.generation.functions.calculadora;

public class MainCalculadora {

	public static void main(String[] args) {
		/*Llamar métodos desde diferentes clases.
		 * 1. Crear una instancia de esa clase.
		 * 2. Invocar el método 
		 * */

		//Crear la instancia mediante la sentencia new + nombre de la clase, seguido de ()
		Calculadora calculadora = new Calculadora();
		//Utilizando la instancia (calculadora), se llaman los métodos con los argumentos
		double resultadoSuma = calculadora.sumar(20, 5);
		System.out.println("El resultado de sumar 20 + 5 es: " + resultadoSuma);
		double resultadoResta = calculadora.restar(58.6, 12.1);
		System.out.println("El resultado de restar es: " + resultadoResta);
		double resultadoMultiplicacion = calculadora.multiplicar(5, 3);
		System.out.println("El resultado de multiplicar es: " + resultadoMultiplicacion);
		double resultadoDivision = calculadora.dividir(9, 3);
		System.out.println("El resultado de dividir es: " + resultadoDivision);
		double raizCuadrada = calculadora.calcularRaiz(25);
		System.out.println("La raíz cuadrada de 25 es: " + raizCuadrada);
		
	}

}
