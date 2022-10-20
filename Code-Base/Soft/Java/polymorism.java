public class polymorism {

  public static void main(String[] args)
  {
   bike b = new bike();
   car c = new car();
   
   vehical[] racers= {b,c};
    for (vehical x: racers) {
      x.go();
    }

  }
}
public class vehical {
  void go(){};
}
public class bike extends vehical {
  @Override
  public void go(){
    System.out.println("bike is moving");
  }


}
public class car extends vehical{
  @Override
  public void go(){
    System.out.println("car is moving");
  }
}
