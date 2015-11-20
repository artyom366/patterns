package algorytms;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by artyom on 15.20.11.
 *
 * You are given a string, s, and a list of words, words, that are all of the same length.
 * Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.
 *
 * For example, given: s="barfoothefoobarman" & words=["foo", "bar"], return [0,9].
 */

public class WordConcatSubstring {

    public static ArrayList<Integer> findWordSubstring(String s, String[] words) {

        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String element : words) {

            if (!wordsMap.containsKey(element)) {
                wordsMap.put(element, 1);
            } else {
                int count = wordsMap.get(element);
                count++;
                wordsMap.put(element, count);
            }
        }

        ArrayList<Integer> counters = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        int past = 0;
        for (int i = 0; i < s.length(); i += words[0].length())  {

            stringBuilder.append(s.substring(i, i + (words[0].length())));

            if (wordsMap.containsKey(stringBuilder.toString())) {

                int z = i - words[0].length();
                if (past != z) {

                    counters.add(i);
                    past = i;
                    stringBuilder.setLength(0);

                } else {
                    stringBuilder.setLength(0);
                }

            } else if (stringBuilder.length() == words[0].length()) {

                stringBuilder.setLength(0);
            }
        }


        return counters;
    }
}
