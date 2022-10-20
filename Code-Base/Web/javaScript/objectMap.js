const store = new Map([

   ["tsirt",30],
   ["pants",50],
   ["underware",100],

]);

let shoppingcart = 0;

shoppingcart += (store.get("tsirt"));
shoppingcart += (store.get("underware"));

store.set("hats",15);
store.delete("underware");

console.log();


store.forEach((valuse,key) =>
console.log(`$${valuse} ,${key}`)
)


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
    
   <script src="index.js"></script> 
   </body>
   

</html>
html{

background: linear-gradient(#444444 , black);
background-repeat: no-repeat;
background-size: cover;
background-position: center;
background-attachment: fixed;

}
