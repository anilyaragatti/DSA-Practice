package Arrays;

public class selectionSort {

    public static void selectionsort(int number[]){
        for(int i=0;i<number.length-1;i++){
            int minPos = i;
            for(int j=i+1;j>number.length;j++){ 
                if(number[minPos]<number[j]){
                    minPos=j;
                }
            }
             int temp = number[minPos] ;
             number[minPos]=number[i];
             number[i]=temp;
        }

       
    }

    public static void main(String[] args) {
        int number[] =  {9,1,8,2,7,3,6,4,5,0};
        selectionsort(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
    
}
