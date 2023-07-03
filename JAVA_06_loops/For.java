package org.generation.loops;

public class For {

	public static void main(String[] args) {
		/*
		 Ciclo for es una forma compacta de iterar sobre un rango de valores. 
		 for(inicialización; terminación; incremento/decremento){
		 	bloque de código
		 }
		 */
		for(int numero = 1; numero <= 10; numero++) {
			System.out.println("numero es igual a " + numero);//Cuenta del 1 al 10
		}
		
		int contador;
		for(contador = 1; contador <= 10; contador++) {
			System.out.println("contador es igual a " + contador);
		}
		
		/*
		Bucles anidados. Es posible colocar un bucle dentro de otro bucle. El bucle interno se ejecutará una vez por cada iteración del bucle externo.
		*/
		
		//Anidar dos ciclos for para imprimir una forma triangular de asterísticos
		
		int filas = 5;
		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		//Ejemplo con for para calcular potencias de PI
		
		int numPotencias = 5;
		System.out.println("El valor de PI es " + Math.PI);
		
		for(int i = 1; i <= numPotencias; i++) {
			double resultado = Math.pow(Math.PI, i);
			System.out.println("PI elevado a la " + i + ": " + resultado);
		}
		
		
	}

}
