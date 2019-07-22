 --------TABLA PAIS------------
drop table RUTINA;
drop table USUARIO;
drop table PAIS;

 --------TABLA PAIS------------
CREATE TABLE PAIS(
    cod_pais NUMBER(8),
    nombre_pais VARCHAR2(40)
)
TABLESPACE TS_30FIT;

 --------TABLA USUARIO------------
  CREATE TABLE USUARIO(
    cod_us NUMBER(8),
    nombre_us VARCHAR2(50),
    apellido_us VARCHAR2(50),
    sexo_us VARCHAR(10), 
    fechaNacimiento_us DATE,
    correo_us VARCHAR2(80),
    nomUsuario_us VARCHAR(20),
    password_us VARCHAR(20),
    numCelular_us VARCHAR2(20),
    cod_pais NUMBER(8),
    peso_us VARCHAR2(10),
    estatura_us VARCHAR2(10)
  )
  TABLESPACE TS_30FIT;
  
--------TABLA RUTINA------------
CREATE TABLE RUTINA(
     cod_rut number (8),
     cod_us number (8),
	 cuerpo_corporal_rut varchar2(50),
	 nombre_rut varchar2(100),
     numSeries_rut number (5),
     numRepeticiones_rut number (5),
     tiempoRepeticiones_rut number(4),
	 nom_time1_rut varchar2(5),
     tiempoDescanso_rut number(4),
	 nom_time2_rut varchar2(5)
    )
TABLESPACE TS_30FIT;