package org.generation.test_Unit.calculadora;

public class Calculadora_Main {

	public static void main(String[] args) {

		Calculadora calculadora = new Calculadora();
		System.out.println(calculadora.sumarNumeros(2, 3));//5
		System.out.println(calculadora.restarNumeros(2, 3));//5
		System.out.println(calculadora.multiplicarNumeros(2, 3));//5
		System.out.println(calculadora.dividirNumeros(2, 3));//5
	}

}
