import javax.swing.*;
import java.awt.*;
class MyTable extends JFrame{
    MyTable()
    {
        Container c = getContentPane();
        
        // c.setLayout(new FlowLayout());
        String colsHead[]={"Name","Roll No ","Percentage"};
        String data[][]={
            {"Aditya","14","98.50"},
            {"Aditya","14","98.50"},
            {"Aditya","14","98.50"},
            {"Aditya","14","98.50"},
            {"Aditya","14","98.50"},
            {"Aditya","14","98.50"},
            {"Aditya","14","98.50"},
            {"Aditya","14","98.50"},
            {"Shubham","17","95.50"},
            {"Rohit","20","86.50"}
        };
        JTable jt1 = new JTable(data,colsHead);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jt1,v,h);
        c.add(jsp);

    }
    public static void main(String[] args) {
        MyTable m = new MyTable();
        m.setVisible(true);
        m.setSize(400,400);
        m.setTitle("My Table");
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}