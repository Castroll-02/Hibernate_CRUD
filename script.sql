create database orm;
use orm;

create table usuarios(
id int not null primary key,
usuario varchar(30) not null,
clave varchar(150) not null,
creacion date null 
);

select * from usuarios