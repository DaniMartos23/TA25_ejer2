
DROP table IF EXISTS departamentos;

create table departamentos(
	codigo int auto_increment,
	nombre varchar(100),
	presupuesto int,
	primary key (codigo)
);

DROP table IF EXISTS empleados;

create table empleados(
	dni varchar(8),
	nombre varchar(100),
	apellido varchar(255),
	coddepartamento int,
	primary key (dni),
	foreign key(coddepartamento) references departamentos(codigo) 
);

insert into departamentos (nombre,presupuesto)values('Departamento1',100);
insert into departamentos (nombre,presupuesto)values('Departamento2',200);
insert into departamentos (nombre,presupuesto)values('Departamento3',300);



insert into empleados (dni,nombre, apellido,coddepartamento)values('47117194','Dani','Martos',3);
insert into empleados (dni,nombre, apellido,coddepartamento)values('48117195','Carlos', 'Montero',2);
insert into empleados (dni,nombre, apellido,coddepartamento)values('49117196','Oscar', 'Vilamitjana',1);
