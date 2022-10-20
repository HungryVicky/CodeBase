//printf
public class printF {
    public static void main (String[] args) {

        int num1 = 10;
        char ch = 'J';
        String str ="java";
        double d1 = 1000.100001000000200;

        System.out.printf("The Value Of Num1 %d",num1);
        System.out.printf("The Value Of Char %c",ch);
        System.out.printf("The Value Of double %f",d1);
        System.out.printf("The Value Of String %s",str);
        System.out.printf("Width Of 10 %10s",str.toUpperCase());
        System.out.printf("%+d",num1);
        System.out.printf("%,f",d1);
        System.out.printf("%020f",d1);

    }
}