let value1 = window.prompt("value a");
value1 = Number(value1);
let value2 = window.prompt("value b");
value2 = Number(value2);

let d = func(value1 , value2);
console.log(d);
function func(v1 , v2 ){
    return v1+v2;
   
}

/*<!DOCTYPE html>
<html lang="en">

   <head>

      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
      <link rel="stylesheet" href="style.css">

    </head>
    <body style="font-family:sans-serif;">

   
      
   <script src="index.js"></script> 
   </body>
   

</html>


html{

    background: linear-gradient(#4444 ,black);
    background-repeat: repeat;
    background-size: cover;
    background-position: center;
    background-attachment: fixed;
}

#butt{
height: 50px;
width: 85px;

}
*/