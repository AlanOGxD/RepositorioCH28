package org.generation.letras;

public class Letras_Main {

	public static void main(String[] args) {
		//instanciar objetos (Lector y ContadorCaracteres)
		Lector lector = new Lector();
		lector.muestraMensaje("Escribe un texto: ");//Mensaje de contexto
		String palabra = lector.leeEntrada();//Texto introducido por el usuario
		
		ContadorCaracteres contador = new ContadorCaracteres();
		int numeroVocales = contador.contarVocales(palabra);
		System.out.println("Hay " + numeroVocales + " vocales");
		
		int numeroNumeros = contador.contarNumeros(palabra);
		System.out.println("Hay " + numeroNumeros + " números");
		
		int numeroConsonantes = contador.contarConsonantes(palabra);
		System.out.println("Hay " + numeroConsonantes + " consonantes");
		
		int numeroSimbolos = contador.contarSimbolos(palabra);
		System.out.println("Hay " + numeroSimbolos + " simbolos");
	}

}
