import java.awt.*;

import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;

public class CalAwt extends Frame{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    CalAwt()
    {
        setVisible(true);
        setBackground(Color.cyan);
        setSize(250,400);
        TextField screen = new TextField();
        setLayout(null);
        screen.setBounds(15,40,220,40);
        add(screen);
        Panel p = new Panel();
        



    }
    public static void main(String[] args) {
        new CalAwt();
    }
    
}
