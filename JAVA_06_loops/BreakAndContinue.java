package org.generation.loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		/* La sentencia break se utiliza para salir de un bucle cuando se cumple una condición específica*/
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
		}

		/*La sentencia continue interrumpe una iteración del bucle, si se produce una condición específica y continúa con la siguiente iteración del bucle*/
		int j = 1;
		while(j < 11) {
			if(j == 3) {
				j++;
				continue;
			}
			System.out.println("j vale " + j);
			j++;
		}
		
		
	}

}
