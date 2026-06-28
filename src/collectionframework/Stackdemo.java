package collectionframework;
import java.util.Stack;

//demo for stack 
public class Stackdemo {
     public static void main(String[] args) {
             Stack<Integer> s=new Stack<Integer>();
             
             s.push(2);
             s.push(4);
             s.push(4);
             s.push(8);
             s.push(9);
             
             System.out.println(s);
             for(int d:s) {
                     System.out.println(d);
             }
             // peek()
             System.out.println(s.peek());
             System.out.println(s.search(34));
             
             s.pop();
             s.pop();
             System.out.println(s);
     }

}
