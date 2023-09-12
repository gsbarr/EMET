insert into titular
(nombre,apellido,fk_location,domicilio)
values
(dante,sparda,123,'la plata');

insert into locacion
(nombre,cordenadas,fktitular,direccion)
values 
('buenos aires','la plata'),
('santiago del estero','santiago del estero'),
('chubut','rawson'),
('chaco','resistencia');

INSERT INTO ESTADISTICAS 
(fecha_hora,promedio,resultado)
values
('21/06/23',14,18,30),
('23/06/23',16,19,45),
('25/06/23',12,34,37),
('27/06/23',14,40,42);

INSERT INTO USUARIO 
(usuario,contraseña,correo)
VALUES 
(coco,4329,correo.ejemplo1gmail.com)
()
()
();

INSERT INTO TEMPERATURA_HUMEDAD
(fecha_hora,val_temp,val_hum,fklocacion)
VALUES 
()
()
()
();

INSERT INTO PRECIPITACIONES 
(fecha_hora,fklocacion,valor precipitaciones)
VALUES 
('21/06/23', 15,'15:30'),
('23/06/23', 17,'17:40'),
('25/06/23', 12,'12:50'),
('27/06/23', 13,'13:25');

INSERT into intensidad_solar 
(fecha_hora,fklocacion,lumenes,insolacion)
VALUES
('21/06/23',12,20,10),
('23/06/23',14,17,11),
('25/06/23',16,18,13),
('27/06/23',18,20,9);

INSERT INTO presion_atmosferica 
(fecha_hora,fklocacion,altitud)
values 
('21/06/23',2,80),
('23/06/23',0,89),
('25/06/23',0,87),
('17/06/23',0,99);


