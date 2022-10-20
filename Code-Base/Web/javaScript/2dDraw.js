let element = document.getElementById("myCanvas");

let context = element.getContext("2d");

/*
context.beginPath();
context.moveTo(0,0);
context.lineTo(250,250);
context.stroke();


context.fillStyle = "red";
context.beginPath();
context.moveTo(100,100);
context.strokeRect(0,0,150,150)
context.fillRect(0,0,150,150);

*/

context.beginPath();
context.arc(100,100,100,0,2 * Math.PI);
context.stroke();



<!DOCTYPE html>
<html lang="en">

   <head>

      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
      <link rel="stylesheet" href="style.css">

    </head>
    <body style="font-family:sans-serif; color: white;">

  <canvas id="myCanvas" height="250" width="250"></canvas>

   <script type="module" src="index.js"></script> 
   </body>

</html>


html{

    background: linear-gradient(#444444 , black);
    background-repeat: no-repeat;
    background-size: cover;
    background-position: center;
    background-attachment: fixed;
    
    }


#myCanvas{

    background-color: aliceblue;
}
