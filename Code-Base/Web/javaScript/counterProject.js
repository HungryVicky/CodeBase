let count = 0;

document.getElementById("increaseB").onclick = function(){
    count ++;
    document.getElementById("myNum").innerHTML = count;
}
document.getElementById("resetb").onclick = function(){
    count = 0;
    document.getElementById("myNum").innerHTML = count;
}
document.getElementById("decreaseB").onclick = function(){
    count -= 1;
    document.getElementById("myNum").innerHTML = count;
}


<!-- 
<!DOCTYPE html>
<html lang="en">

   <head>

      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
      <link rel="stylesheet" href="style.css">

    </head>
    <body style="font-family:sans-serif;">

    <label id="myNum">0</label>
    <button id="increaseB" >increase</button>
    <button id="resetb">reset</button>
    <button id="decreaseB">decrease</button>
     
   <script src="index.js"></script> 
   </body>

</html>


 
html{
    background: linear-gradient(#444444,black);
    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    background-attachment: fixed;   
}

html{
    background: linear-gradient(#444444,black);
    background-repeat: no-repeat;
    background-position: center;
    background-size: cover;
    background-attachment: fixed;   
}

#myNum{
    
font-size: 100px;
display: block;
text-align: center;
color: white;
}

button{

    width: 145px;
    height: 100px;
    font-size: 100%;
    margin: 2px;
    border: solid;
    font-size: bold;
    border-radius: 10px;
    border-style: outset;

}

button:hover{
   transform: scale(1.2,1.2);

   background-color: yellow;
}
button:active{
    background-color: rgb(22, 252, 22);
    
}

-->