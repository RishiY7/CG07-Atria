package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

// demo for comparable (used defined class)
class Person implements Comparable<Person>{
        
         String name;
        int age;
        
        Person(String name, int age){
                this.name=name;
                this.age=age;
        }
        void display() {
                System.out.println(" name "+ name +" Age "+age);
        }

        @Override
        public int compareTo(Person o) {
        
                return this.name.compareTo(o.name);
        }
        
}

public class Comparabledemo {
        public static void main(String[] args) {
                ArrayList<Person> al=new ArrayList<>();
                al.add(new Person("John",30));
                al.add(new Person("Sushma",7));
                al.add(new Person("Gushma",79));
                al.add(new Person("Mushma",57));
                
                Collections.sort(al);
                
                for(Person g:al) {
                        g.display();
                }
                
        }

}
