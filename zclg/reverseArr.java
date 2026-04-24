package zclg;

public class reverseArr {
    public static void reverse(int nums[]){
        int left=0,right=nums.length-1;
        while (left<=right) {
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
            
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        reverse(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] +" ");
        }
    }
    
}
