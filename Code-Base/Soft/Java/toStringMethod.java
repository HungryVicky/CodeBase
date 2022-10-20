//toString method
public class toStringMethod  {
    public static void main (String[] args) {

        car cars = new car();
        //displaying the attributes value using toString 
        System.out.println(cars.toString());

    }
}

//crating class
public class car {

    // assigning values to class attributes
    String name = "vicky",favoriteFood = "chocolate",place = "chennai";

    //using toString method returning values of attributes to main class
    public String toString(){
        return name+"\n"+favoriteFood+"\n"+place;
    }

}
