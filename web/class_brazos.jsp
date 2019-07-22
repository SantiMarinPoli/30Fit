<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link href="CSS/rutina/clases/clases.css" rel="stylesheet" type="text/css"/>
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
                <h2 class="banner__titulo">Clases de brazos.</h2>
                <p class="banner__text">Realiza fuerte con los brazos para tener una buena fuerza y un incremento de mas.</p>
            </div>
        </div>
        <%--------------------------------------------- CONTENEDOR INFORMACION-------------------------------------------------%>
        <main class="main">
            <div class="contenedor">
                <%---------------------------------------------RUTINA BRAZO #1 -------------------------------------------------%>
                <section class="contenedor__imgIzq">
                    <article class="class_img">
                        <img src="img/img-rutinas/brazos/banner_brazos.jpg" width="500px" height="200px">
                    </article>

                    <article class="info">
                        <h2>Ratione, velit, sint.</h2>
                        <p class="class__info">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>

                        <%---------------------------------------------REGISTRO DE RUTINA BRAZO# 1------------------------------------------------%>
                        <div class="w3-container">
                            <a onclick="document.getElementById('id01').style.display = 'block'" class="btn-clases">Detalles</a>
                            <div id="id01" class="w3-modal">
                                <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">
                                    <div class="w3-center"><br>
                                        <span onclick="document.getElementById('id01').style.display = 'none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                                    </div>

                                    <form class="w3-container" action="Rutina" method="post" onsubmit="return validarCamposVacios()">
                                        <div class="w3-section">
                                            <input class="w3-input w3-border w3-margin-bottom" type="hidden" name="codRtuina" value="0">
                                            <label for="nomUsuario"><b>Nombre Usuario</b></label>
                                            <select name="nomUsuario" class="w3-input w3-border w3-margin-bottom" required>
                                                <%
                                                    List<Usuario> listaUsuario1 = (List<Usuario>) request.getAttribute("listaUsuario");
                                                    for (Usuario u : listaUsuario1) {
                                                        out.println("<option value='" + u.getCod_us() + "' >" + u.getNomUsuario_us() + "</option>");
                                                    }
                                                %>
                                            </select>

                                            <label class="cuerpo_corporal" style="display: none"><b>Cuerpo CorporaL</b></label>
                                            <input type="hidden" name="cuerpo_corporal" value="Brazo">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Btazo_1">


                                            <label for="numSeries"><b>Numero de Series</b></label>
                                            <input class="w3-input w3-border" type="text" name="numSeries" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="numRepeticiones"><b>Numero de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="numRepeticiones" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="timeRepeticiones"><b>Tiempo de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeRepeticiones" required style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">


                                            <select name="nomTime1" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>

                                            <br>
                                            <label for="timeDescansoo"><b>Tiempo de Descanso</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeDescansoo" style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">

                                            <select name="nomTime2" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>
                                            <br>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit"  id="boton-login" name="btn-login">Guardar</button>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="reset"  id="boton-login" name="btn-login">Limpiar Campos</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </article>
                </section>
                <%---------------------------------------------RUTINA BRAZO #2 -------------------------------------------------%>
                <section class="contenedor__imgDer">
                    <article class="class_img">
                        <img src="img/img-rutinas/brazos/banner_brazos.jpg" width="500px" height="500px">
                    </article>

                    <article class="info">
                        <h2>Ratione, velit, sint.</h2>
                        <p class="class__info">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>
                        <%---------------------------------------------REGISTRO DE RUTINA BRAZO# 2------------------------------------------------%>

                        <div class="w3-container">
                            <a onclick="document.getElementById('id01').style.display = 'block'" class="btn-clases">Detalles</a>
                            <div id="id01" class="w3-modal">
                                <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">
                                    <div class="w3-center"><br>
                                        <span onclick="document.getElementById('id01').style.display = 'none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                                    </div>

                                    <form class="w3-container" action="Rutina" method="post" onsubmit="return validarCamposVacios()">
                                        <div class="w3-section">
                                            <input class="w3-input w3-border w3-margin-bottom" type="hidden" name="codRtuina" value="0">
                                            <label for="nomUsuario"><b>Nombre Usuario</b></label>
                                            <select name="nomUsuario" class="w3-input w3-border w3-margin-bottom" required>
                                                <%
                                                    List<Usuario> listaUsuario2 = (List<Usuario>) request.getAttribute("listaUsuario");
                                                    for (Usuario u : listaUsuario2) {
                                                        out.println("<option value='" + u.getCod_us() + "' >" + u.getNomUsuario_us() + "</option>");
                                                    }
                                                %>
                                            </select>

                                            <label class="cuerpo_corporal" style="display: none"><b>Cuerpo CorporaL</b></label>
                                            <input type="hidden" name="cuerpo_corporal" value="Brazo">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Btazo_1">


                                            <label for="numSeries"><b>Numero de Series</b></label>
                                            <input class="w3-input w3-border" type="text" name="numSeries" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="numRepeticiones"><b>Numero de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="numRepeticiones" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="timeRepeticiones"><b>Tiempo de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeRepeticiones" required style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">


                                            <select name="nomTime1" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>

                                            <br>
                                            <label for="timeDescansoo"><b>Tiempo de Descanso</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeDescansoo" style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">

                                            <select name="nomTime2" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>
                                            <br>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit"  id="boton-login" name="btn-login">Guardar</button>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="reset"  id="boton-login" name="btn-login">Limpiar Campos</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </article>
                </section>

                <%---------------------------------------------RUTINA BRAZO #3 -------------------------------------------------%>
                <section class="contenedor__imgIzq">
                    <article class="class_img">
                        <img src="img/img-rutinas/brazos/banner_brazos.jpg" width="500px" height="500px">
                    </article>

                    <article class="info">
                        <h2>Ratione, velit, sint.</h2>
                        <p class="class__info">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>

                        <%---------------------------------------------REGISTRO DE RUTINA BRAZO# 3------------------------------------------------%>

                        <div class="w3-container">
                            <a onclick="document.getElementById('id01').style.display = 'block'" class="btn-clases">Detalles</a>
                            <div id="id01" class="w3-modal">
                                <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">
                                    <div class="w3-center"><br>
                                        <span onclick="document.getElementById('id01').style.display = 'none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                                    </div>

                                    <form class="w3-container" action="Rutina" method="post" onsubmit="return validarCamposVacios()">
                                        <div class="w3-section">
                                            <input class="w3-input w3-border w3-margin-bottom" type="hidden" name="codRtuina" value="0">
                                            <label for="nomUsuario"><b>Nombre Usuario</b></label>
                                            <select name="nomUsuario" class="w3-input w3-border w3-margin-bottom" required>
                                                <%
                                                    List<Usuario> listaUsuario3 = (List<Usuario>) request.getAttribute("listaUsuario");
                                                    for (Usuario u : listaUsuario3) {
                                                        out.println("<option value='" + u.getCod_us() + "' >" + u.getNomUsuario_us() + "</option>");
                                                    }
                                                %>
                                            </select>

                                            <label class="cuerpo_corporal" style="display: none"><b>Cuerpo CorporaL</b></label>
                                            <input type="hidden" name="cuerpo_corporal" value="Brazo">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Btazo_1">


                                            <label for="numSeries"><b>Numero de Series</b></label>
                                            <input class="w3-input w3-border" type="text" name="numSeries" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="numRepeticiones"><b>Numero de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="numRepeticiones" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="timeRepeticiones"><b>Tiempo de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeRepeticiones" required style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">


                                            <select name="nomTime1" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>

                                            <br>
                                            <label for="timeDescansoo"><b>Tiempo de Descanso</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeDescansoo" style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">

                                            <select name="nomTime2" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>
                                            <br>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit"  id="boton-login" name="btn-login">Guardar</button>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="reset"  id="boton-login" name="btn-login">Limpiar Campos</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </article>
                </section>

                <%---------------------------------------------RUTINA BRAZO #4 -------------------------------------------------%>
                <section class="contenedor__imgDer">
                    <article class="class_img">
                        <img src="img/img-rutinas/brazos/banner_brazos.jpg" width="500px" height="500px">
                    </article>

                    <article class="info">
                        <h2>Ratione, velit, sint.</h2>
                        <p class="class__info">Ratione, velit, sint. Quae dolores consequatur obcaecati inventore ipsam libero sint distinctio sed, quaerat vel.</p>

                        <%---------------------------------------------REGISTRO DE RUTINA BRAZO# 4------------------------------------------------%>

                        <div class="w3-container">
                            <a onclick="document.getElementById('id01').style.display = 'block'" class="btn-clases">Detalles</a>
                            <div id="id01" class="w3-modal">
                                <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">
                                    <div class="w3-center"><br>
                                        <span onclick="document.getElementById('id01').style.display = 'none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                                    </div>

                                    <form class="w3-container" action="Rutina" method="post" onsubmit="return validarCamposVacios()">
                                        <div class="w3-section">
                                            <input class="w3-input w3-border w3-margin-bottom" type="hidden" name="codRtuina" value="0">
                                            <label for="nomUsuario"><b>Nombre Usuario</b></label>
                                            <select name="nomUsuario" class="w3-input w3-border w3-margin-bottom" required>
                                                <%
                                                    List<Usuario> listaUsuario4 = (List<Usuario>) request.getAttribute("listaUsuario");
                                                    for (Usuario u : listaUsuario4) {
                                                        out.println("<option value='" + u.getCod_us() + "' >" + u.getNomUsuario_us() + "</option>");
                                                    }
                                                %>
                                            </select>

                                            <label class="cuerpo_corporal" style="display: none"><b>Cuerpo CorporaL</b></label>
                                            <input type="hidden" name="cuerpo_corporal" value="Brazo">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Btazo_1">


                                            <label for="numSeries"><b>Numero de Series</b></label>
                                            <input class="w3-input w3-border" type="text" name="numSeries" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="numRepeticiones"><b>Numero de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="numRepeticiones" required onkeypress="return validarSoloNumeros(event);">

                                            <label for="timeRepeticiones"><b>Tiempo de Repeticiones</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeRepeticiones" required style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">


                                            <select name="nomTime1" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>

                                            <br>
                                            <label for="timeDescansoo"><b>Tiempo de Descanso</b></label>
                                            <input class="w3-input w3-border" type="text"name="timeDescansoo" style="width: 450px; display: inline-block;" onkeypress="return validarSoloNumeros(event);">

                                            <select name="nomTime2" style="width: 100px; display: inline-block; padding: 9px;" class="w3-input w3-border w3-margin-bottom">
                                                <option value="Min">Min</option>
                                                <option  value="Seg">Seg</option>
                                            </select>
                                            <br>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit"  id="boton-login" name="btn-login">Guardar</button>
                                            <button class="w3-button w3-block w3-green w3-section w3-padding" type="reset"  id="boton-login" name="btn-login">Limpiar Campos</button>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </article>
                </section>

            </div>
        </main>
        <%@include file="publicidad.jsp" %>
        <%--------------------------------------------- JAVASCRIPT -------------------------------------------------%>
        <script src="JS/register/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="JS/register/validarLetrasNumeros.js" type="text/javascript"></script>
        <script src="JS/register/validarFormularios.js" type="text/javascript"></script>
    </body>
</html>
