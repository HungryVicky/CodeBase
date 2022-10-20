//method in c++ know as functions or struct
public class MethodoverLoading {
    public static void main (String[] args){

        int x = 10,y =20 ;
        add(x,y);
        add(x);
        adder(x,y);
        adders(x,y);

    }
    //using method to return the value od x and y added
static int add(int x, int y) {
    System.out.println("Method 1 m1:"+(x+y));
        return 0;
}
static  int add (int x){
    System.out.println("method 2 same m1:"+(x+20));
    return 0;
}
static  int adder(int x, int y ){
    System.out.println("method 2 same m2:"+(x+y));
    return 0;
}
static  int adders(int x,int y ){
    System.out.println("method 2 same m2:"+(x+y));
    return 0;
}

}