import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.*;
import java.io.*;

class MainPanel extends JPanel
    implements ActionListener {

    JButton adamButton;
    JButton hoodButton;

    JTextArea textArea;

    JScrollPane scrollPane;
    

  public MainPanel() {

    textArea = new JTextArea(20, 25);
    scrollPane = new JScrollPane();
    scrollPane.setViewportView(textArea);
    adamButton = new JButton("Adam's Button");  
    hoodButton = new JButton("Hood College"); 
  
    add(scrollPane);
    add(adamButton);
    add(hoodButton);     

    adamButton.addActionListener(this);
    hoodButton.addActionListener(this);

  }

  // ActionPerformed method from ActionListener interface
  public void actionPerformed(ActionEvent e){ 

    Object source = e.getSource();


    if (source == adamButton)
    {
    textArea.setText(adamMethod(textArea.getText()));

    }
    else if(source == hoodButton)
    {
        textArea.setText(nMethod(textArea.getText()));

    }
    

  }
  public String nMethod(String val)
  {

try {
    URL myURL = new URL("http://cs.hood.edu");

} catch (MalformedURLException e) {
   }

      return (val + "\nHood College\nComputer Science Department\n");

  }  

  public String adamMethod(String val)
  {
    return (val + " yo yo dog its yo boy adam");

  }


} 
    class StringThing extends JFrame {
      public StringThing() {
            setTitle("Collaborative String Manipulator");
            setSize(350, 500);
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