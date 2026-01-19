package Arrays;

public class prefixSum {  

    public static void  calculatePrefixSum(int numbers[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }


        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                curSum= i==0 ? prefix[j]: prefix[j]-prefix[i-1];
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
        }
        System.out.println("MAX SUM = "+ maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        calculatePrefixSum(numbers);
    }
    
}
