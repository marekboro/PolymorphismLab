import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    private Wallet wallet;
    private CreditCard creditCard;
    private DebitCard debitCard;
    private LoyaltyCard loyaltyCard;
    private Ticket ticket;

    @Before()
    public void before(){
        wallet = new Wallet("Isa's Wallet");
        creditCard = new CreditCard("1111222233334444", "12/23", 234);
        debitCard = new DebitCard("1111222233334444", 909090, 12345678, "12/23", 234);
        loyaltyCard = new LoyaltyCard("123456787890", "Harrid's Stores");
        ticket = new Ticket("AB12345", "QWERTY123456", "26/01/2020");
    }

    @Test
    public void canGetWalletName() {
        assertEquals("Isa's Wallet", wallet.getName());
    }

    @Test
    public void walletStartsEmpty() {
        assertEquals(0, wallet.getNumberOfItems());
    }


    @Test
    public void canAddCreditCardToWallet() {
        wallet.addItem((IScan)creditCard);
//        assertEquals(1, wallet.getNumberOfItems());
        assertEquals(1, wallet.getNumberOfItems());
    }

    @Test
    public void canAddDebitCardToWallet() {
        wallet.addItem((IScan)debitCard);
        assertEquals(1, wallet.getNumberOfItems());
    }

    @Test
    public void canAddLoyaltyCardToWallet() {
        wallet.addItem((IScan)loyaltyCard);
        assertEquals(1, wallet.getNumberOfItems());
    }

    @Test
    public void canAddTicketCardToWallet() {
        wallet.addItem((IScan)ticket);
        assertEquals(1, wallet.getNumberOfItems());
    }

    @Test
    public void canAddEverythingToWallet() {
        wallet.addItem((IScan)creditCard);
        wallet.addItem((IScan)debitCard);
        wallet.addItem((IScan)loyaltyCard);
        wallet.addItem((IScan)ticket);
        assertEquals(4, wallet.getNumberOfItems());
    }
}
