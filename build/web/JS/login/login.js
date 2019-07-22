window.addEventListener('load', function () {
    document.getElementById('boton-login').addEventListener('click', function () {
        var nomUsuario = document.getElementById('nomUsuario').value;
        var password = document.getElementById('password').value;

        var bandera = false;

        if (nomUsuario.length > 0 && password.length > 0) {
            bandera = true;
        }

        if (bandera) {
            document.getElementById('login').submit();
        } else {
            alert("Por favor llene los campos");

        }
    });
});
