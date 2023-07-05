
public class Logico {

	public static void main(String[] args) {
		
		// Operadores logicos
		
		/*
		 * Retornan unicamente 2 resultados
		 * 	true, false
		 * 
		 *  And, Or, Not
		 *  
		 *  
		 *  
		 *  And &&
		 * 
		 * El operador logico And && evalua 2 o mas elementos y
		 * si todos se cumplen o son true, devuelve true
		 * 
		 * 
		 * 
		 * Or ||
		 * 
		 * El operador logico Or || evalua 2 o mas elementos y si uno
		 * de ellos se cumple, el resultado es true
		 * 
		 * True false
		 * False true
		 * 
		 * 
		 * Not !
		 * 
		 * El operador logico Not ! niega el valor original de una sentencia
		 * booleana
		 * 
		 * */
		
		/*
		 * 
		 * >, >=
		 * <, <=
		 * ==
		 * !=
		 * 
		 * 
		 * */
		
		
		int numeroUno = 5;
		int numeroDos = 7;
		
		
		// Declaracion de una sentencia booleana
		
		boolean primerEjemplo = numeroUno == numeroDos; //true
		System.out.println(primerEjemplo);
		
		// Segunda declaracion booleana (AND &&)
		boolean segundoEjemplo = (numeroUno < numeroDos) || (numeroDos > numeroUno); //True
		System.out.println("Res: " + segundoEjemplo);
		
		/*
		 * 
		 * Tabla de verdad AND &&
		 * 
		 * true && true = true
		 * true && false = false
		 * flase && true = false
		 * flase && false = false
		 * 
		 * 
		 * 
		 * */
		
		boolean verdad1 = true;
		boolean verdad2 = false;
		
		System.out.println("True && True: " + (verdad1 && verdad1)); // True
		System.out.println("True && False " + (verdad1 && verdad2)); // False
		System.out.println("False && True " + (verdad2 && verdad1)); // False
		System.out.println("False && False " + (verdad2 && verdad2)); // False
		
		/*
		 * 
		 * Tabla de verdad OR ||
		 * 
		 * true || true = true
		 * true || false = true
		 * false || true = true
		 * false || false = false
		 * 
		 * 
		 * */

		System.out.println("True || True: " + (verdad1 || verdad1)); // True
		System.out.println("True || False " + (verdad1 || verdad2)); // True
		System.out.println("False || True " + (verdad2 || verdad1)); // True
		System.out.println("False || False " + (verdad2 || verdad2)); // False
		
		
		// ! Not
		
		System.out.println( "Not : " + !(verdad2)); // true
		
		
		/*
		 * 
		 * Estudio de caso
		 * 
		 * Una institucion educativa quiere agilizar su proceso de
		 * revision para validar calificaciones aprobatorias o
		 * reprobatorias
		 * 
		 * Calif min aprobatoria 70,
		 * Calif max 100
		 * Evaluar si la calificacion es valida
		 * cal >= 0 && cal <= 100
		 * 
		 * 
		 * 
		 * */
		
		// Paso 1 - Analizar el problema
		
		int calificacion = 65;
		boolean evaluador = calificacion >= 70; // True
		boolean evaluadorMax = calificacion <= 100; // False
		System.out.println("La calificacion es aprobatoria : " + evaluador);
		System.out.println("La calificacion es menor a 100 : " + evaluadorMax);
		
		
	}

}
