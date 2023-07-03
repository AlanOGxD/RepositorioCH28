package org.generation.functions;

public class ClassMath {

	public static void main(String[] args) {
		Metodos asteriscos = new Metodos();
		asteriscos.imprimirAsteriscos();
		
		/*Class Math de la Java API. Podemos acceder a operaciones matemáticas y constantes para utilizarlas en nuestras clases.
		Accedemos mediante la palabra reservada Math.
		*/
		
		//Calcular la altura de una torres que se encuentra a 100 metros de una persona, que observa la punta de la torre con un ángulo de elevación de 30°
		double distancia = 100;
		double anguloElevacion = 30;
		
		double conversionAngulo = Math.toRadians(anguloElevacion);
		System.out.println(conversionAngulo);
		
		double altura = Math.tan(conversionAngulo) * distancia;
		System.out.println("La altura de la torre es de: " + altura + " metros");
		
		//El cubo de un número (n*n*n)
		double numero = 25.6;
		double cubo = Math.pow(numero, 3);
		System.out.println("El cubo de " + numero + " es: " + cubo);	
		
		
	}

}