const language = document.querySelector("#Languages");
const list = document.createElement("li");
list.textContent = "JavaScript" ;
language.append(list);
//language.prepend(list);
//language.insertBefore(list , language.getElementsByTagName("li")[1])
 



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

    <br>

<ul  id="Languages">
   <li>C++</li><br>
   <li>Java</li><br>
   <li>Html</li><br>

 </ul>

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