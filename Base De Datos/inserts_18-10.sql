use emet;

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

INSERT INTO usuario
(usuario,password,email)
VALUES 
('tomaslou','qwerty456','coco123@,correo.ejemplo1gmail.com'),
('dantesparda','devilmy123','dante123@correo.ejemplogmail.com'),
('vergilstone','mycrw123','vergil45@correo.ejemplo.gmail.com'),
('neronwiil','devilcry1234','nero.@correo,ejemplo.gmail.com');

INSERT INTO `domicilio` (`direccion`, `fk_provincia`) VALUES
('los talas 24', 1);
INSERT INTO `domicilio` (`direccion`, `fk_provincia`) VALUES
('122 185', 2);
INSERT INTO `domicilio` (`direccion`, `fk_provincia`) VALUES
('12 85', 3);

INSERT INTO `titular` ( `apellido`, `nombre`, `razon_social`, `fk_domicilio`, `fk_usuario`, `telefono`) VALUES
('Barreiro', 'Gabriel', 'empresa', 1, 1, '0220215481');

INSERT INTO `locacion` (`direccion`, `nombre`, `fk_titular`, `coordenadas`) VALUES
('122 545', 'EEST n1', 1, '24 53'),
('12 545', 'EEST n2', 1, '244 323');



INSERT INTO `estadisticas` (`id`, `fecha`, `hum`, `int_solar`, `pre_atmos`, `precipitacion`, `temp`) VALUES ('1', '2023-10-09 19:19:35.000000', '75', '32', '64', '36', '30');
INSERT INTO `estadisticas` (`id`, `fecha`, `hum`, `int_solar`, `pre_atmos`, `precipitacion`, `temp`) VALUES ('2', '2023-10-10 19:19:35.000000', '75', '32', '64', '36', '30');
INSERT INTO `estadisticas` (`id`, `fecha`, `hum`, `int_solar`, `pre_atmos`, `precipitacion`, `temp`) VALUES ('3', '2023-10-11 19:19:35.000000', '75', '32', '64', '36', '30');
INSERT INTO `estadisticas` (`id`, `fecha`, `hum`, `int_solar`, `pre_atmos`, `precipitacion`, `temp`) VALUES ('4', '2023-10-12 19:19:35.000000', '75', '32', '64', '36', '30');
INSERT INTO `estadisticas` (`id`, `fecha`, `hum`, `int_solar`, `pre_atmos`, `precipitacion`, `temp`) VALUES ('5', '2023-10-13 19:19:35.000000', '75', '32', '64', '36', '30');
INSERT INTO `estadisticas` (`id`, `fecha`, `hum`, `int_solar`, `pre_atmos`, `precipitacion`, `temp`) VALUES ('6', '2023-10-14 19:19:35.000000', '75', '32', '64', '36', '30');
INSERT INTO `estadisticas` (`id`, `fecha`, `hum`, `int_solar`, `pre_atmos`, `precipitacion`, `temp`) VALUES ('7', '2023-10-15 19:19:35.000000', '75', '32', '64', '36', '30');