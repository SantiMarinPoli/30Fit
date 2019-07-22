<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.StringWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width= , user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="CSS/error/error.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/icons-fonts/icons-fonts.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/navegador/navegador.css" rel="stylesheet" type="text/css"/>
        <link rel="shortcut icon" type="image/x-icon" href="icons/logo/peso.png">
        <title>30Fit</title>
    </head>
    <body>
        <header>
                <h1 class="logo">30Fit</h1>
            <%@include file="navegador.jsp" %>
        </header>
        <div class="contenedor__error">
            <h1 class="error">ERROR</h1>
            <h2 class="error__404">404</h2>
            <p class="txt-error">
                <span class="span__error">SORRY, LA PAGINA QUE BUSCAS NO EXISTE!</span><br>
                No te preocupes, solo tienes un café y vuelve
            </p>
          <%--  <%= exception.getMessage()%>

            <%
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                exception.printStackTrace(printWriter);
                out.println(stringWriter);
                printWriter.close();
                stringWriter.close();
            %> --%>

            <img class="img-error" src="img/error.gif" alt=""/>
        </div>
        <%@include file="publicidad.jsp" %> 
    </body>
    <script src="JS/register/jquery-3.2.1.min.js" type="text/javascript"></script>
    <script src="JS/menu/menu.js" type="text/javascript"></script>
</html>
