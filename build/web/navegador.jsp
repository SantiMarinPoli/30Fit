<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<input type="checkbox" id="btn-menu">
<label for="btn-menu" ><img src="icons/navegador/menu.png" alt="menu" class="icon-menu"/></label>

<nav class="menu">
    <ul>
        <li class="subMenu"><a href="clases.jsp">Clases <img src="icons/navegador/flecha-chevron-hacia-abajo.png" alt="icon down" class="icon-down-open"/></a>

            <ul>
                <li><a href="Rutina?opcion=class_tripces">Biceps y Tripces</a></li>
                <li><a href="Rutina?opcion=class_espalda">Hombros</a></li>
                <li><a href="Rutina?opcion=class_pecho">Pecho</a></li>
            </ul>
        </li>
        <li><a href="Rutina?opcion=listarRutina">Listar Rutina</a></li>
        <li class="subMenu"><a href="controlador?opcion=perfil">Perfil <img src="icons/navegador/flecha-chevron-hacia-abajo.png" alt="icon down" class="icon-down-open"/></a>
            <ul>
                <li><a href="index.jsp?cerrar=true">Salir</a></li>
            </ul>

    </ul>
</nav>