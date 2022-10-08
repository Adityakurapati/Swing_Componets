import javax.swing.*;
import javax.swing.plaf.BorderUIResource;

import java.awt.*;
public class JTableDemo extends JFrame{
    Container c = getContentPane();
    BorderLayout b = new BorderLayout();
    c.setLayout(b);
    String colsHeads[] = {"Name ","Roll No ","Percentage"};
    String data[][]={
        {"Aditya","15","98.20"}
    };
    JTable jtb = new JTable(data,colsHeads);
    jtb.setBackground(Color.magenta);
    int v = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
    int h = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
    JScrollPane jsp = new JScrollPane(jtb,v,h);
    c.add(jsp,BorderLayout.CENTER);

}
