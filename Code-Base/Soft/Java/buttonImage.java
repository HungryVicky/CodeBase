import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buttonImage{

public static void main(string[] args){

new Myframe();
}

}



public class Myframe extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    ImageIcon icon;
    Myframe() {
        icon = new ImageIcon("QRCode.png");

        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(150,250,150,150);
        label.setVisible(false);
        button = new JButton();
        button.setText("PRESS!");
        button.setVisible(true);
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic sans",Font.BOLD,25));
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setTitle("Hello World");
        this.setLayout(null);
        this.setSize(500, 500);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            label.setVisible(true);
        }
    }
}



