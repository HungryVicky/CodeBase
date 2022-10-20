import java.util.Scanner;

public class main{

public static void main(strung[] args){

    string name;
    char class;
    short roll;
    short Tamil,English,Math,Computer,Physics,Chemistry,total;
    Scanner input = new Scanner(System.in)
    System.out.println("Enter Your Name  :");
    name  = input.nextLine();
    System.out.println("Enter Your Class :");
    class = input.nextLine();
    System.out.println("Enter Your Roll  :");
    roll  = input.nextShort();
    System.out.println("Enter Your Tamil Mark     :");
    Tamil = input.nextShort();
    System.out.println("Enter Your English Mark   :");
    English = input.nextShort();
    System.out.println("Enter Your Math Mark      :");
    Math = input.nextShort();
    System.out.println("Enter Your Computer       :");
    Computer = input.nextShort();
    System.out.println("Enter Your Physics Mark   :");
    Physics= input.nextShort();
    System.out,println("Enter Your Chemistry Mark :")
    Chemistry = input.nextShort();
    total = Tamil+Math+English+Computer+Physics+Chemistry;
    System.out.println("Name    :"+name);
    System.out.println("Roll NO :"+roll);
    System.out.println("Class   :"+class);
    System.out.println("You Scored :"+total);
    System.out.println(total=>250?"You Are Passed" : "Sorry You Are Failed");

}


}