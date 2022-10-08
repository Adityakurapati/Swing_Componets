import javax.swing.*;
import java.awt.*;
class MyTable extends JFrame{
    MyTable()
    {
        Container c = getContentPane();
        String colsHead[]={"Name","Roll No ","Percentage"};
        String data[][]={
            {"Aditya","14","98.50"},
            {"Shubham","17","95.50"},
            {"Rohit","20","86.50"}
        };
        JTable jt1 = new JTable(data,colsHead);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        JScrollPane jsp = new JScrollPane(jt1,v,h);
        c.add(jsp);

    }
    public static void main(String[] args) {
        new MyTable();
    }


}