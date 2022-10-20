class Chacolate{

   constructor( Name , Flavor , Cost ){
      this.name = Name;
      this.flavor = Flavor;
      this.cost = Cost;
   }
}

let chacolate1 = new Chacolate
( "Dairymilk" , "chacolate" , 50 );

let chacolate2 = new Chacolate
( "5 Star" , "chacolate" , 10 );

let chacolate3 = new Chacolate
( "MilkyBar" , "Milk" , 5 );

//details(chacolate3 , "chacolate");
details(chacolate1,chacolate2,chacolate3);

function details(chacolate)
{
   console.log(chacolate1.name);
   console.log(chacolate2.name);
   console.log(chacolate3.name);
}
/*function changerFlavor(chacolate ,flavor){
 chacolate3.flavor = flavor;
 
 console.log(chacolate3.name);
 console.log(chacolate3.cost);
 console.log(chacolate3.flavor);
}
*/



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
