package org.generation.exceptions;

public class Exceptions {
	
	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {

		/*En Java las excepciones se manejan mediante estructuras de control, es decir, para capturar y manejar errores que pueden ocurrir durante la ejecución del código, podemos establecer mensajes personalizados al usuario
		 * try-catch.
		 * -- try. estructura de control que puede generar una excepción. Si se produce una excepción dentro del bloque try, el flujo de ejecución se desvía al bloque catch.
		 * -- catch. Contiene el código que se ejecuta cuando se produce la excepción
		 * 
		 * Sintaxis
		 * try{
		 * 		//Código 
		 * }catch(ExceptionName e1){
		 * 		//Bloque de código
		 * }
		 * finally -- Se ejecuta siempre para mostrar que el programa ha finalizado
		 * */
		//Controlar excepción
		try {
			int resultado = dividir(10, 0);
			System.out.println(resultado);
		}catch(ArithmeticException e) {
			System.out.println("Error: no puedes dividir entre 0");
		}finally {
			System.out.println("Programa finalizado");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
