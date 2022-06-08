
let prod = parseInt(prompt("cuantos productos has comprado?"));
let precio = parseInt(prompt("Cuanto te has gastado en total?"));
let precioDesc = 0;
let bizum = prompt("Vas a pagar con Bizum? (escribe S para si o N para no)");
let seguro = prompt("Tienes seguro? (escribe S para si o N para no)");
let clienteN = prompt("eres cliente nuevo (escribe S para si o N para no)");

// para preguntar todo lo del ejercicio

if(bizum == "S" || bizum == "s"){
    bizum = true;
}if(bizum == "N" || bizum == "n"){
    bizum = false;
}


if(seguro == "S" || seguro == "s"){
    seguro = true;
}if(seguro == "N" || seguro == "n"){
    seguro = false;
}



if(clienteN == "S" || clienteN == "s"){
    clienteN = true;
}if(clienteN == "N" || clienteN == "n"){
    clienteN = false;
}

console.log(bizum,seguro,clienteN);



// aplicación del descuento
if(prod >= 10 || precio >= 100){
    if(bizum == true && seguro == true && clienteN != true){
        precioDesc = precio - precio*0.15;
        alert("has de pagar el total con un 15% de descuento: "+precioDesc +" precio original: "+precio);
    }else{
        precioDesc = precio - precio*0.1;
    alert("has de pagar el total con un 10% de descuento: "+precioDesc +" precio original: "+precio);
    }
}

else{
    alert("has de pagar el total de "+precio );
}
