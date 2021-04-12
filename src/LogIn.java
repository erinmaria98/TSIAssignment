import java.util.List;
import java.util.Scanner;

public class LogIn extends BankMachine {

    private Scanner userInput = new Scanner(System.in);

    private String input(String message) {
        System.out.println(message);
        return userInput.nextLine();
    }

    private String getPin(String cardNumber){
        AllCustomers allCustomers = new AllCustomers();
        String pinNumber = "";
        List<Customer> listOfCustomers = allCustomers.getListOfCustomers();
        for (Customer customer :listOfCustomers){
            if (customer.getCardNumber().equals(cardNumber)){
                pinNumber = customer.getPin();
            }
        }
        return pinNumber;
    }

    private void logIn() {
        String cardNumber = input("Enter your card number");
        String pinNumber = getPin(cardNumber);
        if (pinNumber == "") {
            System.out.println("You are not an account holder");
        }
        else if (pinNumber.equals(input("Enter your PIN"))){
            System.out.println("Welcome to your account");
        }
        else {
            System.out.println("Wrong PIN, sorry");
        }
    }

    public static void main(String[] args){
        LogIn logIn = new LogIn();
        logIn.logIn();
    }
}
