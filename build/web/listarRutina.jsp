<%@page import="modelo.Rutinas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>

<%
    HttpSession sesion = request.getSession();

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/rutina/clases/clases.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/navegador/navegador.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" type="image/x-icon" href="icons/logo/peso.png">
        <link href="CSS/perfil/perfil.css" rel="stylesheet" type="text/css"/>
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
                <h2 class="banner__titulo">Lista de Rutinas.</h2>
            </div>
        </div>   

        <main class="contenedor">
            <nav class="nav-contenedor">
                <articule>
                    <table>
                        <thead>
                            <tr>
                                <th>Nombre Usuario</th>
                                <th>Cuerpo Corporal</th>
                                <th>Nombre Rutina</th>
                                <th>No# Series</th>
                                <th>No# Repeticiones</th>
                                <th>Tiempo Repeticiomes</th>
                                <th>Tiempo Descanso</th>
                                <th colspan="1">Operacion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%                                
                                List<Rutinas> listaRutina
                                        = (List<Rutinas>) request.getAttribute("listaRutina");
                                for (Rutinas rut : listaRutina) {
                                    out.println("<tr>");
                                    out.println("<td" + ">" + rut.getNomUsuario_us() + "</td>");
                                    out.println("<td" + ">" + rut.getCuerpo_corporal() + "</td>");
                                    out.println("<td" + ">" + rut.getNombre_rut() + "</td>");
                                    out.println("<td" + ">" + rut.getNumSeries_rut() + "</td>");
                                    out.println("<td" + ">" + rut.getNumRepeticiones_rut() + "</td>");
                                    out.println("<td" + ">" + rut.getTiempoRepeticiones_rut() + "</td>");
                                    out.println("<td" + ">" + rut.getTiempoDescanso_rut() + "</td>");
                                    out.println("<td><a class='btn-borrar' href='Rutina?opcion=borrar&cod_rut=" + rut.getCod_rut() + "'>Borrar</a></td>");
                                    out.println("</tr>");
                                }
                            %>

                        </tbody>
                    </table>
                </articule>
            </nav>
        </main>
    </body>
</html>
