
let nom = prompt("¿Como te llamas?");

saludo(nom);

let age = prompt("¿Cuantos años tienes?");

edad(nom, age);

let proc = prompt("¿De donde eres?");

procedencia(proc);







function saludo(nom) {

    return (alert("Hola " + nom + " !"));
}

function edad(nom, age) {

    return (alert("Pero " + nom + ", si con " + age + " años están en la flor de la vida!"));
}

function procedencia(proc) {

    return (alert("Ah, " + proc + ", no he estado nunca, me gustaría ir"))
}