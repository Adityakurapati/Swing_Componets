import javax.swing.*;
import java.awt.*;
class FirstSwing extends JFrame
{
    FirstSwing()
    {
        Container c = getContentPane();
        setVisible(true);
        setSize(250,400);
        c.setLayout(new FlowLayout());
        ImageIcon ii = new ImageIcon("nature.jpeg");
        JLabel jl = new JLabel("UserName ");
        c.add(jl);
        // c.setVisible(true);

    }
    public static void main(String a[])
    {
        new FirstSwing();

    }
}