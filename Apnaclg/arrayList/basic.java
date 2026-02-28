package arrayList;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // O(n);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // get element O(n)
        int element = list.get(2);
        System.out.println("the 2nd index is :" + element);

        // delete;
        list.remove(2);
        System.out.println(list);

        // set
        list.set(2, 100);
        System.out.println(list);

        // contain
        System.out.println(list.contains(3));
        System.out.println(list.contains(5));


        //size()
        System.out.println(list.size());

    }

}
