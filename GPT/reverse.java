package GPT;

public class reverse {

    public static void reverseOfArr(int number[]){
        int first=0,last=number.length-1;

        while (first<last) {
            int temp=number[first];
            number[first]=number[last];
            number[last]=temp;

            first++;
            last--;
            
        }
    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        reverseOfArr(number);
        System.out.print("THE REVERSED ARR IS ");
        for(int i=0;i<number.length;i++){
            System.out.print( number[i]+" ");
        }
    }
}