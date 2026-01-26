package LeetCode;

import java.util.Arrays;

public class twoSum {

    public static int[] towsum(int number[],int target){
        int left=0,right=number.length-1;

        while (left<right) {
            int sum=number[left]+number[right];
            if(sum==target) {
                return new int[] {left+1,right+1};//bcz the question is 1index   
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
            
        }
        return new int[] {-1,-1};

    }

    public static void main(String[] args) {
        int number[] = {1,2,3,4,5,6,7,8,9};
        int target = 3;
        int result[] = towsum(number, target);
        System.out.println(Arrays.toString(result));
     }
}