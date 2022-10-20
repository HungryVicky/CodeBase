import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class sliderDemo{
    public static void main(String[] args) {

sliderDemo demo = new sliderDemo();

    }
}

public class sliderDemo extends JFrame implements ChangeListener {

    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;

    sliderDemo(){
        frame = new JFrame("slider demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0,100,50);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(15);

        slider.setFont(new Font("MV Boli",Font.BOLD,25));
        slider.setOrientation(SwingConstants.VERTICAL);
        label.setFont(new Font("MV Boli",Font.BOLD,40));
        label.setText("~C = "+slider.getValue());

        slider.addChangeListener(this);
        panel.add(slider);
        panel.add(label);


        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e){
        if(e.getSource()==slider){
            label.setText("~C = "+slider.getValue());
        }


    }

}
