function validarForma(form) {
    var usuario = form.usuario;
    if (usuario.value == "" || usuario.value == "Escribir usuario") {
        alert("Debe ingresar un nombre de usuario")
        usuario.focus();
        usuario.select()
        return false;
    }

    var password = form.password;
    if (password.value == "" || password.value < 3) {
        alert("Debe proporcionar un password minimo de 3 caracteres");
        usuarios.focus();
        usuario.select();
        return false;
    }

    var tecnologias = form.tecnologia;
    var checkSeleccionado = false;

    for (var i = 0; i < tecnologias.length; i++) {
        if (tecnologias[i].checked) {
            checkSeleccionado = true;
        }
    }

    if (!checkSeleccionado) {
        alert("Debe seleccionar al menos 1 tecnología");
        return false;
    }

    var generos = form.generos;
    var radioSeleccionado = false;

    for (var i = 0; i < generos.length; i++) {
        if (generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert("debe seleccionar un genero");
        return false;
    }

    return false;


}