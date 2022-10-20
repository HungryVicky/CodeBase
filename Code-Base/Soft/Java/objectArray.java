//object array
public class vicky {
    public static void main (String[] args) {

        car car1 = new car("C++");
        car car2 = new car("java");
        car car3 = new car("Python");

        car[] store = {car1,car2,car3};

        System.out.println(store[0]);
        System.out.println(store[1]);
        System.out.println(store[2]);
    }
}
//crating class
public class car {

    String name;
    car (String name){
        this.name = name;
    }


}