package loop;


import java.util.*;
public class primeno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isprime  = true;

        for(int i=2;i<n-1;i++){
            if(n % 1 ==0){
                isprime = false;
            }
        }
        if(isprime==true){
            System.out.println("n is prime number");
        }else{
            System.out.println("n is even number");
        }
        sc.close();
        
    }
}