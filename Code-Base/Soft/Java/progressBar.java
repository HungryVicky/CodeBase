import javax.swing.*;
import java.awt.*;

public class progressBar{
    public static void main(String[] args) {

        progressBar demo = new progressBar();

    }
}
public class progressBar {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar();

    progressBar(){
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setBounds(0,0,420,50);
        bar.setForeground(Color.red);
        bar.setBackground(Color.lightGray);

        frame.add(bar);
        frame.setVisible(true);
        hpDrain();
    }
    public void hpDrain()
    {
        int counter = 200;
        while(counter >= 0){
            bar.setValue(counter);

            try {
                Thread.sleep(100);
            }
            catch(InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter -=1;

        }
        bar.setString("*You Died*");

    }

}
