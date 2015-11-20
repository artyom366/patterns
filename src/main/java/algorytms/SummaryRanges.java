package algorytms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by artyom on 15.20.11.
 *
 * Given a sorted integer array without duplicates, return the summary of its ranges for consecutive numbers.
 *
 * For example, given [0,1,2,4,5,7], return ["0->2","4->5","7"].
 */
public class SummaryRanges {

    public static List<String> getSummaryRanges(int num[]) {

        List<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean trigger;

        for (int i = 0; i < num.length; i++) {

            trigger = true;

            int pointer = num[i], start = i;

            while (trigger) {

                int len = num.length;
                if (i + 1 == num.length) {
                    trigger = false;

                    stringBuilder.append(start).append("->").append(i);
                    result.add(stringBuilder.toString());

                    stringBuilder.setLength(0);
                    break;
                }

                pointer++;
                int future = num[i + 1];

                if (pointer == future) {
                    i++;

                } else {

                    trigger = false;

                    stringBuilder.append(start).append("->").append(i);
                    result.add(stringBuilder.toString());

                    stringBuilder.setLength(0);
                }
            }
        }

        return result;
    }
}
