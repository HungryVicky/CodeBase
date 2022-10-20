import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
  public static void main(String[] args){

    try(FileWriter writer = new FileWriter("poem.txt");) {  
      writer.write("roses are red \n pop are weird \n we have no fear ");
      writer.append("\n(by vicky)");
    }
    catch (IOException e){
     e.printStackTrace();
    }

  }
}

