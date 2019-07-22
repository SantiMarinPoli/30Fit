
$(function () {
    var expr = /^[a-zA-Z0-9_\.\-]+@[A-zA-Z0-9\-]+\.[a-zA-Z0-9\-\.]+$/;

    $(document).ready(function () {
        $("#btn-enviar").click(function () {
            var nombre = $("#nombre_us").val();
            var apellido = $("#apellido_us").val();
            var email = $("#correo_us").val();
            var usuario = $("#nomUsuario_us").val();
            var password = $("#password_us").val();
            var repitaPassword = $("#repitaPassword_us").val();
            var genero = $("input[type = 'radio']:checked");
            var fechaNacimineto = $("#fechaNacimiento_us").val();
            var pais = $("#nombre_pais option:selected");
            var ciudad = $("#nombre_cty option:selected");
            var numeroCelular = $("#numeroCelular_us").val();

            if (nombre == "") {
                $("#msg-nombre").fadeIn();
                return false;
            } else {
                $("#msg-nombre").fadeOut();
                if (apellido == "") {
                    $("#msg-apellido").fadeIn();
                    return false;
                } else {
                    $("#msg-apellido").fadeOut();
                    if (email == "" || !expr.test(email)) {
                        $("#msg-correo").fadeIn();
                        return false;
                    } else {
                        $("#msg-correo").fadeOut();

                        if (usuario == "") {
                            $("#msg-usuario").fadeIn();
                            return false;
                        } else {
                            $("#msg-usuario").fadeOut();
                            if (password == "") {
                                $("#msg-password").fadeIn();
                                return false;
                            } else {
                                $("#msg-password").fadeOut();
                                if (repitaPassword == "") {
                                    $("#msg-repitaPassword").fadeIn();
                                    return false;
                                } else {
                                    $("#msg-repitaPassword").fadeOut();
                                    if (genero.length == 0) {
                                        $("#msg-genero").fadeIn();
                                        return false;
                                    } else {
                                        $("#msg-genero").fadeOut();
                                        if (fechaNacimineto == "") {
                                            $("#msg-fechaNacimiento").fadeIn();
                                            return false;
                                        } else {
                                            $("#msg-fechaNacimiento").fadeOut();
                                            if (pais.val() == "") {
                                                $("#msg-pais").fadeIn();
                                                return false;
                                            } else {
                                                $("#msg-pais").fadeOut();
                                                if (ciudad.val() == "") {
                                                    $("#msg-ciudad").fadeIn();
                                                    return false;
                                                } else {
                                                    $("#msg-ciudad").fadeOut();
                                                    if (numeroCelular == "") {
                                                        $("#msg-numeroCelular").fadeIn();
                                                        return false;
                                                    } else {
                                                        $("#msg-numeroCelular").fadeOut();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
    });
    $("#boton-login").on(function (){
        window.location.href="perfil.jsp";
    });
});
