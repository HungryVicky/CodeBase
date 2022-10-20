let n1 = 1;
let n2 = 2;
let n3 = 3;
let n4 = 4;
let n5 = 5;
let n6 = 6;
let n7 = 7;

console.log(output(n1,n2,n3,n4,n5,n6,n7,));


function output(...total){
    let totl = 0;
    for(let cost of total){
        totl += cost;
    }
    return totl;
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