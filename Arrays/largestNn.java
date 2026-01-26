 package Arrays;
 public class largestNn {

    public static int getlarGestnu(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
 
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,69,7};
        System.out.println("The largest value is " + getlarGestnu(numbers));
    }
 }

 