package logic;

import java.util.Arrays;

public class WorkShop {
    public String romanNumber(int num) {
        // TODO Eimy
        return null;
    }

    /**
     * Computes the prime factors of a given number.
     *
     * @param number The number to find prime factors for.
     * @return A string representing the prime factors in the format "p1^x1 * p2^x2
     *         * ...".
     */
    public static String primeFactors(int number) {
        StringBuilder result = new StringBuilder();
        int originalNumber = number;

        for (int i = 2; i <= number; i++) {
            int count = 0;
            while (number % i == 0) {
                number = number / i;
                count++;
            }

            if (count > 0) {
                if (result.length() > 0) {
                    result.append(" * ");
                }
                result.append(i);
                if (count > 1) {
                    result.append("^").append(count);
                }
            }
        }

        if (result.length() == 0) {
            result.append(originalNumber);
        }

        return result.toString();
    }

    public String ownName(String name) {
        // TODO Camila
        return null;
    }

    public boolean egotisticalNumber(int num) {
        // TODO eimy
        return false;
    }

    /**
     * Checks if a number is a magic number.
     *
     * @param number The number to check for magic number property.
     * @return True if the number is a magic number, false otherwise.
     */
    public boolean isMagicNumber(int number) {
        String numberStr = Integer.toString(number);
        int[] digits = new int[numberStr.length()];

        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        int[] ascending = Arrays.copyOf(digits, digits.length);
        Arrays.sort(ascending);

        int[] descending = Arrays.copyOf(digits, digits.length);
        Arrays.sort(descending);
        for (int i = 0; i < descending.length / 2; i++) {
            int temp = descending[i];
            descending[i] = descending[descending.length - 1 - i];
            descending[descending.length - 1 - i] = temp;
        }

        int resultDifference = Integer.parseInt(Arrays.toString(descending).replaceAll("\\D", ""))
                - Integer.parseInt(Arrays.toString(ascending).replaceAll("\\D", ""));

        return resultDifference == number;
    }

    public boolean friendlyNumbers(int num, int num2) {
        // TODO Camila
        return false;
    }

}
