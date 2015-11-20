package algorytms;

/**
 * Created by artyom on 15.20.11.
 *
 * Implement a basic calculator to evaluate a simple expression string.
 * The expression string may contain open ( and closing parentheses ), the plus + or minus sign -,
 * non-negative integers and empty spaces.You may assume that the given expression is always valid.
 *
 * Some examples: "1 + 1" = 2, "(1)" = 1, "(1-(4-5))" = 2
 */


public class Calculator {

    public static int calculate(String s) {

        s = s.trim();
        s = s.replaceAll(" ", "");

        StringBuilder number = new StringBuilder();
        boolean isNumeric;

        for (int i = 0; i < s.length(); i++) {

            isNumeric = true;

            switch (s.charAt(i)) {

                case '0':

                case '1': {
                    number.append(1);

                    break;
                }
                case '2': {
                    number.append(2);

                    break;
                }

                case '3': {
                    number.append(3);

                    break;
                }

                case '4': {
                    number.append(4);

                    break;
                }
                case '5': {
                    number.append(5);

                    break;
                }

                case '6': {
                    number.append(6);

                    break;
                }
                case '7': {
                    number.append(7);

                    break;
                }

                case '8': {
                    number.append(8);

                    break;
                }

                case '9': {
                    number.append(9);

                    break;
                }

                case '+': {



                    break;
                }

                case '-': {

                    break;
                }

                case '=': {

                    break;
                }

                case '/': {

                    break;
                }

                case '*': {

                    break;
                }


                //todo not implemented


            }


        }
        return 0;
    }
}
