package org.generation.overloading;

import java.math.*;

public class Overloading {
	//Método para sumar dos enteros
	public static int sumar(int num1, int num2) {
		return num1 + num2;
	}
	
	//Sobrecargando el método, sumar dos double
	public static double sumar(double num1, double num2) {
		return num1 + num2;
	}
	
	//Sobrecargar el método, utilizando BigDecimal
	public static BigDecimal sumar(BigDecimal num1, BigDecimal num2) {
		return num1.add(num2);
	}
	
	
	public static void main(String[] args) {
		//Invocando métodos 
		System.out.println(sumar(8, 5));
		System.out.println(sumar(4.3, 6.26));//Método sobrecargado. Output: 10.55999999999999
		
		//Invocar el método sumar de tipo BigDecimal
		BigDecimal num1 = new BigDecimal("4.3");
		BigDecimal num2 = new BigDecimal("6.26");
		System.out.println(sumar(num1, num2));//Output: 10.56
		
		
		

	}

}
