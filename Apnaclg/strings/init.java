package strings;
import java.util.*;

public class init {

    public static void allLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)+" ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        // String str = "anil";
        // System.out.println(str);

        // String str = new String("yaragatti");
        // System.out.println(str);

        // Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.print("enter your name :");
        // name=sc.nextLine();
        // System.out.println(name.length());
        // sc.close();

        // String firstName = "anil";
        // String lastName = "yaragatti";
        // String FullName = firstName+ " "+lastName;
        // System.out.println(FullName.charAt(3));

        String str = "anil yaragatti";
        allLetters(str);


    }
    
}
