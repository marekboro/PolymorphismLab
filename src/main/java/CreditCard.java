public class CreditCard extends Card implements IScan{

    public CreditCard(String cartNumber, String expiryDate, int securityNumber) {
        super(cartNumber,expiryDate,securityNumber);
    }

    public String scan() {
        return "Payment Successful";
    }

}
