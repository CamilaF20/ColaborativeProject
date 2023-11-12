package logic;

import java.util.Arrays;

public class WorkShop {
    /**
     * Checks if the given number is equivalent to a roman number between 1 and 3999
     *
     * @param num is the integer to be evaluated
     * @return the roman number equivalent to the integer given, if it's valid
     */
    public String romanNumber(int num) {
        String[] unities = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thuosandths = {"", "M", "MM", "MMM"};

        int indext, indexh, indextens, indexu;

        indext = num / 1000;
        num = num % 1000;

        indexh = num / 100;
        num = num % 100;

        indextens = num / 10;
        num = num % 10;

        indexu = num;

        return thuosandths[indext] + hundreds[indexh] + tens[indextens] + unities[indexu];
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

    /**
     * method that modifies the character string
     * @param name user-given character string.
     * @return modified proper noun.
     */
    public String ownName(String name) {
        char[] own = new char[name.length()];
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(i - 1 < 0 || i + 1 > name.length())
                continue;
            if (name.charAt(i) == ' ' && name.charAt(i - 1) == ' ') {
                continue;
            }
            if (name.charAt(i) != ' ' && name.charAt(i - 1) == ' ' && name.charAt(i + 1) == ' '){
                own[count] = Character.toLowerCase(name.charAt(i));
                count++;
                continue;
            }
            if (name.charAt(i) != ' ' && name.charAt(i - 1) == ' '){
                own[count] = Character.toUpperCase(name.charAt(i));
                count++;
            }else {
                own[count] = Character.toLowerCase(name.charAt(i));
                count++;
            }
        }
        if (name.charAt(0) != ' '){
            own[0] = Character.toUpperCase(name.charAt(0));
        }
        String ownString = new String(own);
        return ownString.trim();
    }


    /**
     * Checks if the given number is egolatrous
     * @param num is the number to be evaluated
     * @return true if the number is egolatrous, false if is not
     */
    public boolean egotisticalNumber(int num){

        String number = String.valueOf(num);
        int digits = number.length();
        int res =0;
        boolean isEgo = true;
        for (int index = 0; index< number.length(); index++){
            int charNum = Character.getNumericValue(number.charAt(index));
            res += (int)Math.pow(charNum, digits);
        }

        return res == num ? isEgo : !isEgo;
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

    /**
     * Method that evaluates whether the sum of the divisors of two numbers are equal or not
     * @param numberOne Receives the first number to evaluate
     * @param numberTwo Receives the second number to evaluate
     * @return Whether the numbers evaluated are friends or not
     */
    public boolean friendlyNumbers(int numberOne, int numberTwo) {
        int divisors = 0;
        int sum1 = 0;
        int sum2 = 0;
        for (int count = 1; count < numberOne; count++) {
            if (numberOne % count == 0) {
                divisors = count;
                sum1 += divisors;
            }
        }
        for (int count = 1; count < numberTwo; count++){
            if (numberTwo % count == 0){
                divisors = count;
                sum2 += divisors;
            }
        }
        if (sum1 == numberTwo && sum2 == numberOne){
            return true;
        }else {
            return false;
        }
    }
}
