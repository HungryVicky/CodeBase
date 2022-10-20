class Chacolate{

   constructor( Name , Flavor , Cost ){
      this.name = Name;
      this.flavor = Flavor;
      this.cost = Cost;
   }
}
const chacolate = 
[
new Chacolate( "Dairymilk" , "chacolate" , 50 ),
new Chacolate( "5 Star" , "chacolate" , 10 ),
new Chacolate( "MilkyBar" , "Milk" , 5 ),
]

console.log(chacolate[1].name ,"\nCost :", chacolate[1].cost);
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
