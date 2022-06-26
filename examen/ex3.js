let pass = "patata";
let cont = 5;
let resp;
let acc = false;
let salir = false;

while ((!salir)) {
    resp = prompt("Inserte la contraseña para acceder(tienes " + cont + ")");
    if (pass == resp) {
        acc = true;
        salir = true;
    }
    if (cont <= 1) {
        acc = false;
        salir = true;
    }
    cont--;
}
if (acc) {
    alert("Bienvenido, adelante!")
} else if (cont == 0) {
    alert("Demasiados intentos. No puedes entrar")
}