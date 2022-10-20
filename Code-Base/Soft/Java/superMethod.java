//superMethod
public class superMethod {
  public static void main (String[] args){

    car c = new car("batman",42,"$$$");

  }
}
public class cars {
  int age;
  String name;

  cars(int age,String name){
    this.name = name;
    this.age =age;
    System.out.println(name+"\n"+age);
  }


}//crating class
public class car extends cars{
  String power;
  car(String name,int age,String power){
    super(age,name);
    this.power = power;
    System.out.println(power);
  }

}


