package GPT;

public class largSmall {

    public static void largAndsmall(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        System.out.println("the largest : " + largest);
        System.out.println("the smallest : " + smallest);

    }

    public static void main(String[] args) {
        int number[] = { 9, 1, 0, 8, 5, 0, 3 };
        largAndsmall(number);
    }

}
