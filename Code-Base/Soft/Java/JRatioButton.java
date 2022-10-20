import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRatioButton{
    public static void main(String[] args) {

        checkBox checkbox = new checkBox();

    }
}

public class checkBox extends JFrame implements ActionListener {

    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotDogButton;

    checkBox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        hamburgerButton = new JRadioButton("hamburger");
        hotDogButton = new JRadioButton("hotDog");

        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotDogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotDogButton.addActionListener(this);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotDogButton);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource()==pizzaButton){
            JOptionPane.showMessageDialog(null,"You Ordered Pizza","Notification",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource()==hamburgerButton){
            JOptionPane.showMessageDialog(null,"You Ordered Hamburger","Notification",JOptionPane.INFORMATION_MESSAGE);

        }
        else if (e.getSource()==hotDogButton){
            JOptionPane.showMessageDialog(null,"You Ordered HotDog","Notification",JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
