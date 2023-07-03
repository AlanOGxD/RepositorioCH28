package org.generation.variables;

public class DatosEstructurados {

	public static void main(String[] args) {
		/*
		 * Los datos estructurados almacenan datos más complejos que los datos primitivos. Se clasifican en dos:
		 * -- String (cadenas de caracteres). Al declarar String, Java lo toma como un objeto. 
		 */
		String myString = "Soy un String";
		System.out.println(myString);
		
		/*Métodos de String
		String length. Longitud del String (cadena).
		*/
		String texto = "QwErtY";
		System.out.println(texto.length());//Output: 6
		// toUpperCase y toLowerCase
		System.out.println("Aplicando el método toUpperCase: " + texto.toUpperCase());//Output: QWERTY
		System.out.println("Aplicando el método toLowerCase: " + texto.toLowerCase());//Output: qwerty
		// indexOf() devuelve el índice de la primera aparición de un texto específico en un String
		String parrafo = "Este es un párrafo llamado párrafo";
		System.out.println("Aplicando indexOf en la palabra párrafo: " + parrafo.indexOf("párrafo"));//Output: 
		//concat() se utiliza para concatenar dos String
		String firstName = "Daniel ";
		String lastName = "Maldonado";
		System.out.println(firstName + lastName);//Output: Daniel Maldonado
		System.out.println(firstName.concat(lastName));//Output: Daniel Maldonado
		
		//Integer.parseInt() se utiliza para convertir un String en int
		String presupuesto = "500000";
		System.out.println("El presupuesto es de " + presupuesto + " pesos, y es un dato de tipo " + presupuesto.getClass().getSimpleName());
		
		int parsear = Integer.parseInt(presupuesto);
		System.out.println("El presupuesto es de " + parsear + " pesos, y es un dato de tipo " + ((Object)parsear).getClass().getSimpleName());
		
		/* Variables.
		- Valor dinámico (variables)
		- Valor constante (constantes o variables finales)
		- Valor literal.
		*/
		
		int edad = 15;
		System.out.println("La edad es " + edad);
		edad = 20;
		System.out.println("La edad es " + edad);
		
		/*Variable finales. La palabra reservada final nos permite declarar constantes, lo que significa que su valor no se puede modificar y es de solo lectura*/
		final int longitudAntena = 8;
		System.out.println("La longitud de la antena es de " + longitudAntena + " metros");
		
		/*Variables según la posición en que se encuentren
		 * Variables locales. Se declaran dentro de los métodos
		 * Variables de instancia. Se declaran fuera del método.
		 * Variables estáticas. Se puede crear una sola copia de la variable estática, no puede ser local.
		 * */
		
		/*OPERADORES JAVA.
		 * Operadores aritméticos (+, -, *, /, %)
		 * Operadores lógicos
		 * Operadores relacionales
		 * */
		//Aritméticos
		int num1;
		int num2;
		num1 = 2;
		num2 = 12;
		int operacion = num1 - num2;
		System.out.println(operacion);
		
		/*Relaciones
			= asignación
			+= asignación suma
			-= asignación resta
			*= asignación multiplicación
			/= asignación división
			== igual que
			!= distinto que
			< menor que
			> mayor que
			<= menor igual que
			>= mayor igual que
		*/
		System.out.println(num1 > num2); //Output: false
		
		
		
		
	}

}
