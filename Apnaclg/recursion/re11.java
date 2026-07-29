public class re11 {

    public static int tilingProb(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // work
        // vertical choice
        int ver = tilingProb(n - 1);

        // horizontal choice
        int hor = tilingProb(n - 2);

        int totalWays = ver + hor;
        return totalWays;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(tilingProb(n));
    }
}
