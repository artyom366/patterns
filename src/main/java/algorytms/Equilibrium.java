package algorytms;

import java.util.ArrayList;

/**
 * Created by artyom on 15.20.11.
 */
public class Equilibrium {

    public int solution(int[] a) {

        int max = Integer.MAX_VALUE;

        int before = 0;

        for (int i = 0; i < a.length - 1; i++) {


            before += a[i];

            int after = 0;
            for (int j = i + 1; j < a.length; j++) {

                after += a[j];
            }

            int diff = Math.abs(before - after);
            if (max > diff) {
                max = diff;
            }

        }
        return max;
    }

    public int anotherSolution(int[] A) {

        int max = Integer.MAX_VALUE;

        int before = A[0];
        int after = 0;
        int slider = 1;

        for (int i = 1; i < A.length; i++) {
            after += A[i];
        }

        while (slider < A.length - 1) {

            before += A[slider];
            after -= A[slider];

            slider++;

            int diff = Math.abs(before - after);
            if (max > diff) {
                max = diff;
            }

        }

        return max;
    }
}
