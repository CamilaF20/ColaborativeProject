package view;

import logic.WorkShop;

import javax.swing.JOptionPane;

public class Runner {
    WorkShop workShop = new WorkShop();
    static Runner runner = new Runner();

    public static void main(String[] args) {
        runner.menu();
    }

    public void menu() {
        String input = JOptionPane.showInputDialog(
                "********* MENU ********\n" +
                        "1. Roman numeral\n" +
                        "2. Prime factors\n" +
                        "3. Own Name\n" +
                        "4. Egotistical numbers\n" +
                        "5. Magic number\n" +
                        "6. Friendly numbers\n" +
                        "7. Go out");

        if (input == null) {

            System.exit(0);
        }

        char option = input.charAt(0);

        switch (option) {
            case '1':
                workShop.romanNumber(10);
                break;
            case '2':
                primeFactor();
                break;
            case '3':
                workShop.ownName(null);
                break;
            case '4':
                workShop.egotisticalNumber(10);
                break;
            case '5':
                calculateMagic();
                break;
            case '6':
                workShop.friendlyNumbers(10, 20);
                break;
            case '7':
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");
        }
    }

    /**
     * This method prompts the user to enter a number to find its prime factors
     * using JOptionPane dialogs.
     * It continues to ask for input until the user decides to go back to the main
     * menu or cancels the input dialog.
     */
    private void primeFactor() {
        while (true) {
            String input = JOptionPane.showInputDialog("Enter a number to find its prime factors: ");

            if (input == null) {
                menu();
                return;
            }

            try {
                int number = Integer.parseInt(input);

                if (number < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter a positive number.");
                } else {
                    String primeFactors = WorkShop.primeFactors(number);
                    JOptionPane.showMessageDialog(null, "The prime factors of " + number + " are: " + primeFactors);

                    int response = JOptionPane.showConfirmDialog(null,
                            "Do you want to calculate prime factors for another number?", "Confirm",
                            JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.NO_OPTION) {
                        menu();
                        return;
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }

    /**
     * This method prompts the user to enter a number to check if it's a Magic
     * number using JOptionPane dialogs.
     * It continues to ask for input until the user decides to go back to the main
     * menu or cancels the input dialog.
     */
    private void calculateMagic() {
        while (true) {
            String input = JOptionPane.showInputDialog("Enter a number to check if it's a Magic number: ");

            if (input == null) {
                menu();
                return;
            }

            try {
                int number = Integer.parseInt(input);

                boolean isMagic = workShop.isMagicNumber(number);

                if (isMagic) {
                    JOptionPane.showMessageDialog(null, number + " is a Magic number!");
                } else {
                    JOptionPane.showMessageDialog(null, number + " is not a Magic number!");
                }

                int response = JOptionPane.showConfirmDialog(null, "Do you want to check another number?", "Confirm",
                        JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.NO_OPTION) {
                    menu();
                    return;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
            }
        }
    }
}