import java.util.Random
public class randomNumber {
    public static void main (String[] args){
        
        //create random scanner
        Random random = new Random();
        //setting random number 0 to 10000 and giving the bound
        int x = random.nextInt(10000);
        System.out.println(x);
        //setting random boolean for true or false 
        boolean bool = random.nextBoolean();
        System.out.println(bool);
    }
    
}