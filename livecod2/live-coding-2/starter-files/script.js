// API
const API_ENDPOINT = 'https://yesno.wtf/api';
let boton= document.getElementById("button");
let respuesta=document.getElementById("answer");
let prim=document.getElementById("input");

//* 3. Attach fetchAnswer to an event listener
boton.addEventListener("click", function(params) {
    params.preventDefault
    fetchAnswer();
})
//* 1. Create a fetchAnswer function and call the API
function fetchAnswer() {
    let promesa= fetch(API_ENDPOINT,
        {method: "GET"
    })//Get
    

// * 2. Output the API's response
// * 4. Clear output after 3 seconds
promesa.then((response)=>{
    response.json().then((data)=>{
        console.log(data);
        respuesta.innerHTML=`La respuesta es ${data.respuesta}, ${data.forced}, ${data.image}`;
    }).catch((error)=>{
        console.error("Problemas con el formato de la respuesta" + error);
    }).catch((error)=>{

        console.log("Error en la solicitud" + error);
    });
    // * 4. Clear output after 3 seconds
    setTimeout(()=>{respuesta.style.display="none"}, 3000 );

})
};

