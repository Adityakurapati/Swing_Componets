import java.util.*;

class Demo {
    public static void main(String a[]) {
        String s[][] = {
                { "This Pc" }, { "Local Disk C", "Local Disk D", "Downloads", "Documents" },
                { "Libraries" }, { "Camera Roll", "Music", "Pictures", "Videos" },
                { "Network" }, { "198.168.61.11" }
        };
        
        Hashtable ht = new Hashtable();
        for (int i = 0; i < s.length; i++) {
            ht.put(s[i][0], s[i + 1]);
        }
        System.out.println(ht);
    }
}