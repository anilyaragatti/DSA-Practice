 package functions;
 public class syntax {

    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        
    }
 
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println(" it is out side the func a = "+ a);
        System.out.println(" it is out side the func b = "+ b);
        swap(a,b);
        
    }
 }