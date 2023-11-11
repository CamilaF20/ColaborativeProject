package view;

import logic.WorkShop;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class Runner {
    WorkShop workShop = new WorkShop();
    static Runner runner = new Runner();
    public static void main(String[] args) {
        runner.menu();
    }
    public void menu(){
        boolean centinel= true;
            while  (centinel){
                int option = Integer.parseInt(JOptionPane.showInputDialog("********* MENU ******** \n" +
                        "1. Roman numeral \n" +
                        "2. Prime factors\n" +
                        "3. Own Name\n" +
                        "4. Egotistical numbers \n" +
                        "5. Magic number\n" +
                        "6. Friendly numbers\n" +
                        "7. Go out"));
                switch (option){
                    case 1 -> JOptionPane.showInputDialog(roman() +
                            "\n Please press enter to go back to menu");
                    case 2 -> workShop.primeFactors(10);
                    case 3 -> workShop.ownName(null);
                    case 4 -> JOptionPane.showInputDialog(egoNumber() +
                            "\n Please press enter to go back to menu");
                    case 5 -> workShop.magicNumber(10);
                    case 6 -> workShop.friendlyNumbers(10,20);
                    case 7 -> centinel = false;
                    default -> System.err.println("Invalid Option");
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
}
