package GPT;

public class reverse {

    public static void reverseArr(int number[]) {
        int first = 0, last = number.length - 1;

        while (first < last) {
            int temp = number[first];
            number[first] = number[last];
            number[last] = temp;

            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5 };
        System.out.print("THE ORIGINAL ARR: ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        ;
                System.out.println("");

        System.out.print("THE REVERSED ARR: ");

        reverseArr(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

}
