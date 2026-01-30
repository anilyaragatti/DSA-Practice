

 public class first {
    public static void main(String[] args) {
        int n = 10899;
        int re = 0;////change
        while (n>0) {
            int ls = n%10;
             re = (re*10)+ls; 
             n=n/10;   
        }
        
        System.out.println("storing the number"+re);
    } 
}