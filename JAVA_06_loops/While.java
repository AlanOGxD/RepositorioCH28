package org.generation.loops;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		/*
		 * La declaración While ejecuta continuamente un bloque de código mientras se cumpla una condición particular. Cuando no se cumple se termina el ciclo.
		 * while(expresion){
		 * 		(declaraciones)
		 * }
		 */

		int cuenta = 1;
		while(cuenta < 11) {
			System.out.println("La cuenta es: " + cuenta);
			cuenta++;
		}
		
		//Crear un programa que solicita al usuario un número, el cual será tomado como el número final de una cuenta que inicia en 1. Debe mostrar en consola la cuenta del 1 hasta el número que el usuario proporcionó.
		/*
		 * 1. Importar un Scanner
		 * 2. Mensaje al usuario para pedir el número (contexto)
		 * 3. Almacenar el Scanner en una variable (numFinal)
		 * 4. Inicializar un contador (contador) en 1
		 * 5. Iniciar el while. La condición es que mientras contador <= numFinal, imprimer el valor actual del contador e incrementar con un operador de incremento (++);
		 * 6. Mostrar un mensaje de finalización al usuario 
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe un número, que servirá como valor final de una cuenta.");
		
		int numFinal = scanner.nextInt();
		int contador = 1;
		
		while(contador <= numFinal) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("Aquí está tu cuenta");
		scanner.close();
		
	}

}
