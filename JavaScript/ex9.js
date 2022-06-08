let color =  prompt("dime un color y lo clasifico (en minúsculas)");
/*
if(color == "rojo" || color == "amarillo" || color == "naranja"){

    alert("el color "+color+ " és calido");
  
}
else if(color == "azul" || color == "violeta" || color == "verde"){

    alert("el color "+color+ " és frío");
  
}else if(color == "blanco" || color == "gris" || color == "negro"){

    alert("el color "+color+" és neutro");
  
}else {
    alert("pon un color classificable");
}*/

switch(color){

    case 'rojo':
    case 'amarillo':
    case'naranja':
    alert("el color "+color+ " és calido");
    break;

    case 'azul':
    case 'violeta':
    case 'verde':
    alert("el color "+color+ " és frío");
    break;

    case 'blanco':
    case 'gris':
     case'negro':
    alert("el color "+color+ " és neutro");  
    break;

    default:
        alert("pon un color classificable");

}