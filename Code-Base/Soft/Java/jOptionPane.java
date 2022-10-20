import javax.swing.JOptionPane;

public class jOptionPane {
    public static void main(String[] args) {

        String[] response = {"Yes it's me","no it's not me","pop"};
        
        JOptionPane.showMessageDialog(null,
                "this is a PLAIN_MESSAGE",
                "showMessageDialog",
                JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "this is a INFORMATION_MESSAGE",
                "showMessageDialog",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "this is a QUESTION_MESSAGE",
                "showMessageDialog",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "this is a ERROR_MESSAGE",
                "showMessageDialog",
                JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,
                "this is a WARNING_MESSAGE",
                "showMessageDialog",
                JOptionPane.WARNING_MESSAGE);
      JOptionPane.showConfirmDialog(null,
              "This Is a ConfirmDialog",
              "showConfirmDialog",
              JOptionPane.YES_NO_CANCEL_OPTION,
              JOptionPane.QUESTION_MESSAGE,
              null);
        
      JOptionPane.showOptionDialog(null,
              "this is a OptionDialog",
              "showOptionDialog",
              JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
              null,
              response,
              null
              );
    }
}


