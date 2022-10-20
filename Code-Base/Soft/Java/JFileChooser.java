import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFileChooser{
    public static void main(String[] args) {

menubarDemo demo = new menubarDemo();
    }
}
public class menubarDemo extends JFrame implements ActionListener {

    JButton button = new JButton();
    menubarDemo(){
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBounds(0,0,50,50);
        button.setText("*OPEN FILE*");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            int respose = fileChooser.showOpenDialog(null);
            if (respose == JFileChooser.APPROVE_OPTION){
                String location =fileChooser.getSelectedFile().getAbsolutePath();
                System.out.println(location);
            }
        }
    }
}


