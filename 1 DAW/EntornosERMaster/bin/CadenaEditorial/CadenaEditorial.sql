SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Articulos;
DROP TABLE IF EXISTS Empleados;
DROP TABLE IF EXISTS Periodistas;
DROP TABLE IF EXISTS Revistas;
DROP TABLE IF EXISTS Sucursal;




/* Create Tables */

CREATE TABLE Articulos
(
	revista bigint NOT NULL,
	periodista varchar(20) NOT NULL,
	titulo varchar(100) NOT NULL,
	descripcion varchar(500) NOT NULL,
	PRIMARY KEY (revista, periodista),
	UNIQUE (revista),
	UNIQUE (periodista),
	UNIQUE (revista, periodista)
);


CREATE TABLE Empleados
(
	DNI varchar(20) NOT NULL,
	nombre varchar(100) NOT NULL,
	apellidos varchar(100) NOT NULL,
	direccion varchar(200) NOT NULL,
	telefono varchar(20) NOT NULL,
	sucursal bigint NOT NULL,
	PRIMARY KEY (DNI),
	UNIQUE (DNI),
	UNIQUE (sucursal)
);


CREATE TABLE Periodistas
(
	DNI varchar(20) NOT NULL,
	nombre varchar(100) NOT NULL,
	apellidos varchar(100) NOT NULL,
	direccion varchar(200) NOT NULL,
	telefono varchar(20) NOT NULL,
	especialidad varchar(50) NOT NULL,
	PRIMARY KEY (DNI),
	UNIQUE (DNI)
);


CREATE TABLE Revistas
(
	codigo bigint NOT NULL AUTO_INCREMENT,
	fechapublicacion date NOT NULL,
	sucursaleditorial bigint NOT NULL,
	numpaginas bigint NOT NULL,
	periodicidad bigint NOT NULL,
	tipo varchar(100) NOT NULL,
	ejemplaresvendidos bigint NOT NULL,
	PRIMARY KEY (codigo),
	UNIQUE (codigo),
	UNIQUE (sucursaleditorial)
);


CREATE TABLE Sucursal
(
	codigo bigint NOT NULL AUTO_INCREMENT,
	domicilio varchar(200) NOT NULL,
	telefono varchar(20) NOT NULL,
	PRIMARY KEY (codigo),
	UNIQUE (codigo)
);



/* Create Foreign Keys */

ALTER TABLE Articulos
	ADD FOREIGN KEY (periodista)
	REFERENCES Periodistas (DNI)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Articulos
	ADD FOREIGN KEY (revista)
	REFERENCES Revistas (codigo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Empleados
	ADD FOREIGN KEY (sucursal)
	REFERENCES Sucursal (codigo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Revistas
	ADD FOREIGN KEY (sucursaleditorial)
	REFERENCES Sucursal (codigo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



