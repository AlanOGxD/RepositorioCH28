package org.generation.test_Unit.centralDeCamiones;

public class Driver {
	//Atributos de conductor
    private final String name;
    private final String id;
    private final double fee;
    private double balance;
    private boolean isAvailable = false;

    //Constructor
    public Driver(String name, String id, double fee)    {
        this.name = name;
        this.id = id;
        this.fee = fee;
    }

    //Getters y Setters
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double getFee() {
		return fee;
	}
    
	//Métodos para iniciar viaje y finalizar viaje
    public void startTrip(){
        isAvailable = false;
    }

    public void endTrip(){
        isAvailable = true;
        balance += balance;
    }
}
