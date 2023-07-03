package org.generation.functions;

import java.util.Scanner;

public class ClassString {

	public static void main(String[] args) {
		String texto1 = "Hoy es jueves y está nubladito";
		String texto2 = new String("Mañana es Viernes y espero que siga nublado");
		String texto3 = "Mañana es Viernes y espero que siga nublado";
		
		//Métodos de la clase String de la Java API
		System.out.println(texto1);
		System.out.println("La longitud de mi cadena texto1 es de: " + texto1.length());//Output: 30
		System.out.println("Vamos a devolver el valor indicado como índice y mostraremos el caracter: " + texto1.charAt(22));//Output: u
		System.out.println("Estoy comparando dos cadenas, texto1 y texto2: " + texto1.equals(texto2));//false
		System.out.println("Estoy comparando dos cadenas, texto2 y texto3: " + texto2.equals(texto3));//true
		System.out.println("Convirtiendo mi texto1 en mayúsculas: " + texto1.toUpperCase());
		System.out.println("Convirtiendo mi texto2 en minúsculas: " + texto2.toLowerCase());
		System.out.println("Si reemplazo las e de mi texto1 por 3, se ve así: " + texto1.replace('e', '3'));//Hoy 3s ju3v3s y 3stá nubladito
		
		//Solicitar al usuario un String y mostrar cada caracter en una línea
		/* Input: holis
		 * Output:
		 * h
		 * o
		 * l
		 * i
		 * s
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa un texto");
		String cadena = scanner.nextLine();
		scanner.close();
		
		for(int i = 0; i < cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
		
	}

}
