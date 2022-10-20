//static variables and methods
public class staticMethod {
  public static void main (String[] args){

      car c1 = new car ("vicky");
      car c2 = new car ("java");
      car c3 = new car ("c++");

      car.displayfriend();
  }
}
//crating class
public class car {

    String name ;
    //creating a static variable
    static int friends ;

    //using constructor getting the value and assigning to the static variable
    car(String name){
        this.name = name;
        //displaying how many friend have
        System.out.println("you have"+friends+"friends");
        //increasing friend the times the constructor called
        friends++;
    }
    //creating a static method to display how many friend you have
    static void displayfriend(){
        System.out.println(car.friends);
    }


}

