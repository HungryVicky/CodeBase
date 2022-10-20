import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class fileReader {
      public static void main(String[] args){

        try(FileReader reader = new FileReader("ASCII.txt")){
        int data = reader.read();
        while (data != -1){
          System.out.print((char)data);
             data = reader.read();
        }
        }
        catch (FileNotFoundException e){
          e.printStackTrace();
        }catch (IOException e){
          e.printStackTrace();
        }


        }

      }