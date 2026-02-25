package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortColour {

    public static void sortColours(int nums[]){
        int n=nums.length;

        int low=0;
        int mid=0;
        int high=n-1;

        while (mid<=high) {
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
            
        }
    }


    public static void main(String[] args) {
            int nums[] = {2,0,2,1,1,0};
             sortColours(nums);
System.out.println(Arrays.toString(nums));
 
    }

    
}
