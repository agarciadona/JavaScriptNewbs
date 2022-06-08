let invitados = [];
let invitadoNu;
//let stop = false;

//while (stop!=true){
while(invitadoNu != "stop"){
invitadoNu = prompt("Añade alguien a la lista de invitados");
/*if(invitadoNu == "stop"){
    stop = true;
}
else{*/
invitados.push(invitadoNu.toLowerCase());
}
invitados.pop();


invitados.splice(3,0,"Pedro".toLowerCase());
invitados.splice(3,0,"Rosa".toLowerCase())


let invitadosSorted = invitados.sort();
console.log(invitadosSorted);

let ganador =  Math.floor(Math.random()*invitadosSorted.length)-1;

alert("ha ganado el premio "+invitadosSorted[ganador]);

