import javax.swing.*;
import java.awt.*;
class Jscroll extends JFrame {
    Jscroll()
    {
        setVisible(true);
        setSize(400,400);
        Container c = getContentPane();
        c.setBackground(Color.magenta);

        c.setLayout(new FlowLayout());
        JButton jb1 = new JButton("Click Me ");
        JButton jb2 = new JButton("OK ");
        JButton jb3 = new JButton("Cancel");
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jb1,v,h);
        // jsp.setLayout(new FlowLayout());
        jsp.add(jb2);jsp.add(jb3);

        c.add(jsp);

    }
    public static void main(String a[])
    {
        new Jscroll();
    }
}
