class Car{
 

 constructor(Speed ,gas){
   this._speed = Speed
   this._gas = gas;
 }
 get fast(){
   return this._speed;
 }
 get resource(){
   return this._gas;
 }

}


let car = new Car(600,50);
console.log(car.fast);
console.log(car.resource);



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
