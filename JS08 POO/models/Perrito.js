//Crear una nueva clase llamada Perrito que herede propiedades y métodos de la clase Mascota, con la palabra reservada extends
class Perrito extends Mascota {
    //Definir atributos propios de la clase hija
    id = "";
    raza = "";

    constructor(id, raza, nombre, edad, especie){
        super(nombre, edad, especie);
        this.id = id;
        this.raza = raza;
    }

    //Métodos
    propiedades(){
        console.log("Mi perrito número " + this.id);
        console.log("Nombre " + this.nombre);
        console.log("Edad " + this.edad + " años");
    }

    sonido(){
        console.log("grrr");
    }
}

//Instanciar objetos: perrillo y appa
let perrillo = new Perrito(1, "Husky", "Perrillo", 3, "Canis canis");
let appa = new Perrito(2, "Chihuahua", "Appa", 10, "Canis canis");

//Invocar métodos
perrillo.propiedades();
appa.sonido();
perrillo.love();
