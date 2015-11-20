package algorytms;

/**
 * Created by artyom on 15.20.11.
 *
 * Given a string S, you are allowed to convert it to a palindrome by adding characters in front of it.
 * Find and return the shortest palindrome you can find by performing this transformation.
 *
 * For example, given "aacecaaa", return "aaacecaaa"; given "abcd", return "dcbabcd".
 */

public class ShortestPalindrome {

    public String getPalindrome(String s) {

        if (isPalindrome(s)) return s;

        StringBuilder stringBuilder = new StringBuilder(s);
        for (int j = 0, i = s.length() - 1; i > 0; i--, j++) {

            stringBuilder.insert(j, s.charAt(i));
            if(isPalindrome(stringBuilder.toString())) return stringBuilder.toString();

            System.out.println(stringBuilder);
        }
        return null;
    }

    private boolean isPalindrome(String s) {

        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {

            if (i < j) {
                if (s.charAt(i) != s.charAt(j)) {
                    return false;
                }
            }

        }

        return true;
    }

}
