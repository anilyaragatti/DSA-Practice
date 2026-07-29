/**
 * basic
 */
public class Re1 {
    // public static void printDec(int n){
    //     if(n==1){
    //         System.out.println(n); // base case 
    //         return;
    //     }
    //     System.out.println(n+" "); //logic or work 
    //     printDec(n-1);  //function call
    // } 


    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n-1);
    }


public static void main(String[] args) {
    int n=11;
    printDec(n);
}
    
}