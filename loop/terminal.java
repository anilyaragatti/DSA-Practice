package loop;
import java.util.*;
public class terminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime = true;
        
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
            isprime = false;
            }
        }
        if(isprime==true){
            System.out.println("prime");
        }else{
            System.out.println("not");
        }
        sc.close();
        
    }
}