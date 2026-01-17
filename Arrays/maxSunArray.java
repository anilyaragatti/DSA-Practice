package Arrays;

public class maxSunArray {

    public static void maxSubArray(int numbers[]) {
        int cursum = 0;
        int maxSub = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                cursum = 0;
                for (int k = i; k <= j; k++) {
                    cursum += numbers[k];

                }
                System.out.println(cursum);
                if (maxSub < cursum) {
                    maxSub = cursum;
                }
            }
        }
        System.out.println("MAX SUM = " + maxSub);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxSubArray(numbers);
    }

}
