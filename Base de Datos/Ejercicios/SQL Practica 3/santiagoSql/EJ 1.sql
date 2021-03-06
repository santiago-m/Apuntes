SELECT * FROM cliente;

-- EJ 1) a-
SELECT * FROM producto where PRECIO>=999;

SELECT * FROM itemfactura;

-- EJ 1) b-
SELECT COD_PRODUCTO, PRECIO FROM itemfactura NATURAL JOIN producto where CANTIDAD<5;

SELECT COD_PRODUCTO, PRECIO FROM itemfactura where CANTIDAD<5 group by COD_PRODUCTO;

SELECT * FROM producto;

-- EJ 1) c-
SELECT * FROM cliente where NRO_CLIENTE NOT IN (SELECT NRO_CLIENTE FROM factura);

SELECT * FROM cliente where NRO_CLIENTE NOT IN (SELECT NRO_CLIENTE FROM factura) ORDER BY APELLIDO, NOMBRE;

-- EJ 1) d-

SELECT * FROM producto where COD_PRODUCTO NOT IN (SELECT COD_PRODUCTO FROM itemfactura);