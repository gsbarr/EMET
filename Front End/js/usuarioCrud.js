// Funcion para eliminar usuario
function eliminarUser(){
    idUsuario = document.querySelector("#idUser");

    if (confirm("¿Desea eliminar el usuario")){

        console.log("eliminando usuario "+idUsuario.value);
        try{
            
            respuesta = fetch('api/usuarios/del/' + idUsuario.value, {
                method: 'DELETE', //metodo HTTP
                headers: {   //aca decimos que devuelve un JSON
                    'Accept': 'application/json',
                    'Content-Type': 'application/json'
                }
            });
            console.log("Respuesta HTTP: " + respuesta.status);
        }
        catch (error){
            //hubo un error
            console.log("Error en borrado: " + error);
        }

        console.log("Usuario eliminado");
        
    }
    
    
}


//funcion para crear nuevo usuario
function crearUser(){
    inputnombres = document.querySelector("#nombres");
    //inputcorreo = document.querySelector("#correo");
    inputapellidos = document.querySelector("#apellidos");
    inputcontraseña = document.querySelector("#contraseña");
    inputconfcontraseña = document.querySelector("#confcontraseña");
    let datos = {};
    let codigoResp;

    // Verifico si las password coinciden
    if (inputcontraseña.value != inputconfcontraseña.value){
        alert("Las contraseñas no coinciden");
        return;
    }

    // Armamos el JSON con los datos del registro
    datos.nombre = inputnombres.value;
    datos.dni = inputapellidos.value;
    //datos.correo = inputcorreo.value;
    datos.password = inputcontraseña.value;
    
    console.log("creando usuario... ");
    // Petición HTTP
    try{   
        respuesta = fetch('http://10.0.1.135:8080/api/usuarios', {
            mode: 'no-cors',
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