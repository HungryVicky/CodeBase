import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class button {
      public static void main(String[] args) {

//Calling myFrame class
      new Myframe();

        }

      }

public class Myframe extends JFrame implements ActionListener {

    JButton button;

    Myframe() {
        button = new JButton();
        button.setText("PRESS!");
        button.setVisible(true);
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic sans",Font.BOLD,25));

        this.setTitle("Hello World");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(button);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println("Click!");
        }
    }
}



