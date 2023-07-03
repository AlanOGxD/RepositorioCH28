package org.generation.pOO;

public class POODocumentation {
	/*** Elementos principales para trabajar POO.
	 * 1. Atributos
	 * 2. Método(s) contructor(es)
	 * 3. Métodos de instancia
	 * 4. Instancias
	 * */
	
	/* 1. Atributos. Son porciones de información que un objeto posee o conoce de sí mismo = variables con valores.
	 * Se declaran estableciendo el modificador de acceso, el tipo de dato y el nombre de la variable.
	 * Tenemos dos tipos: de instancia (atributo normal) y de clase (tipo static)
	 * */
	//cuenta bancaria
	
	public double saldo;//Atributo de instancia
	public String cliente;
	public int transacciones;
	public static int totalCuentas = 0;//Atributo de clase
	
	/*2. Métodos constructores. Método especial que se usa para inicializar objetos. Cad avez que se crea un objeto, utilizamos el constructor new().
	 * Reglas para escribir constructores:
	 * - Los constructores de una clase deben tener el mismo nombre de la clase en la que vive
	 * - Un constructor en Java no puede ser abstracto, final, static, sincronizado 
	 * - Los modificadores de acceso se pueden usar en la declaración del constructor para controlar su acceso.
	 * 2.1. Constructores predeterminados.
	 * 2.2. Constructores parametrizados.
	 * 		2.2.1. Sobrecarga de constructores.
	 * 2.3. Constructores de copia.
	 * */
	
	//Constructor predeterminado
	/*POODocumentation(){
		System.out.println("Constructor predeterminado");
	}*/
	
	//Constructor parametrizado
	POODocumentation(double saldo, String cliente, int transacciones){
		this.saldo = saldo;
		this.cliente = cliente;
		this.transacciones = transacciones;
	}
	
	//Sobrecarga de Constructor
	POODocumentation(double saldo, int transacciones){
		this.saldo = saldo;
		this.transacciones = transacciones;
	}
	
	POODocumentation(){
		
	}
	
	/*3. Métodos Java
	 * Colección de declaraciones que realizan alguna tarea específica y devuelven el resultado que llama. Un método puede realizar alguna tarea específica sin devolver nada. 
	 * Reutilización de código.
	 * -- Estático (static). No es necesario instanciar objetos.
	 * -- Público (public). Solo se pueden acceder a partir de objetos
	 */
	
	//Método static
	static void metodoStatic() {
		System.out.println("Hola, soy un método estático");
	}
	//Método público
	public void metodoPublic() {
		System.out.println("Hola, soy un método público");
	}
	
	
	public static void main(String[] args) {
		POODocumentation cliente1 = new POODocumentation(50, "Daniel", 2);
		System.out.println(cliente1);

		POODocumentation cliente2 = new POODocumentation(50, 2);
		System.out.println(cliente2);
		
		//Invocando un métod estático
		metodoStatic();
		
		//Invocando un método público desde un objeto
		POODocumentation publico = new POODocumentation();
		publico.metodoPublic();
		
	}
	
	
	
	
	
	
	
	
}
