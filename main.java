import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bill : ");
        double bill = sc.nextDouble();

        if (bill > 5000) {
            double discount = bill * 0.15;
            double total = bill - discount;
            System.out.print("Your bill is " + bill + " before discount but after discount $ " + total);

        }

        else {
            System.out.println("Here is your bill $ " + bill);
        }
    }
}