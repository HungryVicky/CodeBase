
public class thread{
    public static void main(String[] args) throws InterruptedException {

        //Thread.currentThread().setName("vicky");
        //System.out.println(Thread.currentThread().getName());
       // Thread.currentThread().setPriority(10);
        //System.out.println(Thread.currentThread().getPriority());
       // System.out.println(Thread.currentThread().isAlive());

     //for(int i = 3 ; i>0;i--){
     //    System.out.println(i);
     //    Thread.sleep(1000);
     //}
     //   System.out.println("Done");

        MyThread thread2 = new MyThread();
        thread2.start();
        System.out.println(thread2.isDaemon());
         thread2.setDaemon(true);
        //System.out.println(thread2.isAlive());
        //thread2.setName("Hello");
       //System.out.println(thread2.getName());
        //System.out.println(thread2.getPriority());
        
    }
}
public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("This Thread Is Running");
    }
}
