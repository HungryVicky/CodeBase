import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBox{
    public static void main(String[] args) {

    comboBox combobox = new comboBox();

    }
}

public class comboBox extends JFrame implements ActionListener {


    JComboBox comboBox;
    comboBox()
    {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","lion"};
        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        this.add(comboBox);
        this.setVisible(true);
    }



    public void actionPerformed(ActionEvent e){
        if (e.getSource()==comboBox){
            System.out.println("you selected"+comboBox.getSelectedItem());
        }
    }
}

