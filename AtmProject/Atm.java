package AtmProject;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cardnumber = "12345";
        String pin = "1209";
        String username = "Manas";
        double balance = 100000;

        System.out.println("========================================================");
        System.out.println("              WELCOME TO JAVA BANK ATM");
        System.out.println("========================================================");

        System.out.print("Enter Your Card Number : ");
        String entercard = sc.nextLine();
        if (!entercard.equals(cardnumber)) {
            System.out.print("invalid card number | please try again");
            return;
        }
        boolean isverified = false;
        for (int i = 0; i <= 3; i++) {
            System.out.print("Enter a 4 - Digit Pin : ");
            String enterpin = sc.nextLine();
            if (enterpin.equals(pin)) {
                isverified = true;
                System.out.println("Acces Granted | welcome");
                break;
            } else {
                System.out.println("Wrong Pin | attempt " + (3 - i));
            }
        }

        if (!isverified) {
            System.out.println("Too many attempt , your card is blocked");
            return;
        }

        while (true) {
            System.out.println("========================MAIN MENU===================");
            System.out.println(" 1 -> check balance ");
            System.out.println(" 2 -> deposite money ");
            System.out.println(" 3 -> withdraw money ");
            System.out.println(" 4 ->  change PIN ");
            System.out.println(" 5 -> exist");
            System.out.println("Enter your choice(1-5)");

            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Your balance is $" + balance);
            } else if (choice == 2) {
                System.out.print("Enter the amount you want to deposite :");
                double deposite = sc.nextDouble();
                if (deposite > 0) {
                    balance = balance + deposite;
                    System.out.println("Your amount accessfully added $ " + balance);
                } else {
                    System.out.println("Sorry we cant do it ");
                }

            } else if (choice == 3) {
                System.out.println("Welcome to Withdraw System");
                System.out.print("Enter Your Withdraw Amount : ");
                double withdraw = sc.nextDouble();
                if (withdraw > balance) {
                    System.out.println("Sorry Your Balance Not Sufficient : ");
                } else {
                    System.out.println("Amount Withdrawel Successfully : ");
                    balance = balance - withdraw;
                    System.out.println("Your Remaining Balance is : " + balance);
                }

            } else if (choice == 4) {
                System.out.println("Enter Your Old PIN : ");
                String oldpin = sc.next();
                if (oldpin.equals(pin)) {
                    System.out.println("Enter New PIN :");
                    String newpin = sc.next();
                    if (newpin.length() == 4 && newpin.matches("\\d+")) {
                        pin = newpin;
                        System.out.println("Your PIN Was Successfully Changed :");

                    } else {
                        System.out.println("Invalid PIN Format | Please Try Again :");
                    }

                }
            }

            else if (choice == 5) {
                System.out.println("Thank You For Using Our ATM : ");
                break;
            } else {
                System.out.println("Invalid Choice | Please Try Again :");
            }
        }

        sc.close();

    }
}
