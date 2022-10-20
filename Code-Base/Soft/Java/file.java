import java.io.File;

public class file{

public static void main(String[] args){


File file = new File("secrect_message.txt");
if(file.exists()){
System.out.println("the file exists");
System.out.println(file.Path());
System.out.println(file.isFile());
}
else{
System.out.println("file doesn't exists");
}


}


}


