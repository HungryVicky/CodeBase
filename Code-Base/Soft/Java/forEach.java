
public class foreach {
    public static void main (String[] args){
  //array declaration
   String[] array = new String[5];
   //giving value to array
        array[0] =  "vicky";
        array[1] =   " c++";
        array[2] =   "java";
        array[3] =      "c";
        array[4] = "python";
   //displaying the arraylist using foreach
        for (String arrayList:array) {
            System.out.println(arrayList);
        }
    }

}