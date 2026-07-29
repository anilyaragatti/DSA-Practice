public class re12 {

    public static void removeDuplicates(int idx, String s, StringBuilder newStr, boolean freq[]) {
        if (idx == s.length()) {
            System.out.println(newStr);
            return;
        }
        // worl OR logic
        char currentChar = s.charAt(idx);
        if (freq[currentChar - 'a'] == true) {// char id duplicate
            removeDuplicates(idx + 1, s, newStr, freq);

        } else {
            freq[currentChar - 'a'] = true;
            removeDuplicates(idx + 1, s, newStr.append(currentChar), freq);

        }

    }

    public static void main(String[] args) {
        String s = "aaaa";
        removeDuplicates(0, s, new StringBuilder(""), new boolean[26]);

    }

}
