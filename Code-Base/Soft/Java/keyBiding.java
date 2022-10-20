import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class keyBiding{
    public static void main(String[] args) {


MyFrame myFrame = new MyFrame();

    }
}

public class MyFrame extends JFrame {
    JFrame frame;
    JLabel label;

    Action upAction;
    Action leftAction;
    Action rightAction;
    Action downAction;


    MyFrame(){
        frame = new JFrame();
        this.setTitle("key Biding");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100,100,200,200);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        leftAction = new LeftAction();
        rightAction = new RightAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        label.getActionMap().put("upAction",upAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        label.getActionMap().put("downAction",downAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        label.getActionMap().put("leftAction",leftAction);
        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        label.getActionMap().put("rightAction",rightAction);

        this.add(label);
        this.setVisible(true);

    }
    public class UpAction extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY()-10);

        }
    }
    public class LeftAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()-10,label.getY());

        }
    }
    public class RightAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX()+10,label.getY());

        }
    }
    public class DownAction extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e){
            label.setLocation(label.getX(),label.getY()+10);

        }
    }


}

