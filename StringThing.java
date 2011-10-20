import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainPanel extends JPanel
    implements ActionListener {

    JButton adamButton;

    JTextArea textArea;
    JScrollPane scrollPane;
    

  public MainPanel() {

    textArea = new JTextArea(5, 20);
    textArea.setText("Enter some text here!");
    scrollPane = new JScrollPane();
    scrollPane.setViewportView(textArea);
    adamButton = new JButton("Adam's Button");
  
    add(scrollPane);
    add(adamButton); 

    adamButton.addActionListener(this);
    
  }

  // ActionPerformed method from ActionListener interface
  public void actionPerformed(ActionEvent e){ 

    Object source = e.getSource();


    if (source == adamButton)
    {
    adamMethod(textArea.getText());

    }
    

  }

  public void adamMethod(String val)
  {
    String[] ary;
    ary = val.split(" ");
    for (int i=0; i < ary.length; i++)
    {
         JOptionPane.showMessageDialog(null,ary[i]);
    }

  }


} 

    class StringThing extends JFrame {
      public StringThing() {
            setTitle("Collaborative String Manipulator");
            setSize(350, 300);
            addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
              System.exit(0);
            }
            }); // addWindowListener
            Container contentPane = getContentPane();
            MainPanel mainp = new MainPanel();
            contentPane.add(mainp);
      } // StringThing
    
      public static void main(String[] args) {
        JFrame StrManip = new StringThing();
        StrManip.show();
      }
    }