import java.util.Scanner;

public class usingScanner {
    public static void main(String[] args){
        
        String name,food;
        int age;
        
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        name = input.nextLine();
        System.out.println("How old are you?");
        age = input.nextInt();
        input.nextLine();
        System.out.println("What is your favorite food?");
        food = input.nextLine();
        System.out.println("Hello"+name);
        System.out.println("you are"+age+"years old");
        System.out.println("Your favorite food is"+food);
        
    }
}