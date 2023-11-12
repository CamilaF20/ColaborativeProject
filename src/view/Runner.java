package view;

import logic.WorkShop;


import javax.swing.*;

public class Runner {
    WorkShop workShop = new WorkShop();
    static Runner runner = new Runner();

    public static void main(String[] args) {
        runner.menu();
    }
    public void menu() {
    boolean centinel = true;
    while (centinel) {
        int option = Integer.parseInt(JOptionPane.showInputDialog("********* MENU ******** \n" +
                "1. Roman numeral \n" +
                "2. Prime factors\n" +
                "3. Own Name\n" +
                "4. Egotistical numbers \n" +
                "5. Magic number\n" +
                "6. Friendly numbers\n" +
                "7. Go out"));
        switch (option) {
            case 1:
                JOptionPane.showMessageDialog(null, roman() + "\n Please press enter to go back to menu");
                break;
            case 2:
                primeFactor();
                break;
            case 3:
                JOptionPane.showMessageDialog(null,ownName() + "\n Please press enter to go back to menu ");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, egoNumber() + "\n Please press enter to go back to menu");
                break;
            case 5:
                calculateMagic();
                break;
            case 6:
                workShop.friendlyNumbers(10, 20);
                break;
            case 7:
                centinel = false;
                System.exit(0); // Exit the program
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Option");
        }
    }
}
    /**
     * Receives the number to be evaluated
     * @return the equivalent roman number
     */
    public String roman() {
        int num = 0;
        try{
            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 1 and 3999"));
            return workShop.romanNumber(num);
        }catch (Exception e){
            return "Please the next time enter a number \n";
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
     * Method that receives a text string
     * @return The proper name
     */
    public String ownName() {
        while (true) {
            String name;
            try {
                name = JOptionPane.showInputDialog("Enter your name ");
                return workShop.ownName(name);
            } catch (Exception e) {
                return "Invalid Option";
            }
        }
    }

    /**
     * Receives a number to evaluate if it is egolatrous or not
     * @return true if the number is egolatrous
     */
    private boolean egoNumber() {
        int number=0;
        try{
            number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
            return workShop.egotisticalNumber(number);
        }catch (Exception e){
            return false;
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