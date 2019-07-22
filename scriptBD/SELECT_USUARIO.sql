 ---------SELECT USUARIO----------------------------
 SELECT cod_us, nombre_us, apellido_us, sexo_us, fechaNacimiento_us, correo_us, nomUsuario_us,
  password_us , numCelular_us, PAIS.cod_pais AS cod_pais , PAIS.nombre_pais AS PAIS, peso_us, estatura_us
  FROM USUARIO 
  INNER JOIN PAIS ON USUARIO.cod_pais = PAIS.cod_pais
  ORDER BY USUARIO.cod_us; 