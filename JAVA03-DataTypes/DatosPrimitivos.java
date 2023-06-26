package org.generation.variables;

public class DatosPrimitivos {

	public static void main(String[] args) {
		/*
		 * Datos primitivos. Se consideran como los datos fundamentales y sirven para gestionar los tipos de información más básicos como números, letras, booleanos.
		 * Existen 8 tipos de datos primitivos: byte, short, int, long, float, double, boolean, char
		 */

		//byte (valor mínimo -128, valor máximo 127)
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println(maxByte);
		System.out.println(minByte);
		
		//short (valor mínimo -32768, valor máximo 32767)
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println(minShort);
		System.out.println(maxShort);
		
		//int (valor mínimo -2147483648, valor máximo 32767)
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor mínimo de un int es: " + minInt);
		System.out.println("El valor máximo de un int es: " + maxInt);
		int numInt = 54296;
		System.out.println("El número int es " + numInt);
		
		//long (valor mínimo -9223372036854775808, valor máximo 9223372036854775807)
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor mínimo de un long es: " + minLong);
		System.out.println("El valor máximo de un long es: " + maxLong);
		long numLong = 54296L;
		System.out.println("El número Long es " + numLong);
		
		//float (valor mínimo 1.4E-45, valor máximo 3.4028235E38)
		float minFloat = Float.MIN_VALUE;
		float maxFLoat = Float.MAX_VALUE;
		System.out.println("El valor mínimo de un float es: " + minFloat);
		System.out.println("El valor máximo de un float es: " + maxFLoat);
		float numFloat = 12.3F;
		System.out.println("El número float es " + numFloat);
		
		//double (valor mínimo 4.9E-324, valor máximo 1.7976931348623157E308)
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor mínimo de un double es: " + minDouble);
		System.out.println("El valor máximo de un double es: " + maxDouble);
		double numDouble = 12.3;
		System.out.println("El número double es " + numDouble);
		
		//byte edad = 85;
		//System.out.println("La edad de una persona es " + edad + " años.");
		
		//booleans
		boolean MayorEdad = true;
		boolean MinoriaEdad = false;
		System.out.println(MayorEdad);

		//asciitable
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor mínimo de un char es: " + minChar);
		System.out.println("El valor máximo de un char es: " + maxChar);
		
		char valorChar = '3';
		char valorChar2 = '@';
		System.out.println(valorChar);
		System.out.println(valorChar2);
		
		/*
		 * Casting (Conversión de tipos de datos en Java)
		 * -- Ampliación (automática), convertimos un tipo de dato más pequeño a un tipo de dato más grande:
		 * byte-> short-> char-> int-> long-> float-> double
		 */

		int myInt = 125;
		double myDouble = myInt;//Automático
		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		/*
		 * -- Estrechamiento (manual), convertimos un tipo de dato más grande en un tipo de dato más pequeño:
		 * double-> float-> long-> int-> char-> short-> byte
		 */
		
		//Convertir myDouble (125.0) a un dato de tipo int(125)
		int nuevoInt = (int) myDouble;
		System.out.println("Este es un double: " + myDouble);
		System.out.println("Esta es una conversión de estrechamiento: " + nuevoInt);
		
		//Conversión de float a int
		float valorFloat = 1.89f;
		int valorInt = (int)valorFloat;
		System.out.println("Conversión de float a int: " + valorInt);
		
		//Conversión de char a int
		char convertirChar = 'M';
		int conversionInt = convertirChar;
		System.out.println("Conversión de char a int: " + conversionInt);		
	}
}


