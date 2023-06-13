// Simulacion de una peticion asincrona
 /*
async function f() {
    let promise = new Promise((res, rej) => {
        setTimeout(() => res('done'), 3000)
    })
    
    let result = await promise;
    
    alert(result);
}
*/

// f();

const btn_plus = document.getElementById('btn-count-plus');
const btn_minus = document.getElementById('btn-count-minus');
const p = document.getElementById('contador');

let counter = 0;

p.textContent = counter;

btn_minus.addEventListener('click', async () => {
    await setTimeout(() =>{
        counter--;
        p.textContent = counter;
    }, 1000);
})

btn_plus.addEventListener('click', async () => {
    await setTimeout(() => {
        counter++;
        p.textContent = counter;
    }, 1000);
});