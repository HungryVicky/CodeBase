import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jTextField{
    public static void main(String[] args) {

        new myTextFiled();

    }
}
import javax.swing.*;
        import javax.swing.JTextField;
        import java.awt.*;
        import java.awt.event.*;

public class myTextFiled extends JFrame implements ActionListener {

    JTextField textField;
    JButton myButton;
    String name;
    myTextFiled()
    {

        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myButton = new JButton("submit");
        myButton.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,50));
        textField.setFont(new Font("Comic sans",Font.BOLD,25));
        textField.setForeground(Color.GREEN);
        textField.setBackground(Color.black);
        textField.setText("userName");


        this.add(myButton);
        this.add(textField);


        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==myButton){
            textField.setEnabled(false);
            myButton.setEnabled(false);
            name = textField.getText();
            JOptionPane.showMessageDialog(null,
                    "Welcome "+name,
                    "For "+name,
                    JOptionPane.INFORMATION_MESSAGE,
                    null);
        }
    }
}



