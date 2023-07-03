package org.generation.functions;

public class Refactorizacion {
	/*
	 * Refactorizar. Es el proceso de modificar el código fuente de un programa para mejorar su estructura interna y su diseño, todo esto sin cambiar su comportamiento.
	 * Refactorizar = Reescribir
	 * OBJETIVO: Mejorar la calidad del código sin introducir errores
	 * */
	
	//Método que reciba un argumento (int) y que determine si es par o impar
	/*public static void parImpar(int numero) {
		if(numero % 2 == 0) {
			System.out.println(numero + " es par");
		}else {
			System.out.println(numero + " es impar");
		}
	}*/
	//Refactorización de la sentencia if-else del método parImpar a un operador ternario 
	public static void parImpar(int numero) {
		String refactorizado = (numero % 2 == 0)? " es un número par" : " es un número impar";
		System.out.println(numero + refactorizado);
	}
	
	public static void main(String[] args) {
		parImpar(55);
	}
	
	
	
	
}
