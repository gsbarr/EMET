
insert into titular
(nombre,apellido,domicilio)
values
('dante','slowed','berisso'),
('lucas','tarela','la plata'),
('jorge','castro','ensenada');

insert into locacion
(nombre,coordenadas,fk_titular,direccion)
values 
('buenos aires','la plata',2,'ciudad'),
('santiago del estero','santiago del estero',1,'ciudad'),
('chubut','rawson',1,'ciudad'),
('chaco','resistencia',3,'ciudad');


INSERT INTO estadisticas
(fecha,temperatura,humedad,presion_atmosferica,precipitaciones,int_solar)
values
('21-06-23',14,18,30,1,6),
('23-06-23',16,19,45,2,4),
('25-06-23',12,34,37,5,6),
('27-06-23',14,40,42,3,5),
('12-07-23',27,23.3, 1010,0.1,420.8),
('19-08-23',25.5,25.2, 1012.5,2.1,400.3),
('09-10-23',22.1,58.7, 1014.5,0.8,330.7),
('10-10-23',18.4,70.7, 1026.5,74.2,252.3);

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
('21-06-23', 18,9,1),
('23-06-23', 22,10,1),
('25-06-23', 19,13,1),
('27-06-23', 21,11,1);

INSERT INTO precipitaciones
(fecha_hora,fk_locacion,valor_precipitaciones)
VALUES 
('21-06-23', 1,'15:30'),
('23-06-23', 1,'17:40'),
('25-06-23', 1,'12:50'),
('27-06-23', 1,'13:25');

INSERT into intensidad_solar 
(fecha_hora,fk_locacion,lumenes,insolacion)
VALUES
('21-06-23',1,20,10),
('23-06-23',1,17,11),
('25-06-23',1,18,13),
('27-06-23',1,20,9);

INSERT INTO presion_atmosferica 
(fecha_hora,fk_locacion,altitud)
values 
('21-06-23',1,68),
('23-06-23',1,79),
('25-06-23',1,77),
('17-06-23',1,59);

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