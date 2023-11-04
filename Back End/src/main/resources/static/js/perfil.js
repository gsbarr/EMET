
async function Cargarlocacion(){
    perfil=1;

  //URL del servicio  -  El codigo espera una respuesta
  const respuesta = await fetch('api/titulares/' + perfil, {
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
    nombre2 = document.querySelector("#nombre2");
    //email1= document.querySelector("#email1");
    razonsocial= document.querySelector("#razonsocial");
    celular1= document.querySelector("#celular1");
    direccion3= document.querySelector("#direccion3");

    nombre1.innerHTML = datos["nombre"] +" "+ datos["apellido"];
    nombre2.innerHTML = datos["nombre"] +" "+ datos["apellido"];
    //email1.innerHTML= datos["email"];
    razonsocial.innerHTML= datos["razonSocial"];
    celular1.innerHTML= datos["telefono"];
    direccion3.innerHTML= datos.domicilio["direccion"];

    datos.locaciones.forEach(loc => {

        console.log(JSON.stringify(loc["coordenadas"]));

        template = `<form action="Estadisticas.html" method="GET" name="formularioloc"> <input type="Hidden" value="${loc[id]}">
        <a href="Estadisticas.html" onclick="document.formularioloc.submit()">
       <div class="col-lg-8">
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
      </form>
      </a>
        `;
        locacion.innerHTML += template;

        

    });
}

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