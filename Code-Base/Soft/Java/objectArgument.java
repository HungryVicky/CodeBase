//pass object as argument
public class objectArgument {
    public static void main (String[] args) {
  car c = new car();
  cars c1 = new cars("BMW");

  c.park(c1);

    }
}
//crating class
public class car {

    void park(cars car){
        System.out.println("you parked your car"+car);
    }

}
public class cars {
    String name;

    cars(String name){
        this.name = name;
    }

}