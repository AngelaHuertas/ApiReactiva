create database tienda;
use tienda;
drop database tienda;

CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion varchar(100) not null,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL
);

select * from productos;