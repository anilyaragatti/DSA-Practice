package GPT;

public class small {
    public static int smallest(int number[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if (number[i]<small) {
                small=number[i];
            }
        }
        return small;
    }


    public static void main(String[] args) {
        int number[] = {-8, -10, -3, -6};
        System.out.println("the smallest element is : "+ smallest(number));
        
    }
    
}
