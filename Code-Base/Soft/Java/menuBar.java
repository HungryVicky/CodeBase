import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

menubarDemo demo = new menubarDemo();
    }
}


public class menubarDemo extends JFrame implements ActionListener{



    JMenuItem Load = new JMenuItem("Load");
    JMenuItem Save = new JMenuItem("Save");
    JMenuItem Exit = new JMenuItem("Exit");
    menubarDemo(){

        JMenuBar menuBar = new JMenuBar();
        menuBar.setSize(0,0);

        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JMenu File = new JMenu("File");
        File.setMnemonic(KeyEvent.VK_F);
        JMenu Edit = new JMenu("Edit");
        Edit.setMnemonic(KeyEvent.VK_E);
        JMenu Help = new JMenu("Help");
        Help.setMnemonic(KeyEvent.VK_H);

        Load.setMnemonic(KeyEvent.VK_L);
        Save.setMnemonic(KeyEvent.VK_S);
        Exit.setMnemonic(KeyEvent.VK_Q);

        File.add(Load);
        File.add(Save);
        File.add(Exit);

        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);

        this.add(menuBar);
        this.pack();
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==Load){
            System.out.println("You Loaded File");
        } else if (e.getSource()== Save) {
            System.out.println("You Saved File");
        } else if (e.getSource()==Exit) {
            System.out.println("You Exit");
        }
    }
}
