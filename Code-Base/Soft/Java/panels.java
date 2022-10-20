import javax.swing.*;
import java.awt.*;

public class panels {
      public static void main(String[] args) {

         ImageIcon icon = new ImageIcon("QRCode.png");

          JLabel label = new JLabel();
          label.setIcon(icon);
          label.setHorizontalAlignment(JLabel.RIGHT);
          label.setVerticalAlignment(JLabel.CENTER);

          label.setBounds(0,0,75,75);
        //panel 1
        JPanel panel1 = new JPanel();
        panel1.setVisible(true);
        panel1.setBackground(Color.red);
        panel1.setBounds(0,0,250,250);
        panel1.setLayout(null);

        //panel 2
        JPanel panel2 = new JPanel();
        panel2.setVisible(true);
        panel2.setBackground(Color.BLUE);
        panel2.setBounds(250,0,250,250);
          panel2.setLayout(null);

          //panel 3
          JPanel panel3 = new JPanel();
          panel3.setVisible(true);
          panel3.setBackground(Color.GREEN);
          panel3.setBounds(0,250,250,250);
          panel3.setLayout(null);

//framework
          JFrame frame = new JFrame();
          frame.setTitle("JAVA GUI");
          frame.setVisible(true);
          frame.setSize(750,750);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//adding panels to frame
          frame.add(panel1);
          frame.add(panel2);
          frame.add(panel3);
          panel1.add(label);
          frame.setBounds(500,500,500,500);

        }

      }







