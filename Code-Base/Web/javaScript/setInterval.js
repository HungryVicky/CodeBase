let count = 0;
let max = window.prompt("enter a number to start count");
max = Number(max);

const counter = setInterval(Counter, 1000);

function Counter() {
   count ++;
   console.log(count);
   if (count >= max) clearInterval(counter)
}