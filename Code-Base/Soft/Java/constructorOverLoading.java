//crating class
public class constructorOverLoading {
    
    // class attributes assigning 
    String name,favoriteFood;
    int age;
    //creating constructor to set value to attributes
    car( String name , int age , String favoriteFood ){
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;

    }
    //overloaded constructor 1
    car( String name , int age ){
        this.name = name;
        this.age = age;

    }
    //overloaded constructor 2
    car( String name){
        this.name = name;

    }
    // returning value to main using method
    void food(){
        System.out.println("your favorite food :"+favoriteFood);
    }
    // returning value to main using mathod
    void name(){
        System.out.println("Hello "+name);

    }
}

