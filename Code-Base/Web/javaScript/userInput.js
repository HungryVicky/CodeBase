//let userName1 = window.prompt("whats ypur name");
//console.log(userName);

let userName2;

document.getElementById("button").onclick = function(){
    userName2 = document.getElementById("text").value;
    console.log(userName2);
    document.getElementById("name").innerHTML = "hello "+userName2
}

/*
<!DOCTYPE html>
<html lang="en">

   <head>

      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <title>Document</title>
      <link ref="stylesheet" href="index.css">

    </head>
    <body style="font-family:sans-serif;">

       <label id="name">Name :</label>
       <input type="text" id="text" placeholder="Your Name">
       <button type="button" id="button">Submit</button>
      

   <script src="index.js"></script> 
   </body>

</html>


*/