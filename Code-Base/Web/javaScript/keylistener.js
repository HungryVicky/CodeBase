let element = document.getElementById("div");
let element2 = document.getElementById("div2");

element.addEventListener("mouseover",color);
element2.addEventListener("mouseover",color);



function color(params) {
   element.style.backgroundColor = "yellow";
}


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
   
      <div id="div2">
    <div id="div">
    </div>
    </div>

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
#div2{
    width: 500px;
    height: 500px;
    background-color: aliceblue;
    border : 1px solid;
}

