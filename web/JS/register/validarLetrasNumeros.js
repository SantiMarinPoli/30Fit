function validarSoloNumeros(e){
    key=e.keyCode || e.which;
    teclado=String.fromCharCode(key);
    numero="0123456789";
    especiales="8-37-98-46";
    teclado_especial=false;

    for(var i in especiales){
        if(key == especiales[i]){
            teclado__especial=true;
        }
    }
    
    if(numero.indexOf(teclado)== -1 && !teclado_especial){
        return false;
    }
}
function validarSoloLetras(e){
    key=e.keyCode || e.which;
    teclado=String.fromCharCode(key).toLowerCase();
    letras= " qwertyuiopasdfghjklñzxcvbnm";
    especiales="8-37-38-46-164";
    teclado_especial=false;
    
    for(var i in especiales){
        if(key==especiales[i]){
            teclado_especial=true;
            break;
        }
    }
    
    if(letras.indexOf(teclado)== -1 && !teclado_especial){
        return false;
    }
}

