let subCheck;
let payType;
let butpress;



butpress = document.getElementById("butt").onclick = function(){

    subCheck = document.getElementById("subBox");
    payType = document.getElementsByName("pay");
 if(subCheck.checked){
    
payType = document.getElementsByName("pay");

    if(payType == pay1)
    {
      console.log("You are paying with visa");
    }
    
    else if(payType == pay2)
    {
      console.log("You are paying with card");
    }
    
    else if(payType == pay3)
    {
      console.log("You are paying online");
    }
    else{
      console.log("enter a pay type...");
    }
  
  }
  else{
      console.log("first sub...")
  }
  
}

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

