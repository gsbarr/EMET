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

function login(){
    inputNombre = document.querySelector("#nombres");
    inputcontraseña = document.querySelector("#contraseña");
    let datos = {};
    let codigoResp;



    // Armamos el JSON con los datos del registro
    datos.nombre = inputNombre.value;
    datos.password = inputcontraseña.value;

    console.log(JSON.stringify(datos));
    console.log("creando usuario... ");
    // Petición HTTP
    try{
        respuesta = fetch('http://localhost:8080/api/usuarios', {
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

//funcion para crear nuevo usuario
function crearUser(){

    inputName = document.querySelector("#nombres");
    inputLastName = document.querySelector("#apellidos");
    inputEmail = document.querySelector("#correo");
    inputPassword = document.querySelector("#contraseña");
    inputPasswordConfirm = document.querySelector("#confcontraseña");
    let datos = {};
    let codigoResp;

    // Verifico si las password coinciden
    if (inputPassword.value != inputPasswordConfirm.value){
        alert("Las contraseñas no coinciden");
        return;
    }

    // Armamos el JSON con los datos del registro
    datos.name = inputName.value;
    datos.last_name = inputLastName.value;
    datos.email = inputEmail.value;
    datos.password = inputPassword.value;

    console.log(JSON.stringify(datos));
    console.log("creando usuario... ");
    // Petición HTTP
    try{
        respuesta = fetch('http://localhost:8080/api/usuarios', {
            method: 'POST', //metodo HTTP
            headers: {   //aca decimos que devuelve un JSON
                'Accept': 'application/json',
                "Content-Type": 'application/json',
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