
let billetes = parseInt(prompt("cuantos billetes tienes?"));
let valor;
let contado = 0;
let suma = 0;


for(let i = 0; i<10; i++){
    valor = parseInt(prompt("cuanto vale este billete?(5€, 10€, 20€ y 50€)"));
    suma = suma + valor;
}


/* while(contado <= billetes-1){
    valor = parseInt(prompt("cuanto vale este billete?(5€, 10€, 20€ y 50€)"));
    suma = suma + valor;
    contado++;
}*/

alert("el total és: "+suma+" €");