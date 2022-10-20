let cost = window.prompt("enter the cost to see how much in indian currensy")
cost = Number(cost);
let local = cost.toLocaleString("hi-IN",{style :"currency", currency:"INR"})
//let local = cost.toLocaleString(undefined,{style:"unit",unit:"celsius"})
//let local = cost.toLocaleString(undefined,{style:"percent"})
console.log(local);


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