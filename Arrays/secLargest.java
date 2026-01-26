package Arrays;

public class secLargest {

    public static int seclargets(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                secLargest=largest;
                largest=numbers[i];
            }else if(numbers[i]>secLargest && numbers[i]!=largest){
                secLargest=numbers[i];
            }
        }
        return secLargest;

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10,12 };
        System.out.println("THE SEC LARGEST ELEMENT IS : "+ seclargets(numbers));
    }
}