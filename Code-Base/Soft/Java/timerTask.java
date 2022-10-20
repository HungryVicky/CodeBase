import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class timerTask{
    public static void main(String[] args)
    {
       Timer time = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if(counter>0) {
                    System.out.println(counter+"Second");
                       counter--;
                }
                else {
                    System.out.println("HAPPY NEW YEAR");
                    time.cancel();
                }
            }
        };

      //time.schedule(task,7000);
      //Calendar date = Calendar.getInstance();
      //date.set(Calendar.YEAR,2022);
      //date.set(Calendar.MONTH,Calendar.JUNE);
     // date.set(Calendar.DAY_OF_MONTH,11);
     // date.set(Calendar.HOUR_OF_DAY,18);
     // date.set(Calendar.MINUTE,9);
     // date.set(Calendar.SECOND,0);
      //date.set(Calendar.MILLISECOND,0);

     // time.schedule(task,date.getTime());
       time.scheduleAtFixedRate(task,0,1000);
    }
}