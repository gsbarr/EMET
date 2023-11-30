
function crearLocacion(){

    inputLugar = document.querySelector("#lugar");
    inputTitular = document.querySelector("#fk_titular");
    inputDireccion = document.querySelector("#direc");
    inputCoordenadas = document.querySelector("#coordenadas");
    let datos = {};
    let codigoResp;

    // Armamos el JSON con los datos del registro
    datos.nombre = inputLugar.value;
    datos.titular = inputTitular.value;
    datos.direccion = inputDireccion.value;
    datos.coordenadas = inputCoordenadas.value;
    
    console.log(JSON.stringify(datos));
    // Petición HTTP
    try{   
        respuesta = fetch('http://localhost:8080/api/locacion', {
            method: 'POST', //metodo HTTP
            headers: {   //aca decimos que devuelve un JSON
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(datos)     //Acá van los datos del registro    
        })
        .then(response => {
            codigoResp = response.status;
            console.log("Respuesta de petición: "+response.status);

            //recargamos la pagina
            if(codigoResp >= 200 && codigoResp < 300){
            console.log("Recargando pagina...")
            location.reload();
            }
        });
    }
    catch (error){
        //hubo un error
        console.log("Error en registro: " + error);
    }

}