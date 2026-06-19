import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Salary :");

        double salary = sc.nextDouble();

        if (salary > 10000) {
            double tax = salary * 0.10;
            double total = salary - tax;
            System.out.print("Your Salary Is before Tax " + salary + "But after tax your salary is : " + total);
        } else if (salary > 5000 && salary < 10000) {
            double tax = salary * 0.05;
            double total = salary - tax;
            System.out.print("Your Salary Is before Tax " + salary + "But after tax your salary is : " + total);
        } else {
            System.out.print("Your Salary : " + salary);
        }
    }
}
