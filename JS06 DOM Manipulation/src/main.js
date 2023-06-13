// Obtener elementos/nodos
const inputNombre = document.getElementById('nombre-input');

const parrafo = document.getElementById('texto');

// Obtiene la primer coincidenca
const parrafo2 = document.querySelector('.texto');

// Obtiene todos los nodos que coinciden
const parrafos = document.querySelectorAll('.texto');


// Obtener atributos de nodos

// console.log(inputNombre.getAttribute('id'));
// console.log(inputNombre.id);

// Manipulacion del DOM

// inputNombre.value = 'Hola soy un input';
// document.getElementById('texto').innerHTML = 'Modificamos el texto';


// Escuchando un evento
// Modificando el valor de un nodo
inputNombre.addEventListener('input', e => {
    parrafo.textContent = e.target.value;
});

// inputNombre.addEventListener('input', e => parrafo.textContent = e.target.value);

// function actualizarTexto(e) {
//     parrafo.textContent = e.target.value;
// }


// Creamos elemento
const divParrafo = document.getElementById('section1');

const p = document.createElement('p');
p.textContent = 'Agregado desde JS';

// insertamos elemento
divParrafo.appendChild(p);







