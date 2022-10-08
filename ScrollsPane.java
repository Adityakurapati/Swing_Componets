import javax.swing.*;
import java.awt.*;
public class ScrollsPane extends JFrame{
    ScrollsPane()
    {
        Container c = getContentPane();
        JScrollPane jsp = new JScrollPane();
        JTextArea ta = new JTextArea(20,20); 
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        jsp.add(ta,v,h);
        c.add(jsp);
        c.setVisible(true);
    }
    public static void main(String[] args) {
        ScrollsPane sp = new ScrollsPane();
        sp.setVisible(true);
        sp.setSize(500,500);
        sp.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
