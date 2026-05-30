import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter USD amount: ");
            double usd = sc.nextDouble();

            double inr = usd * 85;

            System.out.println("INR = " + inr);
        }

        else if (choice == 2) {
            System.out.print("Enter INR amount: ");
            double inr = sc.nextDouble();

            double usd = inr / 85;

            System.out.println("USD = " + usd);
        }

        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}