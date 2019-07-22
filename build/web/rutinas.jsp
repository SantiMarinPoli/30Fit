<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="CSS/rutina/rutina.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/navegador/navegador.css" rel="stylesheet" type="text/css"/>
        <title>Healthy Life</title>
    </head>
    <body>

        <%--------------------------------BANNER-------------------------------%>
        <header>
            <div class="contenedor__rutina">
                <h1>Healthy Life</h1>
                <%@include file="navegador.jsp" %>
            </div>
        </header>
        <div class="banner__rutinas">
            <img src="img/banner.jpg" alt="" class="banner__img"/>
            <h1 class="banner__titulo">CLASES</h1>
        </div>
        <main class="main">
            <div class="contenedor">
                <div class="descripcion__txt">
                    <h1>Nuestras Clases</h1>
                    <div class="border__txt"></div>
                    <p>Las clases son drop-in y se incluyen con su membresía. 
                        Las pulseras se requieren para la entrada en todas las clases de la aptitud del grupo y están disponibles 
                        comenzar treinta minutos antes de la hora de comienzo programada para cada clase</p>
                </div>

                <%--------------------------------CONTENEDORES DE CLASES DE RUTINAS-------------------------------%>
                <section class="clases_izq">
                    <%--------------------------------------------Brazos------------------------------------------%>
                    <div class="img-clases">
                        <img src="img/img-rutinas/brazos/banner_brazos.jpg" alt="clase de brazo"/>
                    </div>
                    <div class="txt__clases" id="nav-brazo">
                        <h2>Clases de brazos</h2>
                        <div class="border__txt"></div>
                        <p class="info__txt">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>
                        <a href="class_brazos.jsp" class="btn-clases">Detalles</a>
                    </div>
                </section>


                <section class="clases_der">
                    <%--------------------------------------------Espalda------------------------------------------%>
                    <div class="txt__clases" id="#nav-espalda">
                        <h2>Clases de espalda</h2>
                        <div class="border__txt"></div>
                        <p class="info__txt">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>
                        <a href="#" class="btn-clases">Detalles</a>
                        <div class="img-clases">
                            <img src="img/img-rutinas/brazos/banner_brazos.jpg" alt="clase de brazo"/>
                        </div>
                    </div>
                </section>

                <section class="clases_izq">
                    <%--------------------------------------------ADOMINALES------------------------------------------%>
                    <div class="img-clases" id="#nav-adominales">
                        <img src="img/img-rutinas/brazos/banner_brazos.jpg" alt="clase de brazo"/>
                    </div>
                    <div class="txt__clases">
                        <h2>Clases de adominales</h2>
                        <div class="border__txt"></div>
                        <p class="info__txt">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>
                        <a href="#" class="btn-clases">Detalles</a>
                    </div>
                </section>

                <section class="clases_der">
                    <%--------------------------------------------PIERMAS------------------------------------------%>
                    <div class="txt__clases" id="nav-piernas">
                        <h2>Clases de piernas</h2>
                        <div class="border__txt"></div>
                        <p class="info__txt">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>
                        <a href="#" class="btn-clases">Detalles</a>
                        <div class="img-clases">
                            <img src="img/img-rutinas/brazos/banner_brazos.jpg" alt="clase de brazo"/>
                        </div>
                    </div>

                </section>


            </div>
        </main>
        <%@include file="publicidad.jsp" %>
    </body>
    <script src="JS/register/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="JS/menu/menu.js" type="text/javascript"></script>
</html>
