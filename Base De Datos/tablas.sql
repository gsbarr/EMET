
CREATE TABLE presion_atmosferica (
    id INT PRIMARY KEY auto_increment,
    fecha_hora DATE,
    fk_location VARCHAR(255),
    altitud VARCHAR(15)
);

CREATE TABLE locacion (
    id INT PRIMARY KEY auto_increment,
    nombre VARCHAR(255),
    coordenadas VARCHAR(255),
    titular VARCHAR(255),
    dirección VARCHAR(255)
);

CREATE TABLE temperatura_humedad (
    id INT PRIMARY KEY auto_increment,
    val_temp VARCHAR(255),
    val_hum VARCHAR(255),
    fk_location VARCHAR(255),
    fecha_hora DATE
);

CREATE TABLE intensidad_solar (
    id INT PRIMARY KEY auto_increment,
    lumenes VARCHAR(255),
    fk_location VARCHAR(255),
    fecha_hora DATE
);

CREATE TABLE usuario (
    id INT PRIMARY KEY auto_increment,
    usuario VARCHAR(255),
    contraseña VARCHAR(255),
    correo VARCHAR(255)
);

CREATE TABLE titular (
    id INT PRIMARY KEY auto_increment,
    nombre VARCHAR(255),
    apellido VARCHAR(255),
    fk_location VARCHAR(255),
    domicilio VARCHAR(255)
);

CREATE TABLE precipitaciones (
    id INT PRIMARY KEY auto_increment,
    fk_location VARCHAR(255),
    valor_precipitaciones VARCHAR(255),
    fecha_hora DATE
);

CREATE TABLE provincia (
    id INT PRIMARY KEY auto_increment,
    provincia VARCHAR(255)
)