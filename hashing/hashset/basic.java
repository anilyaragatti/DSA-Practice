package hashing.hashset;

 import java.util.*;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        System.out.println(set);
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("the set not contain 2-we removed that ");
        }
        System.out.println(set);
        System.out.println(set.contains(1));

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
        // //iterator
        // Iterator it = set.iterator();// set.next set.hasnext;
        
        // while (it.hasNext()) {
        //     System.out.println(it.next());
            
        // }

        


    }
    
}
