// Escribe tu código aquí.
let par1 = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];

//imprimir en la consola los elementos de la lista:
console.log(par1.toString());
//mandamos a llamar la lista desordenada mediante id:
let par2=document.getElementById("elements");
enuml(par1);
//denoté la función de la lista y pueda imprimir elementos con logitud mayor a 7 
function enuml(elista) {
    elista.forEach(element => {
        if (element.length>=7) {
            //imprimir en forma de lista los elementos que cumplen la condición
            par2.innerHTML+=`<li>${element}</li>`;
        }
    });
}
// console.log(par1);
