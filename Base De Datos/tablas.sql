drop table presion_atmosferica;

CREATE TABLE presion_atmosferica (
    id INT PRIMARY KEY auto_increment,
    fecha_hora DATE,
    fk_locacion VARCHAR(255),
    altitud VARCHAR(15)
);

drop table locacion;

CREATE TABLE locacion (
    id INT PRIMARY KEY auto_increment,
    nombre VARCHAR(255),
    coordenadas VARCHAR(255),
    fk_titular VARCHAR(255),
    direccion VARCHAR(255)
);

drop table temperatura_humedad;

CREATE TABLE temperatura_humedad (
    id INT PRIMARY KEY auto_increment,
    val_temp VARCHAR(255),
    val_hum VARCHAR(255),
    fk_locacion VARCHAR(255),
    fecha_hora DATE
);

drop table intensidad_solar;

CREATE TABLE intensidad_solar (
    id INT PRIMARY KEY auto_increment,
    lumenes VARCHAR(255),
    insolacion varchar(255),
    fk_locacion VARCHAR(255),
    fecha_hora DATE
);

drop table usuario;

CREATE TABLE usuario (
    id INT PRIMARY KEY auto_increment,
    usuario VARCHAR(255),
    contraseña VARCHAR(255),
    correo VARCHAR(255)
);

drop table titular;

CREATE TABLE titular (
    id INT PRIMARY KEY auto_increment,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    fk_locacion VARCHAR(255),
    domicilio VARCHAR(255)
);

drop table precipitaciones;

CREATE TABLE precipitaciones (
    id INT PRIMARY KEY auto_increment,
    fk_locacion VARCHAR(255),
    valor_precipitaciones VARCHAR(255),
    fecha_hora DATE
);

drop table provincia;

CREATE TABLE provincia (
    id INT PRIMARY KEY auto_increment,
    provincia VARCHAR(255)
);
 
 drop table estadisticas;

 CREATE TABLE estadisticas (
	id INT PRIMARY KEY auto_increment,
    temperatura Float,
    humedad float,
    presion_atmosferica float,
    precipitaciones float,
    int_solar float,
	fecha datetime
 );
 

insert into locacion
(nombre,coordenadas,fk_titular,direccion)
values 
('buenos aires','la plata',1,'berisso'),
('santiago del estero','santiago del estero',1,'ciudad'),
('chubut','rawson',1,'ciudad'),
('chaco','resistencia',1,'ciudad');

insert into titular
(nombre,apellido,fk_locacion,domicilio)
values
('dante','sparda',1,'berisso');

INSERT INTO estadisticas
(fecha,temperatura,humedad,presion_atmosferica,precipitaciones,int_solar)
values
('21/06/23',14,18,30,1,6),
('23/06/23',16,19,45,2,4),
('25/06/23',12,34,37,5,6),
('27/06/23',14,40,42,3,5);

INSERT INTO usuario
(usuario,contraseña,correo)
VALUES 
('tomaslou','qwerty456','coco123@,correo.ejemplo1gmail.com'),
('dantesparda','devilmy123','dante123@correo.ejemplogmail.com'),
('vergilstone','mycrw123','vergil45@correo.ejemplo.gmail.com'),
('neronwiil','devilcry1234','nero.@correo,ejemplo.gmail.com');
 
INSERT INTO temperatura_humedad
(fecha_hora,val_temp,val_hum,fk_locacion)
VALUES 
('21/06/23', 18,9,'la plata'),
('23/06/23', 22,10,'santiago del estero'),
('25/06/23', 19,13,'rawson'),
('27/06/23', 21,11,'resistencia');

INSERT INTO precipitaciones
(fecha_hora,fk_locacion,valor_precipitaciones)
VALUES 
('21/06/23', 15,'15:30'),
('23/06/23', 17,'17:40'),
('25/06/23', 12,'12:50'),
('27/06/23', 13,'13:25');

INSERT into intensidad_solar 
(fecha_hora,fk_locacion,lumenes,insolacion)
VALUES
('21/06/23',12,20,10),
('23/06/23',14,17,11),
('25/06/23',16,18,13),
('27/06/23',18,20,9);

INSERT INTO presion_atmosferica 
(fecha_hora,fk_locacion,altitud)
values 
('21/06/23',2,80),
('23/06/23',0,89),
('25/06/23',0,87),
('17/06/23',0,99);








