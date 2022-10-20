const tm1 = setTimeout(timer , 3000);
const tm2 = setTimeout(timer2 ,  6000);
setTimeout(timerClose,9000)

function timer(){
   alert("Sunday Sale Is ON!!!");
}

function timer2(){
   alert("50% OFF ON EVERY ITEMS!!!!");
}
function timerClose(){
   clearTimeout(tm1);
   clearTimeout(tm2);
}