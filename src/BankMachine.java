import java.util.Scanner;

public class BankMachine {

    public static Scanner scanner = new Scanner(System.in);

    public static int options() {
        int choice;
        do {
            System.out.print("Please Choose an Option:");
            System.out.print("1. Print Balance");
            System.out.print("2. Deposit Money");
            System.out.print("3. Withdraw Money");

            choice = scanner.nextInt();

            if (choice < 1 || choice > 3){
                System.out.println("error");
            }

        }
        while (choice < 1 || choice > 4);

        return choice;
    }

    public static void printBalance(double initialBalance) {
        System.out.println("Your Current Balance is " + initialBalance );
    }

    public static double deposit(double initialBalance, double depositTotal) {
        double depositAmt = depositTotal, currentBal = initialBalance;
        double newBalance = depositAmt + currentBal;

        System.out.println("Your new balance is " + newBalance);

        return newBalance;
    }

    public static double withdraw(double initialBalance, double withdrawTotal) {
        double withdrawAmt = withdrawTotal, currentBal = initialBalance, newBalance;

        newBalance = currentBal - withdrawAmt;
        System.out.println("Your New Balance is " + newBalance);

        return newBalance;
    }
}
