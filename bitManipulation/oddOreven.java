
package bitManipulation;
public class oddOreven {

    public static void evenOrOdd(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(1);
        evenOrOdd(3);
        evenOrOdd(4);
        evenOrOdd(20);
        
    }
    
}
