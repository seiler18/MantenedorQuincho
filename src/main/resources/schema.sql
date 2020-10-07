-- descomentar línea de abajo, después de la primera ejecución.
DROP table arriendo_quincho;  DROP table departamento; DROP table estado; DROP table hibernate_sequence;


-- arriendo_quincho definition
CREATE TABLE arriendo_quincho (
	id integer not null, 
	fecha date,
	departamento_id integer,
	estado_id integer,
	primary key (id)
);

-- departamento definition

CREATE TABLE departamento (
	id integer not null,
	numero integer,
	primary key (id)
);

-- estado definition

CREATE TABLE estado (
	id integer not null, 
	descripcion varchar, 
	primary key (id)
);

-- hibernate_sequence definition

CREATE TABLE hibernate_sequence (
	next_val bigint
);