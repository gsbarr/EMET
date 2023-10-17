$(document).ready(function(){
    //user = crearUsuario();

    
    //lista = listarUsuarios();

    const datatablesSimple = document.getElementById('datatablesSimple');
    if (datatablesSimple) {
        new simpleDatatables.DataTable(datatablesSimple);
    }
                // Realizar una solicitud GET al servidor para obtener los datos
                $.ajax({
                    url: 'http://localhost:8080/api/usuarios', // Reemplaza con la URL correcta del servidor
                    type: 'GET',
                    dataType: 'json',
                    success: function (data) {
                        $('#tableBody').empty();
                        console.log(data[0]);
                        // Agregar los datos a la tabla
                        var tableBody = $('#tableBody');
                        data.forEach(function (usuario) {
                            tableBody.append('<tr>' +
                                '<td>' + usuario.id + '</td>' +
                                '<td>' + usuario.nombre + '</td>' +
                                '<td>' + usuario.apellido + '</td>' +
                                '<td>' + usuario.email + '</td>' +
                                '<td>' + usuario.password + '</td>' +
                                '</tr>');
                        });
                    },
                    error: function () {
                        alert('Error al cargar los datos desde el servidor.');
                    }
                });

});





//definimos una funcion asincronica para hacer una peticion a la API
async function crearUsuario() {

    //URL del servicio  -  El codigo espera una respuesta
    const respuesta = await fetch('api/usuarios/1', {
     method: 'GET', //metodo HTTP
      headers: {   //aca decimos que devuelve un JSON
          'Accept': 'application/json',
          'Content-Type': 'application/json'
       }
     });
    const usuario = await respuesta.json();
    console.log("contenido usuario");
    console.log(JSON.stringify(usuario));

    // aca pondriamos la logica que llena la pagina

    //devolvemos algún valor
    return usuario;
}


// Función que pide a la API la lista de usuarios total
// y la carga en la tabla
async function listarUsuarios() {

    //let listaUsuarios = [];

    //URL del servicio  -  El codigo espera una respuesta
    const respuesta = await fetch('http://localhost:8080/api/usuarios', {
     method: 'GET', //metodo HTTP
      headers: {   //aca decimos que devuelve un JSON
          'Accept': 'application/json',
          'Content-Type': 'application/json'
       }
     });
    const lista  = await respuesta.json();

    console.log("contenido lista usuario");
    console.log(JSON.stringify(lista));

    //document.write(JSON.stringify(lista));


    // aca pondriamos la logica que llena la pagina

    // si LISTA está vacío
    if (JSON.stringify(lista) === "{}"){
        console.log("Lista vacia");
    }
    else{
        console.log("Llenamos la lista");

        const tabla = document.querySelector("#datatablesSimple tbody");
        //tabla.innerHTML = "";

        lista.forEach(usuario => {

            const tr = document.createElement("tr");
            tr.classList.add("tr_usuario");
            tr.innerHTML = `
                <td>${usuario.id}</td>
                <td>${usuario.nombre}</td>
                <td>${usuario.dni}</td>
                <td>${usuario.password}</td>
                <td>pruebatexto</td>
                <td>pruebatexto</td>
            `;

            tabla.append(tr);


        })

        //$('#datatablesSimple').DataTable().ajax.reload();
        //BUSCAR COMO RECARGAR EL DATATABLE (Lo de arriba no funciona)

        console.log("lista llenada");
    }

    return lista;
}

