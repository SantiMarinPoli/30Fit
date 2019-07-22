  -------SELECT RUTINA--------------------
 SELECT cod_rut, USUARIO.cod_us AS cod_us, USUARIO.NOMUSUARIO_US AS USUARIO,cuerpo_corporal_rut,nombre_rut,
 numSeries_rut,numRepeticiones_rut,
 tiempoRepeticiones_rut,nom_time1_rut,tiempoDescanso_rut,nom_time2_rut
 FROM RUTINA
 INNER JOIN USUARIO ON RUTINA.cod_us = USUARIO.cod_us
 ORDER BY RUTINA.cod_us; 
 