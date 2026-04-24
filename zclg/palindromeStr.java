package zclg;

public class palindromeStr {

    public static boolean check(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(right) != s.charAt(left)) {
                return false;
            }

            left++;
            right--;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "madam";
        if (check(s) == true) {
            System.out.println("THE GIVEN STRING IS PALINDROME ");
        } else {
            System.out.println("THE GIVEN STRING IS NOT PALINDROME ");

        }
    }

}
