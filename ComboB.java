import java.awt.*;
import java.util.*;
import javax.swing.*;
public class ComboB extends JFrame{
    ComboB()
    {
        setVisible(true);
        setSize(400,400);
        Vector v = new Vector(5);
        v.add("C");
        v.add("C++");
        v.add("Java");
        v.add("Python");
        v.add("JS");

        JComboBox cb = new JComboBox(v);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(cb);
    }
    public static void main(String a[])
    {
        new ComboB();
    }
    
}
