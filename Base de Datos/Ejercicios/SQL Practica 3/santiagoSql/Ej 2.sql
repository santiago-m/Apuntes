-- EJERCICIO 2

SELECT * FROM competencia where categoria<5;

SELECT club.*, participacion.NRO_COMPETENCIA, participacion.PUESTO, competencia.CATEGORIA FROM club join participacion join competencia where participacion.NRO_CLUB = club.NRO_CLUB and participacion.NRO_COMPETENCIA = competencia.NRO_COMPETENCIA and competencia.CATEGORIA=5;

SELECT club.NOMBRE_CLUB FROM club join participacion join competencia where participacion.NRO_CLUB = club.NRO_CLUB and participacion.NRO_COMPETENCIA = competencia.NRO_COMPETENCIA and competencia.CATEGORIA=5;




