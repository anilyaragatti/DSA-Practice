package zclg;

public class palindrome {

    public static boolean checkpalindrome(int nums[]){
        int left=0,right=nums.length-1;

        while(left<=right){
            if(nums[left]!=nums[right]){
                return false;
            } 
            left++;
            right--;
        }
        return true;

    }





    public static void main(String[] args) {
        int nums[] = {1,2,3,3,2,1};
        if(checkpalindrome(nums)==true){
            System.out.println("THE GIVEN ARRAY IS VALIDE PALINDROME");
        }else{
                        System.out.println("THE GIVEN ARRAY IS NOT A VALIDE PALINDROME");

        }
    }

}
