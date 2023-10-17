
async function Cargarlocacion(){
    perfil=1;

  //URL del servicio  -  El codigo espera una respuesta
  const respuesta = await fetch('api/titular/' + perfil, {
  method: 'GET', //metodo HTTP
  headers: {   //aca decimos que devuelve un JSON
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

const datos = await respuesta.json();

// datos =JSON.parse(` {
//     "id":1,
//     "nombre":"carlos",
//     "apellido":"juan",
//     "locacion": [{
//         "id":1,
//         "nombre":"Los talas",
//         "coordenadas":"25 64",
//         "direccion":"carlitos 245"
//     },
//     {
//         "id":2,
//         "nombre":"isla paulino",
//         "coordenadas":"53 62",
//         "direccion":"juan carlos 23"
//     }],
//     "domicilio":"los talas 1345"
// }`);

    // Obtenemos el div donde vamos a insertas las locaciones
    locacion = document.querySelector(".locacion");
    nombre1 = document.querySelector("#nombre1");

    nombre1.innerHTML = datos["nombre"];
    nombre1.innerHTML = datos["direccion"];

    datos.locacion.forEach(loc => {

        console.log(JSON.stringify(loc["coordenadas"]));

        template = `<div class="col-lg-8">
        <div class="card mb-4">
          <div class="card-body">
            <div class="row">
              <div class="col-sm-3">
                <p class="mb-0">${loc["nombre"]}</p>
              </div>
              <div class="col-sm-9">
                <p class="text-muted mb-0">${loc["id"]}</p>
                <p class="text-muted mb-0">${loc["nombre"]}</p>
                <p class="text-muted mb-0">${loc["coordenadas"]}</p>
                <p class="text-muted mb-0">${datos["nombre"]} ${datos["apellido"]}</p>
                <p class="text-muted mb-0">${loc["direccion"]}</p>
              </div>
            </div>
          </div>
    
          
        </div>
        </div>
      </div>
        `;
        locacion.innerHTML += template;

        

    });
}

function crearlocacion(){

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
        respuesta = fetch('localhost:8080/api/usuarios', {
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