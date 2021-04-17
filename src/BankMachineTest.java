import static org.testng.Assert.*;

public class BankMachineTest {

    @org.testng.annotations.Test
    public void testPrintBalance() {
        PrintBalance mockPrintBalance = mock(BankMachine.class);
        when(mockPrintBalance.initialBalance()).thenReturn(100);
        assertEquals(100, mockPrintBalance.initialBalance());
    }
}

