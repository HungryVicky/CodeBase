async function FileLoader() {
   
   let FileLoaded = "";

   if (FileLoaded) {
      return "Your File Loaded";
   }
   else{
    throw "Error Bitch"
   }

}

FileLoader().then((value) => console.log(value))
.catch(error => console.log(error))