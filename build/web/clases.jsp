<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="CSS/rutina/clasesRutinas.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/navegador/navegador.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" type="image/x-icon" href="icons/logo/peso.png">
        <title>30Fit</title>
    </head>
    <body>

        <%--------------------------------------------- CONTENEDOR DEL BANNER -------------------------------------------------%>
        <header class="header">
            <div class="contenedor">
                <h1 class="logo">30Fit</h1>
                <%@include file="navegador.jsp" %>
            </div>
        </header>
        <div class="banner">
            <img src="img/banner.jpg" alt="Titulo_1" class="banner_img" >
            <div class="contenedor">
                <h2 class="banner__titulo">Clases De Rutina Ejercicio</h2>
                <p class="banner__text">Trabaje con nosotros y cumple tus sueños<.</p>
            </div>
        </div>
        <%--------------------------------------------- CONTENEDOR INFORMACION-------------------------------------------------%>
        <main class="main">

            <%-----------------------------------------------CONTENEDOR CLASES RUTINAS-----------------------------------------------%>
            <div class="contenedor">
                <div class="descripcion__txt">

                    <h1>Nuestras Clases</h1>
                    <div class="border__txt"></div>
                    <p>Las clases son drop-in y se incluyen con su membresía. 
                        Las pulseras se requieren para la entrada en todas las clases de la aptitud del grupo y están disponibles 
                        comenzar treinta minutos antes de la hora de comienzo programada para cada clase</p>
                </div>

                <%---------------------------------------------RUTINA 1 -------------------------------------------------%>
                <section class="contenedor__imgDer">
                    <article class="class_img">
                        <img src="img/img-rutinas/brazos/banner_brazos.jpg">
                    </article>

                    <article class="info">
                        <h2>Clases De Biceps y Tripces</h2>
                        <p class="class__info">El desarrollo de todo el desarrollo de los brazos, aumenta el incremento muscular y perdida de grasa.</p>
                        <a href="Rutina?opcion=class_tripces" class="btn-clases"id="nav-espalda" id="nav-tripces">Detalles</a>
                    </article>
                </section>
                <%---------------------------------------------RUTINA 2 -------------------------------------------------%>
                <section class="contenedor__imgIzq">
                    <article class="class_img">
                        <img src="img/img1.jpg">
                    </article>

                    <article class="info">
                        <h2>Clases De Espalda</h2>
                        <p class="class__info">El desarrollo de una espalda ancha y voluminosa puede mejorar enormemente tu aspecto físico. El famosa “forma de v” crea la ilusión de una cintura pequeña y un gran tamaño.</p>
                        <a href="Rutina?opcion=class_espalda" class="btn-clases" id="nav-hombros">Detalles</a>
                    </article>
                </section>

                <%---------------------------------------------RUTINA 3-------------------------------------------------%>
                <section class="contenedor__imgDer">
                    <article class="class_img">
                        <img src="img/img-rutinas/Pecho/nike_skylar_diggins_3_32776.jpg">
                    </article>

                    <article class="info">
                        <h2>Clases De Pecho</h2>
                        <p class="class__info">rutina para pecho con la cual trabajaremos completamente el area pectoral y nos servira para aumentar musculo y perder grasa, recomendada para usuarios principiantes e intermedios.</p>
                        <a href="Rutina?opcion=class_pecho" class="btn-clases" id="nav-pecho">Detalles</a>
                    </article>
                </section>
            </div>
        </main>
        <%@include file="publicidad.jsp" %>
    </body>
</html>