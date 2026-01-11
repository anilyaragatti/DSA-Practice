package functions;import java.util.*;

public class bio_co {


    // to find factorial if number
public static int fact(int n){
    int f=1;
    for(int i=1;i<=n;i++){
        f=f*i;
    }
    return f;

}

//  to find biocoefficient nCr 
public static int bioco(int n, int r){
    int fact_n = fact(n);   //here we call the above factorial function
    int fact_r = fact(r);
    int fact_n_r = fact(n-r);
    int bico = fact_n/(fact_r*fact_n_r);
    return bico;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        // System.out.println("the factorial is " + fact(n));
        System.out.println("the binomial coefficient is " + bioco(n,r));
        sc.close(); 
    }
    
}
