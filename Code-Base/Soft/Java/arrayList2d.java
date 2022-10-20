//header file for arraylist
import java.util.ArrayList;

public class arrayList2d {
    public static void main (String[] args){

//2D array list declaration
        ArrayList<ArrayList<String>> array2d = new ArrayList<>();
//2D array list initialization
        ArrayList<String> Arraylist = new ArrayList<>();
        Arraylist.add("vicky");
        Arraylist.add("java");
        Arraylist.add("python");
        Arraylist.add("c++");
        Arraylist.add("c#");
        ArrayList<String> Arraylist2 = new ArrayList<>();
        Arraylist2.add("c#");
        Arraylist2.add("c");
        Arraylist2.add("html");
 //assign value to 2d array using add method 
        array2d.add(Arraylist);
        array2d.add(Arraylist2);
        
//displaying 2D array list
        System.out.println("array list 1:"+Arraylist);
        System.out.println("array list 2:"+Arraylist2);
        System.out.println("2d array :"+array2d);
    }

}