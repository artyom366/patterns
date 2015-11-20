package algorytms;

import java.util.*;

/**
 * Created by artyom on 15.20.11.
 */
public class LargestNumber {

    public void getLargestNumber(int num[]) {


        ArrayList<Element> elements = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {

            String number = Integer.toString(num[i]);

            int codeSum = 0, dec;
            for (dec = 0; dec < number.length(); dec++) {

                int asci = (int)number.charAt(dec);
                codeSum += asci;

            }

            float average = codeSum / dec;
            Element element = new Element(average, number);
            elements.add(element);
        }

        Collections.sort(elements, new Comparator<Element>() {

            @Override
            public int compare(Element element, Element t1) {

                return (int)(t1.average - element.average);
            }
        });

        return;



    }

    private class Element {

        private float average;
        private String value;

        public Element(float codeSum, String value) {
            this.average = codeSum;
            this.value = value;
        }

        public float getCodeSum() {
            return average;
        }

        public void setCodeSum(float codeSum) {
            this.average = codeSum;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }


}
