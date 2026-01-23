package Arrays;

public class sumIndex {

    public static void sumIndexofarr(int number[],int target){
        int left=0, right=number.length-1;
        int[] res = new int[2];
        while (left<right) {
            int sum=number[left]+number[right];
            if(sum==target){
                res[0]=left+1;
                res[1]=right+1;
                return res;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
            
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target=9;
        sumIndexofarr(numbers, target);

    }
    
}
