USE ministeriodecultura_db;

create table museos (
  codigo  varchar(5) not null,
  nombre varchar(50),
  direccion varchar(30),
  primary key (codigo)
);

create table artistas (
  codigo varchar(5) not null,
  nombre varchar(50),
  apellido varchar(50),
  codigo_museo varchar(5),
  primary key (codigo),
  foreign key (codigo_museo) references museos (codigo)
);

create table pinturas (
  codigo varchar(5) not null,
  precio int,
  fecha date,
  codigo_artista varchar(5),
  primary key (codigo),
  foreign key (codigo_artista) references artistas (codigo)
);

ALTER TABLE pinturas ADD imagenes BLOB;
ALTER TABLE pinturas MODIFY imagenes LONGBLOB;

INSERT INTO museos
VALUES (1,'Museo Nacional de Colombia','Ak. 7 # 28 - 66'),
(2,'Colección de arte del Banco de la República','Calle 11 # 4 -93'),
(3,'Museo de Arte Contemporáneo de Bogotá - MAC','Cra 74 # 82a - 81');


INSERT INTO artistas
VALUES (1,'Rafael','Sanzio',3),
(2,'Vincent','Van Gogh',2),
(3,'Rembrandt','Van Rijn',1);

SELECT * FROM pinturas; 
DELETE FROM pinturas WHERE codigo = "1";

create table pinturas_artistas (
  codigo varchar(5) not null,
  imagenes LONGBLOB,
  primary key (codigo)
);

SELECT * FROM pinturas_artistas;
DELETE FROM pinturas_artistas WHERE codigo = "1";
