async function FileLoader() {
   
   let FileLoaded = "true";

   if (FileLoaded) {
      return "Your File Loaded";
   }
   else{
    throw "Error Bitch"
   }

}

async function React() {
    
   try {
      let mess = await FileLoader();
      console.log(mess);
   } catch (error) {
    console.log(error);
   }
}
React();
