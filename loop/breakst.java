package loop;

import java.util.*;
public class breakst {
 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     
    do{
        System.out.println("enter your number");
        int n= sc.nextInt();
        if(n%10==0){
                 System.out.println("you entered multiple of 10");

            break;
        }
          System.out.println(n);
    } while(true);
    sc.close();

 }
    
}