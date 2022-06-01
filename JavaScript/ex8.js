
let prod = parseInt(prompt("cuantos productos has comprado?"));
let precio = parseInt(prompt("Cuanto te has gastado en total?"));
let precioDesc = 0;
let bizum = false;
let seguro = false;
let clienteN = false;
 

// falta como cambiar de true a false las cosas

if(prod >= 10 || precio >= 100){
    precioDesc = precio - precio/10;
    alert("has de pagar el total con un 10% de descuento: "+precioDesc +" precio original: "+precio);
    if(bizum == true && seguro == true && clienteN != true){
        precioDesc = precioDesc - precioDesc*0.05;
        alert("has de pagar el total con un 15% de descuento: "+precioDesc +" precio original: "+precio);
    }
}

else{
    alert("has de pagar el total de "+precio );
}
