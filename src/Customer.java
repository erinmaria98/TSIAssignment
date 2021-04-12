public class Customer {

    private String firstName;
    private String lastName;
    private String cardNumber;
    private String pinNumber;
    final public static String dataSourceName = "customer";


    public Customer(String firstName, String lastName, String cardNumber, String pinNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pinNumber = pinNumber;
        this.cardNumber = cardNumber;

    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getCardNumber(){
        return this.cardNumber;
    }

    public String getPinNumber(){
        return this.pinNumber;
    }


    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    public String getPin() {
        return this.pinNumber;
    }
}