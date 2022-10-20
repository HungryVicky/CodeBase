let butt = document.getElementById("myButton");


/*
console.log(window.innerWidth);
console.log(window.innerHeight);

console.log(window.scrollX);
console.log(window.scrolly);
*/


console.log(window.location.href);
//window.location.href = "https://www.google.com";
console.log(window.hostname);
console.log(window.pathname);

//butt.addEventListener("click",() => window.open());
//butt.addEventListener("click",window.close());
butt.addEventListener("click",() => window.print());





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

<button id="myButton" ></button>
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
