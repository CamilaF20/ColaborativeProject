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
    public void menu(){

        System.out.println("********* MENU ******** \n" +
                "1. Roman numeral \n" +
                "2. Prime factors\n" +
                "3. Own Name\n" +
                "4. Egotistical numbers" +
                "5. Magic number\n" +
                "6. Friendly numbers" +
                "7. Go out" );
        int option = sc.nextInt();
        switch (option){
            case 1 -> workShop.romanNumber(10);
            case 2 -> workShop.primeFactors(10);
            case 3 -> workShop.ownName(null);
            case 4 -> workShop.egotisticalNumber(10);
            case 5 -> workShop.magicNumber(10);
            case 6 -> workShop.friendlyNumbers(10,20);
            case 7 -> runner.menu();
            default -> System.err.println("Invalid Option");
        }
    }
}
