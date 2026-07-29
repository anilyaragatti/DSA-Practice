import java.util.LinkedList;
public class collections {
    public static void main(String[] args) {
        //creat
        LinkedList<Integer> ll = new LinkedList<>();

        //to add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);

        //remove
        ll.removeFirst();
        System.out.println(ll);

        
    }
    
}
