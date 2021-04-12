import java.util.List;
import java.util.ArrayList;

public class CustomerStub extends Customer {

    public CustomerStub(String firstName, String lastName, String cardNumber, String pinNumber) {
        super(firstName, lastName, cardNumber, pinNumber);
    }

    @Override
    public List<String> getFileData(String fileName) {
        List<String> stubData = new ArrayList<String>();
        stubData.add("Derek,Somerville");
        stubData.add("Matt,Barr");
        return stubData;
    }

    @Override
    public List<String> getLastLines(String fileName, int numberOfLines) {
        return null;
    }

}
