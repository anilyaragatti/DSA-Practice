public class re4 {

    public static int sumOfNu(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumOfNu(n-1);
         int sum=n+snm1;//sum of n-1;
        return sum;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNu(n));
    }
    
}
