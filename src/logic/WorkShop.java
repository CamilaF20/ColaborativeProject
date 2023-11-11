package logic;

public class WorkShop {
    public String romanNumber(int num){
        //TODO Eimy
        return null;
    }

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
            // El número es primo
            result.append(originalNumber);
        }

        return result.toString();
    }

    public String ownName(String name){
        //TODO Camila
        return null;
    }

    public boolean egotisticalNumber(int num){
        //TODO eimy
        return false;
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
