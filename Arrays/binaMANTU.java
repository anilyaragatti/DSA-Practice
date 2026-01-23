package Arrays;

public class binaMANTU {

    public static int lowerBound(int number[], int key) {
        int first = 0, last = number.length - 1;
        int ans=number.length;

        while (first <= last) {
            int mid = (first + last) / 2;

            if (number[mid] >= key) {
                  ans = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4,5};
        int key = 3;
        System.out.println(lowerBound(numbers, key));
    }

}
