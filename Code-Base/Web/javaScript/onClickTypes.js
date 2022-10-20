let element = document.getElementById("div");

element.onmouseover = () =>
   element.style.backgroundColor = "red";
element.onmouseout  = () =>
   element.style.backgroundColor = "yellow";

element.onclick =  () =>
element.style.backgroundColor = "pink";

element.onload = alert("Welcome");


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
   

    <div id="div"></div>

<br>





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


#div{
    width: 250px;
    height: 250px;
    background-color: aliceblue;
    border : 1px solid;
}
