DROP TABLE persona if exists;

create table persona(
	id BIGINT IDENTITY NOT NULL PRIMARY KEY,
	primer_nombre VARCHAR(20),
	segundo_nombre VARCHAR(20),
	telefono VARCHAR(20)
);