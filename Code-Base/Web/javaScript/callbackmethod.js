let a = 10 , b = 10;

adder(a,b,callBackOutPuter);

function adder(a , b, callback){
    let result =  a+b;
   callBackOutPuter(result);
}

function callBackOutPuter(result){
 console.log(result);
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

html{

    background: linear-gradient(#4444 ,black);
    background-repeat: repeat;
    background-size: cover;
    background-position: center;
    background-attachment: fixed;
}
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