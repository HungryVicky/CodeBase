import java.util.Scanner;

public class dianamicpolymoricim{

  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Animal animal;
    System.out.println("1=dog or 2==cat");
    int choice = scanner.nextInt();
    try {
      if (choice == 1) {
        animal = new Dog();
        animal.speak();
      } else if (choice == 2) {
        animal = new Cat();
        animal.speak();
      } else {
        animal = new Animal();
        animal.speak();
      }
    } 
    finally {
      System.out.println("Thanks For Coming");
    }
  }
}
public class Animal {
  void speak(){
    System.out.println("*Animal speak Brrrrrr*");
  }

}
public class Dog extends Animal {
  @Override
  public void speak(){
    System.out.println("*Dog Goes Bark*");
  }
}
public class Cat extends Animal{
  @Override
  public void speak(){
    System.out.println("*cat goes Meow*");
  }
}
