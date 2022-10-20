/*functuion experssion
const result = (userName) => console.log(`Hello ${userName}`);
result("vicky");

//callback 
let grades = [100,50,90,60,80,70];
grades = grades.sort(function (x,y){
    return  x - y ; 
   });
grades.forEach(
    function (element){
       console.log(element);
    });
*/
//arrow key experssion;
    let grades = [100,50,90,60,80,70];
    grades = grades.sort( (x,y) => x + y );
    grades.forEach( (element)=>console.log(element));
  /*


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

*/  
html{

background: linear-gradient(#444444 , black);
background-repeat: no-repeat;
background-size: cover;
background-position: center;
background-attachment: fixed;

}
    