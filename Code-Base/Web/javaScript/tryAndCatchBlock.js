try {
 
   let x = window.prompt("Enter a number")
   x = Number(x);
   if (isNaN(x)) throw console.log("Enter a number")
   if (x =="") throw console.log("Is empty");
      
   console.log(`${x} is a number`);
}
 catch (error) 
 {
   console.log(error);
}
finally{
   console.log("this a finally block");
}