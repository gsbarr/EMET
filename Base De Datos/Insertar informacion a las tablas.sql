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
('dante','slowed',1,'berisso');

INSERT INTO estadisticas
(fecha,temperatura,humedad,presion_atmosferica,precipitaciones,int_solar)
values
('21-06-23',14,18,30,1,6),
('23-06-23',16,19,45,2,4),
('25-06-23',12,34,37,5,6),
('27-06-23',14,40,42,3,5);

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
('21-06-23', 18,9,'la plata'),
('23-06-23', 22,10,'santiago del estero'),
('25-06-23', 19,13,'rawson'),
('27-06-23', 21,11,'resistencia');

INSERT INTO precipitaciones
(fecha_hora,fk_locacion,valor_precipitaciones)
VALUES 
('21-06-23', 15,'15:30'),
('23-06-23', 17,'17:40'),
('25-06-23', 12,'12:50'),
('27-06-23', 13,'13:25');

INSERT into intensidad_solar 
(fecha_hora,fk_locacion,lumenes,insolacion)
VALUES
('21-06-23',12,20,10),
('23-06-23',14,17,11),
('25-06-23',16,18,13),
('27-06-23',18,20,9);

INSERT INTO presion_atmosferica 
(fecha_hora,fk_locacion,altitud)
values 
('21-06-23',2,68),
('23-06-23',0,79),
('25-06-23',0,77),
('17-06-23',0,59);

insert into provincia
(provincia)
values
('buenos_aires'),
('chaco'),
('formosa'),
('corrientes'),
('santiago_del_estero'),
('misiones'),
('chubut'),
('san_luis'),
('santa_fe'),
('san_juan'),
('jujuy'),
('salta'),
('catamarca'),
('cordoba'),
('la_pampa'),
('neuquen'),
('rio_negro'),
('tierra_del_fuego'),
('entre_rios'),
('la_rioja'),
('mendoza'),
('santa_cruz'),
('tucuman');


select*from estadisticas;
select*from intensidad_solar;
select*from locacion;
select*from precipitaciones;
select*from presion_atmosferica;
select*from provincia;
select*from temperatura_humedad;
select*from titular;
select*from usuario;