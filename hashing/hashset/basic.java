package hashing.hashset;

import java.util.HashSet;

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
        System.out.println(set);
        System.out.println(set.contains(1));
    }
    
}
