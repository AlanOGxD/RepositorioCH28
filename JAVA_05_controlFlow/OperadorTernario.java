package org.generation.controlFlow;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		/*Operador ternario. 
		variable = (condición) ? true : false;
		*/
		//Determinar si los 3 números ingresados por el usuario son pares
		Scanner scanner = new Scanner(System.in);
		System.out.println("Este programa determina si tres números son pares.");
		
		System.out.println("Ingresa el primer número");
		int num1 = scanner.nextInt();
		
		System.out.println("Ingresa el segundo número");
		int num2 = scanner.nextInt();
		
		System.out.println("Ingresa el tercer número");
		int num3 = scanner.nextInt();
		
		String msj1 = "Los tres números son pares";
		String msj2 = "No son pares";
		String pares = ((num1 % 2 == 0) && (num2 % 2 == 0 )&& (num3 % 2 == 0)) ? msj1 : msj2;
		System.out.println(pares);
		
		scanner.close();
	}
}
