import javax.swing.*;
import java.awt.*;
import java.util.*;
import javax.swing.tree.*;

public class TreeUsingHashTable extends JFrame {
    TreeUsingHashTable(){
        String s[][] = {
                        {"This Pc"},{"Local Disk C","Local Disk D","Downloads","Documents"},
                        {"Libraries"},{"Camera Roll","Music","Pictures","Videos"},
                        {"Network"},{"198.168.61.11"}
                        };
        Hashtable ht = new Hashtable();
        for(int i=0;i<3;i++)
        {
            ht.put(s[i][0],s[i][i+1]);
        }
        
        JTree jt = new JTree(ht);
        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
        JScrollPane jsp = new JScrollPane(jt,v,h);
        getContentPane().add(jsp,v,h);     
    }

    public static void main(String[] args) {
        TreeUsingHashTable tut = new TreeUsingHashTable();
        tut.setVisible(true);
        tut.setSize(100, 100);
        tut.setBackground(Color.magenta);
        tut.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
