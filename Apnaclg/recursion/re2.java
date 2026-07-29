public class re2 {

    // public static void println(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     println(n-1);
    //     System.out.println(n);
        
        
    // }

    public static void println(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        println(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n=12;
        println(n);
    }
    
}
