package logic;

import java.util.Arrays;

public class WorkShop {
    public String romanNumber(int num) {
        // TODO Eimy
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
    public boolean isMagicNumber(int numero) {
        // Convertir el número en una cadena para trabajar con los dígitos
        String numeroStr = Integer.toString(numero);
        int[] digitos = new int[numeroStr.length()];

        // Extraer los dígitos y almacenarlos en un arreglo
        for (int i = 0; i < numeroStr.length(); i++) {
            digitos[i] = Character.getNumericValue(numeroStr.charAt(i));
        }

        // Ordenar los dígitos en orden ascendente y descendente
        int[] ascendente = Arrays.copyOf(digitos, digitos.length);
        Arrays.sort(ascendente);

        int[] descendente = Arrays.copyOf(digitos, digitos.length);
        Arrays.sort(descendente);
        for (int i = 0; i < descendente.length / 2; i++) {
            int temp = descendente[i];
            descendente[i] = descendente[descendente.length - 1 - i];
            descendente[descendente.length - 1 - i] = temp;
        }

        // Calcular la diferencia entre los números ordenados
        int resultadoResta = Integer.parseInt(Arrays.toString(descendente).replaceAll("\\D", ""))
                - Integer.parseInt(Arrays.toString(ascendente).replaceAll("\\D", ""));

        // Verificar si es "Magic" o "No Magic"
        return resultadoResta == numero;
    }

    

    public boolean friendlyNumbers(int num, int num2) {
        // TODO Camila
        return false;
    }

}
