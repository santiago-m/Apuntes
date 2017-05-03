-- EJ 3

-- πdni (alumno) - πdni(σsexo="masculino"(alumno))

SELECT dni FROM alumno where dni NOT IN (SELECT dni from alumno where sexo="masculino");
-- equals
SELECT dni FROM alumno where sexo="femenino";

-- σRealiza.nro_alumno=Alumno.nro_alumno ((Realiza) x (σsexo="masculino"(alumno)))

SELECT * FROM realiza join alumno where alumno.sexo="masculino" and realiza.nro_alumno=alumno.nro_alumno;


-- (σsexo="femenino"(Alumno)) ∪ (σnro_alumno<5(Alumno))

(SELECT * FROM alumno where sexo="femenino") union (SELECT * FROM alumno where nro_alumno<5);



