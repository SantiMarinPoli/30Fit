<%@page import="modelo.Usuario"%>
<%@page import="java.util.LinkedList"%>
<%@page import="modelo.Pais"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>30Fit</title>
        <meta name="viewport" content="width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="CSS/inicio/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/inicio/register.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/font.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/navegador/navegador.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" type="image/x-icon" href="icons/logo/peso.png">
    </head>
    <body>
        <%--------------------------------------------- Formularios -------------------------------------------------%>
        <header class="header">
            <div class="contenedor">
                <h1 class="logo">30Fit</h1>
                <%@include file="navegador.jsp" %>
            </div>
        </header>

        <form action="controlador" method="post" class="form-register" onsubmit="return validarCamposVacios()" id="form-input">

            <h2 class="form__titulo">Modificar Usuario</h2>
            <div class="contenedor-inputs">


                <%
                    Usuario u = (Usuario) request.getAttribute("usuario");
                %>
                <input type="hidden" value="editar" name="operacion">
                <label for="cod" style="display: none;">Id Usuario </label>
                <%
                    out.println("<input type='hidden' name='cod' id='cod' value='" + u.getCod_us() + "'/>");
                %>

                <label for="nombre" style="display: none;">Nombre </label>
                <%
                    out.println("<input type='text' id='nombre_us' name='nombre' class='input-100' onkeypress='return validarSoloLetras(event)' value='" + u.getNombre_us() + "'/> ");
                %>
                <div class="error" id="msg-nombre" style="display: none;">Dame su nombre.</div>

                <label for="apellido" style="display: none">Apellidos </label>
                <%
                    out.println("<input type='text' id='apellido_us' name='apellido' class='input-100' onkeypress='return validarSoloLetras(event)' value='" + u.getApellido_us() + "'/> ");
                %>
                <div class="error" id="msg-apellido" style="display: none;">Dame su apellido.</div>

                <div class="contenerdor-genero">
                    <label for="sexo" style="display: none">Genero</label>
                    <br>
                    <%
                        if (u.getSexo_us().equalsIgnoreCase("Masculino")) {
                    %>

                    <input type="radio" id="masculino" name="sexo" checked="checked" value="Masculino"> 
                    <label for="masculino" class="label-genero">Masculino </label>

                    <input type="radio" id="femenino" name="sexo"  value="Femenino" >
                    <label for="femenino" class="label-genero">Femenino </label>

                    <% }
                        if (u.getSexo_us().equalsIgnoreCase("Femenino")) { %>

                    <input type="radio" id="masculino" name="sexo" value="Masculino"> 
                    <label for="masculino" class="label-genero">Masculino </label>

                    <input type="radio" id="femenino" name="sexo"  value="Femenino" checked="checked">
                    <label for="femenino" class="label-genero">Femenino </label>

                    <%}%>
                    <div class="error" id="msg-genero" style="display: none;">Seleccione su genero.</div>
                </div>

                <label for="fechaNacimiento" class="input-100" style="display: none;">Fecha de Nacimiento</label>
                <%
                    out.println("<input type='date' name='fechaNacimiento' id='fechaNacimiento_us' class='0input-100' value='" + u.getFechaNacimiento_us() + "'/>");
                %>
                <div class="error" id="msg-fechaNacimiento" style="display: none;">Comple tu fecha de nacimiento.</div>
                <br>

                <label for="correo" style="display: none">Correo Electronico </label>
                <%
                    out.println("<input type='email' name='correo' id='correo_us' class='input-100' value='" + u.getCorreo_us() + "'/>");
                %>
                <div class="error" id="msg-correo" style="display: none;">Dame un email correcto.</div>

                <label for="nomUsuario" style="display: none" >Nombre Usuario</label>
                <%
                    out.println("<input type='text' name='nomUsuario' id='nomUsuario_us' placeholder='Usuario' class='input-100' value='" + u.getNomUsuario_us() + "'/>");
                %>

                <br>
                <div class="error" id="msg-usuario" style="display: none;">Dame su nombre de usuario.</div>
                <span id="error1"></span>

                <ul class="ul-usuario">
                    <li id="mayu">1 Mayuscula</li>
                    <li id="min">4 Minusculas</li>
                    <li id="digitos">2 Digitos.</li>
                    <li id="especial">1 Caracter especiual.</li>
                    <li id="caracteres">Minimo 8 caracteres.</li>
                </ul>

                <label for="password" style="display: none">Contraseña </label>
                <%
                    out.println("<input type='password' name='password' id='password_us' placeholder='Contraseña' class='input-100' value='" + u.getPassword_us() + "'/>");
                %>
                <img src="icons/ojo.png" alt="" id="img-ojo-1"/>
                <br>
                <div class="error" id="msg-password" style="display: none;">Dame su nueva contraseña.</div>
                <span id="error2"></span>

                <ul class="ul-password">
                    <li id="mayus">1 Mayusculas.</li>
                    <li id="lower">11 Minusculas.</li>
                    <li id="numbers">3 Digitos.</li>
                    <li id="len">Minimo 15 caracteres.</li>
                </ul>

                <label for="repitaPassword" style="display: none">Repita Contraseña </label>
                <%
                    out.println("<input type='password' name='repitaPassword' id='repitaPassword_us' placeholder='Repita contraseña' class='input-100' value='" + u.getPassword_us() + "'/>");
                %>
                <img src="icons/ojo.png" alt="" id="img-ojo-2"/>
                <div class="error" id="msg-repitaPassword" style="display: none;">Repite la contraseña.</div>
                <span id="msg-error"></span>
                <br>
                <span id="error3"></span>

                <label for="numCelular" style="display: none">Numero de Celular </label>
                <%
                    out.println("<input type='text' id='numeroCelular_us' name='numCelular' class='input-100' onkeypress='return validarSoloNumeros(event)' value='" + u.getNumCelular_us() + "'/> ");
                %>
                <div class="error" id="msg-numeroCelular" style="display: none;">Dame su numero.</div>
                <br>
                <label>¿Donde Vives?</label>
                <br>
                <label for="pais" style="display: none">Pais </label>
                <select name="pais" id="nombre_pais" class="input-100">
                    <%                        // Se recurpera de la variable de sessión la listaPais
                        List<Pais> listaPais = (List<Pais>) request.getAttribute("listaPais");
                        for (Pais pais : listaPais) {
                            if (pais.getCod_pais() == u.getCod_pais()) {
                                out.println("<option selected value='" + pais.getCod_pais() + "' >" + pais.getNombre_pais() + "</option>");
                            } else {
                                out.println("<option  value='" + pais.getCod_pais() + "' >" + pais.getNombre_pais() + "</option>");
                            }
                        }
                    %> 
                </select>
                <div class="error" id="msg-ciudad" style="display: none;">Seleccionar la ciudad.</div>
                <div class="error" id="msg-pais" style="display: none;">Seleccionar el pais.</div>
                <br>
                <label for="peso" style="display: none"> Peso</label>
                <%
                    out.println("<input type='text' id='peso_us' name='peso' placeholder='Ingrese su peso actual' class='input-100' value='" + u.getPeso_us() + "'/> ");
                %>

                <label for="estatura" style="display: none"> Estatura</label>
                <%
                    out.println("<input type='text' id='estatura_us' name='estatura' placeholder='Ingrese su estatura actual' class='input-100' value='" + u.getEstatura_us() + "'/> ");
                %>

                <input type="submit" name="btn-enviar" value="Modificar" class="btn-enviar" id="btn-enviar"><br>
                <input type="submit" name="btn-borrar" value="Limpiar Campos" class="btn-enviar" id="btn-enviar">
            </div>
        </form>   

        <%@include file="publicidad.jsp" %>
        <%--------------------------------------------- JAVASCRIPT -------------------------------------------------%>
        <script src="JS/register/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="JS/register/validarFormularios.js" type="text/javascript"></script>
        <script src="JS/register/validarLetrasNumeros.js" type="text/javascript"></script>
        <script src="JS/register/validarPassword.js" type="text/javascript"></script>
        <script src="JS/register/validarUsuario.js" type="text/javascript"></script>
    </body>
</html>
