package zclg;

public class reverseStr {
    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = sb.length()-1;

        while (left <= right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;

        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "anil";
        System.out.println(reverse(s));
    }

}
