<%@page import="java.sql.Date"%>
<%@page import="DAO.DAOUsuario"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession sesion = request.getSession();

    HttpSession objSesion = request.getSession(false);
    String nomUsuario_us = (String) objSesion.getAttribute("nomUsuario_us");
    if (nomUsuario_us.equals("")) {
        response.sendRedirect("index.jsp");
    }

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="CSS/navegador/navegador.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/perfil/perfil.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" type="image/x-icon" href="icons/logo/peso.png">


        <title>30Fir</title>
    </head>
    <body>
        <%--------------------------------------------- HEADER-------------------------------------------------%>

        <header class="header">
            <div class="contenedor">
                <h1 class="logo">30Fit</h1>
                <%@include file="navegador.jsp" %>
            </div>
        </header>
        <div class="banner">
            <img src="img/banner.jpg" alt="Titulo_1" class="banner_img" >
            <div class="contenedor">
                <h2 class="banner__titulo">Perfil</h2>
                <p class="banner__text">Trabaje con nosotros y cumple tus sueños</p>
            </div>
        </div>

        <%--------------------------------------------- CONTENEDOR INFORMACION-------------------------------------------------%>
        <main class="main">
            <nav class="nav-contenedor">
                <h2><% out.println(nomUsuario_us); %></h2>

                <div class="borde__text"></div><br>
                <articule>
                    <table>
                        <thead>
                            <tr>
                                <th>Nombre</th>
                                <th>Apellido</th>
                                <th>Sexo</th>
                                <th>Correo</th>
                                <th>Nombre Usuario</th>
                                <th>Contraseña</th>
                                <th>Telefono</th>
                                <th>Páis</th>
                                <th>Peso Actual</th>
                                <th>Estatura</th>
                                <th colspan="1">Operacion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%--------------------------------------------- TABLA DE LISTAR TODOS LOS USUARIOS-------------------------------------------------%>

                            <%
                                List<Usuario> listaUsuario
                                        = (List<Usuario>) request.getAttribute("listaUsuario");
                                for (Usuario u : listaUsuario) {
                                    out.println("<tr>");
                                    out.println("<td" + ">" + u.getNombre_us() + "</td>");
                                    out.println("<td" + ">" + u.getApellido_us() + "</td>");
                                    out.println("<td" + ">" + u.getSexo_us() + "</td>");
                                    out.println("<td" + ">" + u.getCorreo_us() + "</td>");
                                    out.println("<td" + ">" + u.getNomUsuario_us() + "</td>");
                                    out.println("<td" + ">" + u.getPassword_us() + "</td>");
                                    out.println("<td" + ">" + u.getNumCelular_us() + "</td>");
                                    out.println("<td" + ">" + u.getPais() + "</td>");
                                    out.println("<td" + ">" + u.getPeso_us() + "</td>");
                                    out.println("<td" + ">" + u.getEstatura_us() + "</td>");
                                    out.println("<td><a class='btn-clases' href='controlador?opcion=borrar&cod_us=" + u.getCod_us() + "'>Borrar</a></td>");
                                    out.println("<td><a class='btn-clasesEdi' href='controlador?opcion=editar&cod_us=" + u.getCod_us() + "'>Editar</a></td>");
                                    out.println("</tr>");
                                }
                            %>
                        </tbody>
                    </table>
                </articule>
            </nav>
        </main>

    </body>

    <%@include file="publicidad.jsp" %>

</html>
