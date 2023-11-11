package logic;

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

    public String primeFactors(int num) {
        //TODO Cesar
        return null;
    }

    public String ownName(String name) {
        //TODO Camila
        return null;
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

    public boolean magicNumber(int magic){
        //TODO Cesar
        return false;
    }

    public boolean friendlyNumbers(int num, int num2){
        //TODO Camila
        return false;
    }

}
