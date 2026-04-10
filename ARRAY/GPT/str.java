import java.util.*;
public class str {
    
    public static void main(String[] args) {
        String name = "anil";
        System.out.println(name);
        //  StringBuilder sb=new StringBuilder(name);
        //  sb.setCharAt(0, 'd');
        //  sb.setCharAt(1, 'y');
        name=name.replace('a', 'd');
        name=name.replace('n', 'y');

        System.out.println(name);
    }
    
}
