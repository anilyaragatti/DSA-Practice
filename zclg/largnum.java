package zclg;

public class largnum {

    public static int largnumber(int nums[]) {
        int small = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < small) {
                small = nums[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int nums[] = {100,2,3,41,5,6,7,8};
System.out.println(largnumber(nums));
        
    }

}
