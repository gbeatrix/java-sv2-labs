package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {
    Payable payable;

    @Test
    void testAmount(){
        payable = new Amount();

        assertEquals(12999, payable.getPayableAmount(12999));
    }

    @Test
    void testCash(){
        payable = new Cash();

        assertEquals(12345, payable.getPayableAmount(12345));
        assertEquals(12345, payable.getPayableAmount(12346));
        assertEquals(12345, payable.getPayableAmount(12347));
        assertEquals(12350, payable.getPayableAmount(12348));
        assertEquals(12350, payable.getPayableAmount(12349));
        assertEquals(12350, payable.getPayableAmount(12350));
        assertEquals(12350, payable.getPayableAmount(12351));
        assertEquals(12350, payable.getPayableAmount(12352));
        assertEquals(12355, payable.getPayableAmount(12353));
        assertEquals(12355, payable.getPayableAmount(12354));
    }

    @Test
    void testBankAtm(){
        payable = new BankAtm();

        assertEquals(13000, payable.getPayableAmount(12999));
        assertEquals(13000, payable.getPayableAmount(13000));
        assertEquals(14000, payable.getPayableAmount(13001));
    }
}