SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS cochesreserva;
DROP TABLE IF EXISTS Reserva;
DROP TABLE IF EXISTS Clientes;
DROP TABLE IF EXISTS Coches;




/* Create Tables */

CREATE TABLE Clientes
(
	CODIGO bigint NOT NULL AUTO_INCREMENT,
	DNI varchar(20) NOT NULL,
	NOMBRE varchar(200) NOT NULL,
	DIRECCION varchar(200) NOT NULL,
	TELEFONO varchar(20) NOT NULL,
	PRIMARY KEY (CODIGO),
	UNIQUE (CODIGO)
);


CREATE TABLE Coches
(
	matricula varchar(30) NOT NULL,
	marca varchar(30) NOT NULL,
	modelo varchar(30) NOT NULL,
	color varchar(30) NOT NULL,
	pxhora float NOT NULL,
	PRIMARY KEY (matricula),
	UNIQUE (matricula)
);


CREATE TABLE cochesreserva
(
	codAlquiler bigint NOT NULL,
	matriculaCoche varchar(30) NOT NULL,
	litrosinicio  float NOT NULL,
	PRIMARY KEY (codAlquiler, matriculaCoche),
	UNIQUE (codAlquiler),
	UNIQUE (matriculaCoche)
);


CREATE TABLE Reserva
(
	CODIGO bigint NOT NULL AUTO_INCREMENT,
	cliente bigint NOT NULL,
	fechainicio datetime NOT NULL,
	fechafin datetime NOT NULL,
	preciototal float NOT NULL,
	aval bigint,
	PRIMARY KEY (CODIGO),
	UNIQUE (CODIGO),
	UNIQUE (cliente)
);



/* Create Foreign Keys */

ALTER TABLE Reserva
	ADD FOREIGN KEY (cliente)
	REFERENCES Clientes (CODIGO)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Reserva
	ADD FOREIGN KEY (aval)
	REFERENCES Clientes (CODIGO)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE cochesreserva
	ADD FOREIGN KEY (matriculaCoche)
	REFERENCES Coches (matricula)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE cochesreserva
	ADD FOREIGN KEY (codAlquiler)
	REFERENCES Reserva (CODIGO)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



