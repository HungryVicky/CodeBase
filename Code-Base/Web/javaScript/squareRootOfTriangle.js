let a;
let b;
let x;
/*
a = window.prompt("Enter Value Of Side A");
a = Number(a);
b = window.prompt("Enter Value Of Side B");
b = Number(b);
c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
console.log(c);

*/

document.getElementById("MyButton").onclick = function(){

    a = document.getElementById("Ainput").value;
    a = Number(a);
    b = document.getElementById("Binput").value;
    b = Number(b);

    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
  

    document.getElementById("display").innerHTML = "C : "+c;

}
/*
<!DOCTYPE html>
<html lang="en">

   <head>

      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
      <link ref="stylesheet" type="text/css"  href="index.css">

 <style>
    html{
        background: linear-gradient(gray,black);
        background-repeat: no-repeat;
        background-position: center;
        background-size: cover;
        background-attachment: fixed;   
      
    }
    
 </style>

    </head>
    <body style="font-family:sans-serif;">

      <label id="Alabel">Side A:</label>
      <input type="text" id="Ainput" placeholder="Enter Value A"  >
      <br><br>
      <label id="Blabel">Side B:</label>
      <input type="text" id="Binput" placeholder="Enter Value B" >
      <br><br>
      &nbsp;&nbsp;
      <button type="button" id="MyButton" style="background-color:yellow ; height: 50px; width: 150px;">
      Submit
      </button>
      <br><br>
      <label id="display" style="font-size:50px"></label>
      

   <script src="index.js"></script> 
   </body>

</html>

*/