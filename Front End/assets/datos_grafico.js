// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';


estadistica();

async function estadistica() {

let fecha={};
fecha.dia= "20";
fecha.mes= "08";
fecha.anio="2023";

console.log(JSON.stringify(fecha));

  //URL del servicio  -  El codigo espera una respuesta
  const respuesta = await fetch('api/estadistica/1', {
   method: 'GET', //metodo HTTP
    headers: {   //aca decimos que devuelve un JSON
        'Accept': 'application/json',
        'Content-Type': 'application/json'
     },
     body: JSON.stringify(fecha)     //Acá van los datos del registro   
   });
  
  const datos = await respuesta.json();

// Bar Chart Example
var ctx = document.getElementById("myBarChart");
var myLineChart = new Chart(ctx, {
  type: 'bar',
  data: {
    labels: ["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado","Domingo"],
    datasets: [{
      label: "Revenue",
      backgroundColor: "rgba(2,117,216,1)",
      borderColor: "rgba(2,117,216,1)",
      data: [datos .lunes, datos.martes, datos.miercoles, datos.jueves, datos.jueves, datos.viernes, datos.sabados]
    }],
  },
  options: {
    scales: {
      xAxes: [{
        time: {
          unit: 'Dias'
        },
        gridLines: {
          display: false
        },
        ticks: {
          maxTicksLimit: 7
        }
      }],
      yAxes: [{
        ticks: {
          min: 0,
          max: 40,
          maxTicksLimit: 5
        },
        gridLines: {
          display: true
        }
      }],
    },
    legend: {
      display: false
    }
  }
});
}