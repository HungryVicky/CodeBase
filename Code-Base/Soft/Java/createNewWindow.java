import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class createNewWindow {

    public static void main(String[] args) {
      myFrame frame1 = new myFrame();
    }
}
public class myFrame extends JFrame implements ActionListener {

    JButton myButton = new JButton("hello");
    myFrame(){

        myButton.setBounds(0,0,150,150);myButton.setText("PRESS!");
        myButton.addActionListener(this);
        this.setSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(myButton);
        this.setLayout(null);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==myButton){

            this.setVisible(false);
            newFrame frame = new newFrame();

        }
    }
}
public class newFrame extends JFrame  {


    newFrame(){

        this.setSize(new Dimension(500,500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setName("hello");
        this.setTitle("hello");
        this.setVisible(true);
    }
}

