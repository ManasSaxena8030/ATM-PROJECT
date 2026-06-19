import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Your Username :");

        // String Username = sc.next();

        // if (Character.isUpperCase(Username.charAt(0)) &&
        // Character.isDigit(Username.charAt(Username.length() - 1))) {
        // System.out.println("Valid Username");
        // } else {
        // System.out.println("Invalid Username");
        // }

        // Compare 2 sentences

        // System.out.println("Enter your sentences 1 : ");
        // String Username1 = sc.next();

        // System.out.println("Enter you sentences 2 : ");
        // String Username2 = sc.next();

        // if (Username1.equalsIgnoreCase(Username2)) {
        // System.out.println("They are equal");
        // } else {
        // System.out.println("forever Equal ");
        // }

        // Lucky Number game

        // System.out.println("Enter the numbers :");
        // int num = sc.nextInt();
        // if (num % 3 == 0 || num % 5 == 0) {
        // System.out.print("lucky number ");
        // } else {
        // System.out.println("Not lucky you can try again");
        // }

        // System.out.println("Enter a word ");
        // String word = sc.next();
        // String reversed = new StringBuilder(word).reverse().toString();
        // System.out.println(reversed);

        // check email domain in email are last part of added @gmail.com or not

        // System.out.println("Enter the email : ");
        // String email = sc.next();

        // if (email.endsWith("@gmail.com")) {
        // System.out.println("Valid Eamil");
        // } else {
        // System.out.println("Not Valid Email");
        // }

        // System.out.println("Enter the Password :");
        // String pass = sc.next();

        // boolean hasuppercase = false, hasdigit = false, hasspeacial = false;
        // for (int i = 0; i < pass.length(); i++) {
        // char c = pass.charAt(i);
        // if (Character.isUpperCase(c)) {
        // hasuppercase = true;
        // }
        // if (Character.isDigit(c)) {
        // hasdigit = true;
        // }
        // if ("@#$%^&*".contains(String.valueOf(c))) {
        // hasspeacial = true;
        // }
        // }
        // if (pass.length() >= 8 && hasdigit == true && hasspeacial == true &&
        // hasuppercase == true) {
        // System.out.println("Strong Password 👍");
        // } else {
        // System.out.println("Weak pass");
        // }

        // Electricity bill
        // System.out.println("Enter your units :");
        // double units = sc.nextDouble();
        // if (units < 100) {
        // System.out.println("Your bill is RS" + (units * 10));
        // } else if (units > 100 && units < 200) {
        // System.out.println("Your bill is RS" + (units * 15));

        // } else if (units > 200) {
        // double bill = (units * 20);
        // if (bill > 3000) {
        // double tax = bill * 10;
        // double total = bill + tax;
        // System.out.println("Your bill is RS " + bill + " But after tax " + total);
        // } else {
        // System.out.println("Your bill is RS " + bill);
        // }
        // }

        // Palindrom Words

        // System.out.println("Enter the number :");
        // int number = sc.nextInt();
        // int original = number;
        // int sum = 0;
        // while (number > 0) {
        // int remainder = number % 10;
        // sum = (sum * 10) + remainder;
        // number = number / 10;
        // }
        // if (sum == original) {
        // System.out.println("True");
        // } else {
        // System.out.println("False");
        // }

        // Count a vowels

        // System.out.println("enter the words :");
        // String a = sc.nextLine().toLowerCase();

        // int count = 0;
        // for (int i = 0; i < a.length(); i++) {
        // char b = a.charAt(i);
        // if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
        // count++;
        // }
        // }
        // System.out.println("count : " + count);

        // OR

        // int total = a.length() - a.replaceAll("[aeiou]", "").length();
        // System.out.println("count " + total);

        // detect repeated character

        System.out.println("Enter your setences : ");

        String sentence = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (sentence.indexOf(c) != sentence.lastIndexOf(c)) {
                System.out.println("repeated ");
                found = true;
                break;
            }
            if (found == false) {
                System.out.println("no repeating");
            }
        }
    }
}
