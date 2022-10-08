import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CalculatorGui extends JFrame {
    CalculatorGui()
    {
        setVisible(true);
        setSize(250,400);
        Container c = getContentPane();
        c.setBackground(Color.cyan);
        c.setSize(200,200);
        BorderLayout b = new BorderLayout();
        // c.setLayout(new FlowLayout());
        JPanel JP = new JPanel();
        JP.setSize(200,100);
        JP.setBackground(Color.GRAY);
        JTextArea screen = new JTextArea();
        JP.add(screen);
        c.add(JP,BorderLayout.NORTH);

    }
    public static void main(String a[])
    {
        new CalculatorGui();
    }
    
}
