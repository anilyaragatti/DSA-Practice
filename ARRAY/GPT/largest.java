package GPT;

public class largest {

    public static int largestElement(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                 largest=numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {2,7,1,3,0};
        System.out.println(largestElement(numbers));
    }
    
}
