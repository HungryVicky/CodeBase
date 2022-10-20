
public class multiThread{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();


        Runnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        thread1.start();
        thread2.start();
    }
}

public class MyThread extends Thread
{
    @Override
    public void run()
    {
        for(int i = 10;i>0;i--) {

            System.out.println("Thread 1 : "+i);
            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }

        }
        System.out.println("thread 1 Completed ");

    }
}
public class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i<10; i++) {

            System.out.println("Thread 2 : " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("thread 2 Completed ");
    }

}


