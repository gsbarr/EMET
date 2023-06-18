$(document).ready(function(){
        user = crearUsuario();
        console.log("contenido user");
        console.log(JSON.stringify(user));
    });

//definimos una funcion asincronica para hacer una peticion a la API
async function crearUsuario() {
    //URL del servicio  -  El codigo espera una respuesta
    const respuesta = await fetch('api/obtener/1', {
    method: 'GET', //metodo HTTP

        headers: {   //aca decimos que devuelve un JSON
        'Accept': 'application/json',
        'Content-Type': 'application/json'
        }

    });
    const usuario = await respuesta.json();
    console.log("contenido usuario");
    console.log(JSON.stringify(usuario));
    document.write(JSON.stringify(usuario));
    // aca pondriamos la logica que llena la pagina
    return usuario;
}