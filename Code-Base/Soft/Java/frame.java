import javax.swing.*;
import java.awt.*;

public class frame {
  public static void main(String[] args)  {

    Myframe myframe = new Myframe();

  }
}

public class Myframe extends JFrame {

  Myframe(){
    this.setSize(420,420);
    this.setTitle("Java App");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    ImageIcon imageIcon = new ImageIcon("Logo.png");
    this.setIconImage(imageIcon.getImage());
    this.getContentPane().setBackground(new Color(123,50,250));
  }
}


