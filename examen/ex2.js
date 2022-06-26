
let ans = prompt("¿Bienvenido al club de golf, eres miembro VIP, standard o no eres miembro?(escribe vip, sta o no para identificarte)");

switch (ans) {
    case 'vip':
        alert("De acuerdo, vaya al hoyo 1 por favor.");
        break;

    case 'sta':
        alert("De acuerdo, vaya a la sala de espera hasta que llegue su turno por favor.");
        break;

    case 'no':
        alert("Lo siento, no es usted miembro del club de golf pero puede ir a la terraza del bar a observar.");
        break;


}