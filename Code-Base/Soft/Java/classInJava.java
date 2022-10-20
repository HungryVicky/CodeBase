//using class in java
public class vicky {
    public static void main (String[] args) {

        car carClass = new car();
        System.out.println(carClass.model);
        System.out.println(carClass.year);
        System.out.println(carClass.colour);
        System.out.println(carClass.rate);

    }
}
public class car {

    int year = 2020;
    String model = "BMW";
    String colour = "blue";
    double rate = 50000;

}
