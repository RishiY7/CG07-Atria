package collectionframework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// demo for comparator 

class Person1{
        String name;
        int age;
        
        public Person1(String name, int age) {
                super();
                this.name = name;
                this.age = age;
        }
        void display() {
                System.out.println("name :"+name +"age :"+age);
        }
}
// sort by name

class Namecomparator implements Comparator<Person1>{

        @Override
        public int compare(Person1 o1, Person1 o2) {
                
                return o1.name.compareTo(o2.name);
        }
        
}
// sort by age

class Agecomparator implements Comparator<Person1>{

        @Override
        public int compare(Person1 o1, Person1 o2) {
                
                return Integer.compare(o1.age, o2.age);
        }
        
}

public class Comparatordemo {
public static void main(String[] args) {
        ArrayList<Person1> obj=new ArrayList<Person1>();
        obj.add(new Person1("Rashmi",26));
        obj.add(new Person1("Kusuma",20));
        obj.add(new Person1("Rashi",23));
        obj.add(new Person1("Hushmi",16));
        
        // sort by name
        Collections.sort(obj,new Namecomparator());
        System.out.println("sorted by name");
        for(Person1 p:obj) {
                p.display();
        }
        
        //sort by age
        
        Collections.sort(obj,new Agecomparator());
        System.out.println("sorted by age");
        for(Person1 p1:obj) {
                p1.display();
        }
}
}

