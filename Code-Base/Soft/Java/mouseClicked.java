import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseClicked{
    public static void main(String[] args) {
mouseListener mouselistener = new mouseListener();

    }
}

public class mouseListener extends JFrame implements MouseListener {
    JPanel panel;

    mouseListener(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(720,720);
        this.setLayout(null);

        panel = new JPanel();
        panel.setBounds(0,0,400,400);
        panel.setBackground(Color.red);
        panel.setOpaque(true);
        panel.setVisible(true);

        this.addMouseListener(this);
        this.add(panel);
        this.setVisible(true);
        validate();
    }
    @Override
    public void mouseClicked(MouseEvent e){
        panel.setBackground(Color.black);
    }
    @Override
    public void mousePressed(MouseEvent e){
        panel.setBackground(Color.yellow);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        panel.setBackground(Color.green);
    }
    @Override
    public void mouseEntered(MouseEvent e){
        panel.setBackground(Color.blue);
    }
    @Override
    public void mouseExited(MouseEvent e){
        panel.setBackground(Color.PINK);
    }

}