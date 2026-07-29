public class re5 {

    // public static int fibonacci(int n){
    //     if(n==0){
    //         return 0;
    //     }if(n==1){
    //         return 1;
    //     }
    //     int fibN1 = fibonacci(n-1);
    //     int fibN2 = fibonacci(n-2);
    //     int finN = fibN1+fibN2;

    //     return finN;

   // }


   public static long fibonacci(int n){
    if(n==0){
        return 0;
    }if(n==1){
        return 1;
    }
    long fnm1 = fibonacci(n-1);
    long fnm2 = fibonacci(n-2);
    long res = fnm1+fnm2;
    return res;
   }

    public static void main(String[] args) {
        int n=50;
        System.out.println(fibonacci(n));
    }
}
