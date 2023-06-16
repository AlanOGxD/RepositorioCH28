class Serpiente extends Mascota{
    comportamiento = "";

    constructor(comportamiento, nombre, edad, especie){
        super(nombre, edad, especie);
        this.comportamiento = comportamiento;
    }

    //Métodos
    saludando(){
        console.log("Hola, soy " + this.nombre + " y me estoy arrastrando");
    }
}

let serpientin = new Serpiente("Diurno", "Serpientin", 2, "Cobra real");

console.log("Soy una " + serpientin.especie);
serpientin.saludando();

//Método heredado de la superclass
serpientin.love();