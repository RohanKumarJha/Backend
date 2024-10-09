public class ShoppingPayment extends RRPaymentServices {
    static int counter=1000;
    private String paymentId;

    ShoppingPayment(double balance,int customerId) {
        super(balance, customerId);
    }

    public String getPaymentId() {
        paymentId = 'S'+Integer.toString(counter);
        return paymentId;
    }
    public void payBill(double amount) {
        if(amount > getBalance()) {
            System.out.println("Excess amount entered!! Please try again.");
        } else if((amount == getBalance())) {
            System.out.println("Congratulations!! Your payment of Rs."+amount+" is successful with payment id S1001.");
        } else {
            ++counter;
            System.out.println("Congratulations!! You have successfully made a payment of Rs. "+amount+" Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : "+super.getCustomerId());
            System.out.println("Payment ID : "+getPaymentId());
            System.out.println("Previous Due : "+getBalance());
            System.out.println("Remaining Due : "+(getBalance()-amount));
        }
    }
}
