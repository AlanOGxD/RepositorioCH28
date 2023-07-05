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
	
	private double saldo;//Atributo de instancia
	private String cliente;
	private int transacciones;
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
	
	/* Sobrecarga de métodos. Característica de una clase que le permite recibir métodos con el mismo nombre pero diferentes firmas.*/
	 public int suma (int num1, int num2){
		 return num1 + num2;
	 }//Output int
	
	 public double suma (double num1, double num2){
		 return num1 + num2;
	 }//Output int
	 
	 
	 
	 //Método main para acceder (invocar) a mis métodos de clase
	 public static void main(String[] args) {
		POODocumentation cliente1 = new POODocumentation(50, "Daniel", 2);
		System.out.println(cliente1);

		POODocumentation cliente2 = new POODocumentation(50, 2);
		System.out.println(cliente2);
		
		//Invocando un método estático
		metodoStatic();
		
		//Invocando un método público desde un objeto
		POODocumentation publico = new POODocumentation();
		publico.metodoPublic();
		
		//Probando la sobrecarga de métodos
		System.out.println(publico.suma(2.3, 2.5));
		System.out.println(publico.suma(5, 8));
		
		/* Getters y Setters. Son métodos que nos permiten acceder a la información  protegida por modificadores de acceso y que de otra manera no podrías acceder a ellos. Gracias a estos métodos sacamos una copia de ese dato protegido y lo podemos modificar.
		 * -- Getters (método de obtención). Proporcionan solo lectura de los campos privados.
		 * -- Setter (métodos de establecimiento). Se utilizan para modificar el valor de un campo en una clase. 
		 * ¿ Qué pasaría si no escribo getters y setters en mi clase de Java?
		 * Los campos privados de una clase no serán accesibles desde otras clases. 
		 */
		
		//Getter (sintaxis)
		/*public tipoDeDato getNombreDeVariable() {
			return nombreDeVariable
		}*/
		
		//Setter (sintaxis)
		/*public void setNombreDeVariable(tipoDato nombreVariable) {
			this.nombreVariable = nombreVariable;
		}*/
		
		/*===== Ruta para crear getters y setter. Sobre el espacio de trabajo de la java class:
			1. Click derecho.
			2. Source
			3. Generate Getters and Setters
			4. Seleccionar las variables (fields) a las cuales les construiremos getters y setters
			5. Generar getters y setters*/
		
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(int transacciones) {
		this.transacciones = transacciones;
	}

	/*=== @Override toString(). Se utilizar para devolver una respresentación de String de un Objeto.
	 * Para generarlo se accede a las opciones de la java class con click derecho -> source -> Generate toString()*/
	
	@Override
	public String toString() {
		return "POODocumentation [saldo=" + saldo + ", cliente=" + cliente + ", transacciones=" + transacciones + "]";
	}
	
	

	
	
	
	
	
	
	
}
