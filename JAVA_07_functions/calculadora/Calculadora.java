package org.generation.functions.calculadora;

public class Calculadora {
	//Aquí se crean métodos
	//Métodos para calculadora que reciban dos argumentos double(sumar, restar, multiplicar, dividir)
	public double sumar (double x, double y) {
		double suma = x + y;
		return suma;
	}
	
	public double restar (double x, double y) {
		double resta = x - y;
		return resta;
	}
	
	public double multiplicar (double x, double y) {
		double multiplicacion = x * y;
		return multiplicacion;
	}
	
	public double dividir (double x, double y) {
		double division = x / y;
		return division;
	}
	
	public double calcularRaiz(double x) {
		double raizCuadrada = Math.sqrt(x);
		return raizCuadrada;
	}
}
