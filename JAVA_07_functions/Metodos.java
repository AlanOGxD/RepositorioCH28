package org.generation.functions;

public class Metodos {
	
	/* 1. Métodos que no retornan nada (void).
	 * Realizan ciertas acciones o tareas, pero no devuelven un resultado utilizable. Posee un tipo "void"*/
	public static void imprimirAsteriscos() {
		System.out.println("*********************************");
	}
	
	/*2. Métodos que returnan (return). Solicitan argumentos y si devuelven algo.
	 * Se definen con un tipo de dato en su declaración. Realizan una tarea o acción y devulven un resultado que puede ser utilizado en otras partes del programa. Para devolver el valor, se utiliza la palabra reservada "return"
	 */
	public static int sumar(int num1, int num2){
		int operacionSuma = num1 + num2;
		return operacionSuma;
	}
	
	/*3. Métodos combinados. Combinan parámetros (String, int, double)
	 * Son del tipo return y reciben argumentos.
	 */
	public static Object informacionPersona(String nombre, String apellido, int edad) {
		return nombre + apellido + edad;
	}
	
	//Método de ingredientes para preparar alambre (pollo, pimiento, tocino, queso, piña???)
	public static String prepararAlambre(String ingrediente1, String ingrediente2, String ingrediente3, String ingrediente4, String ingrediente5) {
		return ingrediente1 + ingrediente2 + ingrediente3 + ingrediente4 + ingrediente5;
	}
	
	//Métodos para calculadora que reciban dos argumentos double(sumar, restar, multiplicar, dividir)
	public static double sumar (double x, double y) {
		return x + y;
	}
	
	public static double restar (double x, double y) {
		return x - y;
	}
	
	public static double multiplicar (double x, double y) {
		return x * y;
	}
	
	public static double dividir (double x, double y) {
		return x / y;
	}
	
	public static double calcularRaiz(double x) {
		return Math.sqrt(x);
	}
	
	public static void main(String[] args) {
		imprimirAsteriscos();//Método 1
		//int operacion = sumar(45, 129) + sumar(22, 22);
		//System.out.println(operacion);
		System.out.println(sumar(45, 129));//Método 2
		System.out.println(informacionPersona("Daniel ", "Maldonado ", 36));//Método 3
		imprimirAsteriscos();
		System.out.println("Hoy haremos alambre al estilo Pessy y Pau. Necesitamos: " + prepararAlambre("res ", "pimiento ", "tocino ", "queso ", "piña "));
		imprimirAsteriscos();
		//Invocando a nuestros métodos de calculadora
		System.out.println(sumar(2.3, 3.1));
		System.out.println(restar(5.9, 8.5));
		System.out.println(multiplicar(87.2, 3));
		System.out.println(dividir(100, 10));
		System.out.println(calcularRaiz(9));
		
		
	}
	
	
	
	
	
	
	
}
