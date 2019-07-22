<%@page import="modelo.Usuario"%>
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
                <h2 class="banner__titulo">Clases de pecho.</h2>
                <p class="banner__text">Realiza fuerte con los brazos para tener una buena fuerza y un incremento de mas.</p>
            </div>
        </div>
        <%--------------------------------------------- CONTENEDOR INFORMACION-------------------------------------------------%>
        <main class="main">
            <div class="contenedor">
                <%---------------------------------------------RUTINA BRAZO #1 -------------------------------------------------%>
                <section class="contenedor__imgIzq">
                    <article class="class_img">
                        <img src="img/Clases_Rutinas/PECHO/1.gif" width="500px" height="500px">
                    </article>

                    <article class="info">
                        <h2>Pectorales</h2>
                        <p class="class__info">Acostado en una banca plana, agarras la barra que esta colocada en su sostén (como se observa en el dibujo). Cuando estes listo y preferiblemente con otra persona que pueda ayudarte en el caso de que no puedas levantar el peso, inicia la flexión de ambos miembros superiores acercando el peso a tu pecho. 
                            Cuando hayas tocado o casi tocado tu pecho, inmediatamente extenderás los brazos para llegar a la posición con que iniciaste. 
                            Este es uno de los ejercicios para pecho mas comúnmente recomendados en los gimnasios, ya que es fácil de realizar y trabajarás todo el pectoral mayor.</p>

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
                                            <input type="hidden" name="cuerpo_corporal" value="Pecho">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Pectorales">


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
                        <img src="img/Clases_Rutinas/PECHO/2.gif" width="500px" height="500px">
                    </article>

                    <article class="info">
                        <h2>Banca Inclinada</h2>
                        <p class="class__info">
                            Colocado en una banca inclinada (generalmente a 45 grados), sostienes la barra que esta en su sostén. 

                            Cuando estes listo y preferiblemente con otra persona que pueda ayudarte en el caso de que no puedas levantar el peso, inicia la 
                            flexión de ambos brazos acercando el peso a tu pecho.
                            Cuando hayas tocado o casi tocado tu pecho, inmediatamente subes a tu posición inicial, siempre conservando una línea recta al 
                            bajar y subir..</p>
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
                                            <input type="hidden" name="cuerpo_corporal" value="Pecho">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Banca Inclinada">


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
                <section class="contenedor__imgIzq" >
                    <article class="class_img">
                        <img src="img/Clases_Rutinas/PECHO/4.gif" width="500px" height="500px">
                    </article>

                    <article class="info">
                        <h2>Aperturas Planas</h2>
                        <p class="class__info">Acostado, con dos mancuernas sosteniéndolas en línea recta con los hombros ( como se muestra en la imágen). Iniciarás el movimiento alejando las mancuernas hasta que queden a ambos lados de tu cuerpo (como en posición de crucificado). Luego por medio de la contracción de ambos pectorales, acercarás nuevamente las mancuernas como en el inicio. 
                            Recuerda que todos los ejercicios para pecho,deberás realizarlos de la manera indicada para evitar lesiones a nivel de los hombros. 
                            Trabajarás principalmente la región lateral del pectoral mayor y el pectoral menor</p>

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
                                            <input type="hidden" name="cuerpo_corporal" value="Pecho">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Aperturas Planas<">


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
                        <img src="img/Clases_Rutinas/PECHO/5.gif" width="500px" height="500px">
                    </article>

                    <article class="info">
                        <h2>Pectoral Contractor</h2>
                        <p class="class__info">
                            Sentado en la máquina de pectoral contractor que puedes encontrar en la mayoría de los gimnasios y con la espalda recta, coloca los brazos yantebrazos como se muestra en la figura. 
                            Acerca ambas almohadillas del equipo por medio de un movimiento hacia el centro, de tal forma que dichas almohadillas casi se toquen entre sí.Luego con un desplazamiento controlado, regresa a la posición de inicio. 
                            Los ejercicios para pecho en la máquina de pectoral contractor,te harán trabajar principalmente las regiones laterales y medias del pectoral mayor y el pectoral menor. </p>

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
                                            <input type="hidden" name="cuerpo_corporal" value="Pecho">

                                            <label for="nombre_rut" style="display: none;"><b>Nombre Rutina</b></label>
                                            <input type="hidden" name="nombre_rut" value="Pectoral Contractor">


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