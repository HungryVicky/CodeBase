//@Override class
public overRide {
  public static void main (String[] args){
    cars c = new cars();
    c.speak();
    car Car = new car();
    Car.speak();

  }
}
public class cars {
  @Override
    //this method is override to class 2 
  void speak(){
    System.out.println("Hello This is 1 class");
  }
}
//crating class
public class car extends cars{
  @Override
    //here we call the method form class 1 using override 
  void speak(){}

}




