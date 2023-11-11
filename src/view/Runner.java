package view;

import logic.WorkShop;
import java.util.Scanner;

public class Runner {
    static Scanner sc = new Scanner(System.in);
    WorkShop workShop = new WorkShop();
    static Runner runner = new Runner();

    public static void main(String[] args) {
        runner.menu();
    }

    public void menu() {
        System.out.println("********* MENU ******** \n" +
                "1. Roman numeral \n" +
                "2. Prime factors\n" +
                "3. Own Name\n" +
                "4. Egotistical numbers\n" +
                "5. Magic number\n" +
                "6. Friendly numbers\n" +
                "7. Go out");

        char option = sc.nextLine().charAt(0);

        switch (option) {
            case '1' -> workShop.romanNumber(10);
            case '2' -> primeFactor();
            case '3' -> workShop.ownName(null);
            case '4' -> workShop.egotisticalNumber(10);
            case '5' -> workShop.magicNumber(10);
            case '6' -> workShop.friendlyNumbers(10, 20);
            case '7' -> System.exit(0);
            default -> System.err.println("Invalid Option");
        }
    }

    private void primeFactor() {
        while (true) {
            System.out.print("Enter a number to find its prime factors: ");
            try {
                int number = Integer.parseInt(sc.nextLine());
                if (number < 0) {
                    System.out.println("Please enter a positive number.");
                } else {
                    String primeFactors = WorkShop.primeFactors(number);
                    System.out.println("The prime factors of " + number + " are: " + primeFactors);

                    System.out.print("Do you want to calculate another number? (Y/N): ");
                    char response = sc.nextLine().charAt(0);

                    if (Character.toUpperCase(response) != 'Y') {
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
