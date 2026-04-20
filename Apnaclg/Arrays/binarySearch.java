package Arrays;

public class binarySearch {
    // public static int binary(int numbers[], int key){
    //     int start=0,end=numbers.length-1;

    //     while (start<=end) {
    //         int mid = (start+end)/2; // mid


    //         // comparison
    //         if(numbers[mid]==key){
    //             return mid;
    //         }
    //         if (numbers[mid]<key) {
    //             start = mid+1; 
    //         }else{
    //             end = mid-1;
    //         }
            
    //     }
    //     return -1;
    // }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14};
        int key = 7;
        System.out.println("index for key is "+ binary(numbers, key));
    }

    public static int binary(int numbers[],int key){
        int start=0;int end=numbers.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            if(numbers[mid]==key){
                return mid;
            }else if(numbers[mid]>key){
                end=mid-1;

            }else{
                start=mid+1;
            }
            
        }
        return start;

    }
    
}

