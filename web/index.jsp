<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>30Fit</title>
        <meta name="viewport" content="width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="CSS/index/inicio_2.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="CSS/navegador/navegador.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" type="image/x-icon" href="icons/logo/peso.png">
    </head>
    <body>
        <%--------------------------------------------- CONTENEDOR DEL BANNER -------------------------------------------------%>
        <header class="header">
            <div class="contenedor">
                <h1 class="logo">30Fit</h1>
            </div>
        </header>
        <div class="banner">
            <img src="img/banner.jpg" alt="Titulo_1" class="banner_img" >
            <div class="contenedor">
                <h2 class="banner__titulo">Bienvenido 30Fit</h2>
                <p class="banner__text">Trabaje con nosotros y cumple tus sueños</p>
            </div>
        </div>

        <div class="w3-container">
            <button onclick="document.getElementById('id01').style.display = 'block'" class="w3-button w3-green w3-large" id="btn-login">Iniciar Sesion</button>

            <div id="id01" class="w3-modal">
                <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                    <%--------------------------------------------- Iniciar Sesion-------------------------------------------------%>

                    <div class="w3-center"><br>
                        <span onclick="document.getElementById('id01').style.display = 'none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                        <h1>Inicio Sesion</h1>
                    </div>



                    <form class="w3-container" action="login" method="post" id="login">
                        <div class="w3-section">
                            <label for="nomUsuario"><b>Usuario</b></label>
                            <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Username" name="nomUsuario" id="nomUsuario">
                            <label for="password"><b>Contraseña</b></label>
                            <input class="w3-input w3-border" type="password" placeholder="Enter Password" name="password" id="password">
                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="button"  id="boton-login" name="btn-login">Iniciar Sesion</button>
                            <input class="w3-check w3-margin-top" type="checkbox" checked="checked" > Recuerdame
                        </div>
                    </form>

                    <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
                        <button onclick="document.getElementById('id01').style.display = 'none'" type="button" class="w3-button w3-red">Cancelar</button>
                        <span class="w3-right w3-padding w3-hide-small"><a href="controlador?opcion=registroUsuario">¿No tienes cuenta?</a></span>
                    </div>

                </div>
            </div>
        </div>

        <%
            HttpSession sesion = request.getSession();

            if (request.getParameter("cerrar") != null) {
                sesion.invalidate();
            }

        %>

        <%--------------------------------------------- CONTENEDOR DE TITULOS -------------------------------------------------%>

        <main class="main">
            <div class="contenedor">
                <section class="info">
                    <articule class="info__columna">
                        <img src="img/img-rutinas/Titulos/Titulo_1.jpg" alt="" class="info__img">
                        <h2 class="info__titulo">Entrenador Perzonalizada</h2>
                        <p class="info__txt">El entrenador personal guarda los datos que hicieron en una rutina de ejercicio</p>
                    </articule>
                    <articule class="info__columna">
                        <img src="img/img-rutinas/Titulos/Titulo_3.jpg" width="301" height="251" alt="" class="info__img">
                        <h2 class="info__titulo">Es Accesible</h2>
                        <p class="info__txt">Es accesible a los usuario que utiliza nuestra aplicacion web 30Fit.</p>
                    </articule>
                    <articule class="info__columna">
                        <img src="img/img1.jpg" alt="" class="info__img">
                        <h2 class="info__titulo">Mejora Tu Salud</h2>
                        <p class="info__txt">Es importante mejorar la salud a los usuarios y mejorar el cuerpo corporal con la ayuda de 30Fit.</p>
                    </articule>
                </section>

                <%--------------------------------------------- CONTENEDOR DE CLASES O CURSOS -------------------------------------------------%>

                <section class="cursos">
                    <h2 class="section__titulo">Nuestros Clases</h2>
                    <div class="cursos__columna">
                        <img src="img/img-rutinas/brazos/ab4237f187da4ab39bcd26abaae1a866.jpg" alt="imagewn_2" class="cursos__img">
                        <div class="cursos__description">
                            <h3 class="cursos__titulo">Rutina de Bipceps</h3>
                            <p class="cursos__txt">En esta rutina para bíceps prácticamente, vamos a utilizar los ejercicios más efectivos
                                para potenciar el crecimiento.</p>
                        </div>
                    </div>
                    <div class="cursos__columna">
                        <img src="img/img-rutinas/Tripces/maxresdefault.jpg" alt="imagewn_2" class="cursos__img">
                        <div class="cursos__description">
                            <h3 class="cursos__titulo">Ruitnas Tripces</h3>
                            <p class="cursos__txt">rutina para triceps podrás lograr trabajarlos completamente y te servirá para aumentar el músculo y perder grasa.</p>
                        </div>
                    </div>
                    <div class="cursos__columna">
                        <img src="img/img-rutinas/Pecho/nike_skylar_diggins_3_32776.jpg" alt="imagewn_2" class="cursos__img">
                        <div class="cursos__description">
                            <h3 class="cursos__titulo">Ruitna de Pecho</h3>
                            <p class="cursos__txt">rutina para pecho con la cual trabajaremos completamente el area pectoral y nos servira para aumentar musculo y perder grasa, recomendada para usuarios principiantes e intermedios.</p>
                        </div>
                    </div>
                    <div class="cursos__columna">
                        <img src="img/img-rutinas/espalda/EjerciciosGimnasioEspaldaBarra.jpg" alt="imagewn_2" class="cursos__img">
                        <div class="cursos__description">
                                <h3 class="cursos__titulo">Rutina de Espalda</h3>
                            <p class="cursos__txt">El desarrollo de una espalda ancha y voluminosa puede mejorar enormemente tu aspecto físico. El famosa “forma V</p>
                        </div>
                    </div>
                </section>
            </div>
        </main>
        <%@include file="publicidad.jsp" %>

        <%--------------------------------------------- JavaScript-------------------------------------------------%>

        <script src="JS/register/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="JS/login/login.js" type="text/javascript"></script>

