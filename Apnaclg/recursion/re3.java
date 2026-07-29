public class re3 {

    // public static int factorial(int n){
    //     if(n==0){
    //          return 1;
    //     }
    //     //  n=n*factorial(n-1);
    //     //  return n;
    //     int fnm1 = factorial(n-1);
    //     int fn = n*fnm1;
    //     return fn;
    //   }


    public static int factorial(int n){
      if(n==0){
        return 1;
      }
      int fnm1 = factorial(n-1);
      int fact = n*fnm1;
      return fact;
    }
    public static void main(String[] args) {
        int n=5;
 System.out.println(factorial(2));  
  }
    
}
