package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
public static void main(String[] args) {
        List<String> f=new ArrayList<>();
        f.add("Apple");
        f.add("Mango");
        f.add("Dragon fruit");
        f.add("hfgdsh");
        f.add("water melon");
        //f.add(5);
        System.out.println(f);
        
        System.out.println(f.size());
        System.out.println(f.get(0));
        
        f.set(2, "orage");
        System.out.println(f);
        
        f.remove(0);
        System.out.println(f);
        
        System.out.println(f.contains("apple"));
        //for each 
        for(String fruits:f) {
                System.out.println(fruits);
        }
        
        f.clear();
        System.out.println(f);
        
        f.isEmpty();
        System.out.println(f);
}
}
