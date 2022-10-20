import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListener
{
    public static void main (String[] args){

        simpleRocket rocket = new simpleRocket();

    }

}
import javax.swing.*;
        import java.awt.*;
        import java.awt.event.KeyEvent;
        import java.awt.event.KeyListener;

public class simpleRocket extends JFrame implements KeyListener {


    JLabel lable;

    ImageIcon icon;

    simpleRocket(){

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(750,750);
        this.setLayout(null);
        this.addKeyListener(this);

        icon = new ImageIcon("QR.png");

        lable = new JLabel();
        lable.setVisible(true);
        lable.setIcon(icon);
        lable.setBounds(0,0,100,100);
        lable.setBackground(Color.blue);
        lable.setOpaque(true);
        lable.setIcon(icon);


        this.getContentPane().setBackground(Color.BLACK);
        this.add(lable);
        this.setVisible(true);

        validate();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()) {
            case 'a' -> lable.setLocation(lable.getX() - 10, lable.getY());
            case 'w' -> lable.setLocation(lable.getX(), lable.getY() - 10);
            case 's' -> lable.setLocation(lable.getX(), lable.getY() + 10);
            case 'd' -> lable.setLocation(lable.getX() + 10, lable.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

        switch (e.getKeyCode()) {
            case 37 -> lable.setLocation(lable.getX() - 10, lable.getY());
            case 38 -> lable.setLocation(lable.getX(), lable.getY() - 10);
            case 40 -> lable.setLocation(lable.getX(), lable.getY() + 10);
            case 39 -> lable.setLocation(lable.getX() + 10, lable.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You Pressed ="+e.getKeyChar());
        System.out.println("You Pressed ="+e.getKeyCode());
    }
}



