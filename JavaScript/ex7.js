
let num = parseInt(prompt("dame un numero cualquiera"));
let num2 = parseInt(prompt("dame otro numero cualquiera"));
let dif = 0;

if(num > num2){
    dif = num - num2;
    alert("la diferencia es "+dif);
    
}
else if(num2 > num){
    dif = num2 - num;
    alert("la diferencia es "+dif);  
}
else{
    alert("són el mismo número la diferencia es cero");
}
