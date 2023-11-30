async function Cargarlocacion(){
    locacion=1;

  //URL del servicio  -  El codigo espera una respuesta
  const respuesta = await fetch('api/titulares/' + locacion, {
  method: 'GET', //metodo HTTP
  headers: {   //aca decimos que devuelve un JSON
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });

const datos = await respuesta.json();
}





