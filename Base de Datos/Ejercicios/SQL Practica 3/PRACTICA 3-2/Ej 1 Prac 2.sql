drop schema if exists ejercicio1Practica2 cascade;
CREATE schema ejercicio1Practica2;


DROP TABLE IF EXISTS  ejercicio1Practica2.articulo;
CREATE TABLE  ejercicio1Practica2.articulo  (
	COD_ARTICULO int NOT NULL
	DESCRIPCION varchar(40) default NULL
	PRECIO decimal(9, 2) default NULL
	CANTIDAD int NOT NULL
	STOCK_MIN int NOT NULL
	STOCK_MAX int NOT NULL
	MES_ULT_MOVIM VARCHAR(11) default NULL
	FECHA_VTO date default NULL

	CONSTRAINT cantMayToStock CHECK (CANTIDAD >= STOCK_MIN);
	CONSTRAINT precio_positivo CHECK (PRECIO > 0);
	
	PRIMARY KEY  (COD_ARTICULO)
);

INSERT INTO ejercicio1practica2.articulo (cod_articulo, descripcion, precio, cantidad, stock_min, stock_max, mes_ult_movim, fecha_vto) values
 (001, 'Descripcion art 1', 44, 15, 10, 25, 'febrero', '24/05/2017'),
 (002, 'Descripcion art 2', 50, 15, 15, 20, 'enero', '15/06/2017'),
 (003, 'Descripcion art 3', 100, 5, 3, 25, 'marzo', '15/12/2017')
 (004, 'Descripcion art 4', 25, 20, 10, 20, 'enero', '13/08/2017');
;
