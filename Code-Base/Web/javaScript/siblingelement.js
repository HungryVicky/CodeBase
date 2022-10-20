let element  = document.querySelector("#Languages");
let sibling = element.nextSibling;
//let sibling = element.nextElementSibling;
sibling.style.backgroundColor = "yellow";


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
    
    <h1>Buy Coures</h1>
      <br><br>

      <ul id="Pay">
        <li>VISA</li><br>
        <li>MaterCard</li><br>
        <li>Currentsy</li><br>

      </ul>

<br>
<ul  id="Languages">
   <li>C++</li><br>
   <li>Java</li><br>
   <li>Html</li><br>

 </ul>

<br>
<ul  id="Food">
   <li>Apple</li><br>
   <li>Mango</li><br>
   <li>Tomato</li><br>

 </ul>

<br>




   <script type="module" src="index.js"></script> 
   </body>

</html>
