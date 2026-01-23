package Arrays;

public class findTargetedEle {

    public static int findElement(int numbers[],int target){
        int first=0, end=numbers.length-1;
        while (first<=end) {
            int mid = (first+end)/2;

            if(numbers[mid]==target){
                return mid;
            } if (numbers[mid]<target){
                first=mid+1;   
            }else{
                end=mid-1;
            }

        //NOT CORRECT::::
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {4,5,6,7,0,1,2};
        int target = 2;
        System.out.println("THE TARGET NUMBER INDEX IS "+findElement(numbers, target));
    }
    
}
