import javax.swing.*;
import java.awt.*;

public class lables {
      public static void main(String[] args) {
//creating imageicon object
       ImageIcon imageIcon1 = new ImageIcon("logo.jpg");
       ImageIcon imageIcon2 = new ImageIcon("QRCode.png");
//label setting text and image details
       JLabel label = new JLabel();
       label.setVisible(true);
       label.setIcon(imageIcon2);
       label.setIconTextGap(100);
       label.setText("Scan?");
       label.setHorizontalTextPosition(JLabel.CENTER);
       label.setVerticalTextPosition(JLabel.TOP);
       label.setVerticalAlignment(JLabel.CENTER);
       label.setHorizontalAlignment(JLabel.CENTER);
       label.setFont(new Font("MV Boli",Font.BOLD,20));
       label.setBackground(Color.CYAN);
       label.setOpaque(true);
       label.setBounds(100,100,250,250);
       //frame work
          JFrame frame = new JFrame();
          frame.setTitle("JAVA GUI");
          frame.setVisible(true);
          frame.setSize(250,250);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.add(label);
          frame.setIconImage(imageIcon1.getImage());
          frame.pack();

        }

      }







