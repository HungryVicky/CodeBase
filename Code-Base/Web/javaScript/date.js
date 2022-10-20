
let date = new Date();


let year  = date.getFullYear();
let Month = date.getMonth();
let Day  = date.getDay();
let dat  = date.getDate();
let min  = date.getMinutes();
let sec  = date.getSeconds();


 date = date.toLocaleString();
 document.getElementById("label").innerHTML = year;

