create database emet;
use emet;

/*drop table presion_atmosferica*/

CREATE TABLE presion_atmosferica (
    id INT PRIMARY KEY auto_increment,
    fecha_hora DATE,
    fk_locacion VARCHAR(255),
    altitud VARCHAR(255)
);

drop table locacion;

CREATE TABLE locacion (
    id INT PRIMARY KEY auto_increment,
    nombre VARCHAR(255),
    coordenadas VARCHAR(255),
    fk_titular VARCHAR(255),
    direccion VARCHAR(255)
);

/*drop table temperatura_humedad;*/

CREATE TABLE temperatura_humedad (
    id INT PRIMARY KEY auto_increment,
    val_temp VARCHAR(255),
    val_hum VARCHAR(255),
    fk_locacion VARCHAR(255),
    fecha_hora DATE
);

/*drop table intensidad_solar;*/

CREATE TABLE intensidad_solar (
    id INT PRIMARY KEY auto_increment,
    lumenes VARCHAR(255),
    insolacion varchar(255),
    fk_locacion VARCHAR(255),
    fecha_hora DATE
);

/*drop table usuario;*/

CREATE TABLE usuario (
    id INT PRIMARY KEY auto_increment,
    usuario VARCHAR(255),
    contraseña VARCHAR(255),
    correo VARCHAR(255)
);

/*drop table titular;*/

CREATE TABLE titular (
    id INT PRIMARY KEY auto_increment,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    fk_locacion VARCHAR(255),
    domicilio VARCHAR(255)
);

/*drop table precipitaciones;*/

CREATE TABLE precipitaciones (
    id INT PRIMARY KEY auto_increment,
    fk_locacion VARCHAR (255),
    valor_precipitaciones VARCHAR (255),
    fecha_hora DATE
);

/*drop table provincia;*/

CREATE TABLE provincia (
    id INT PRIMARY KEY auto_increment,
    provincia VARCHAR(255)
);
 
/*drop table estadisticas;*/

 CREATE TABLE estadisticas (
	id INT PRIMARY KEY auto_increment,
    temperatura Float,
    humedad float,
    presion_atmosferica float,
    precipitaciones float,
    int_solar float,
	fecha datetime
 );
