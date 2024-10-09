public class CreditCardPayment extends RRPaymentServices {
    static int counter=1000;
    private String paymentId;
    private double cashback;
    private double balanceDue;

    CreditCardPayment(double balance, int customerId) {
        super(balance, customerId);
    }

    public String getPaymentId() {
        paymentId = 'C'+Integer.toString(counter++);
        return paymentId;
    }
    public double getCashback() {
        return cashback;
    }
    public double balanceDue() {
        return balanceDue;
    }

    public void payBill(double amount) {
        ++counter;
        if(amount > getBalance()) {
            System.out.println("Congratulations!! You have successfully made a payment of Rs. "+amount+" Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : "+getCustomerId());
            System.out.println("Payment ID : "+getPaymentId());
            System.out.println("Previous Due : "+getBalance());
            System.out.println("Cashback wallet Balance : Rs"+(amount-getBalance()));
        } else {
            System.out.println("Congratulations!! You have successfully made a payment of Rs. "+amount+" Payment details are:");
            System.out.println("**********************************************************************************");
            System.out.println("Customer ID : "+getCustomerId());
            System.out.println("Payment ID : "+getPaymentId());
            System.out.println("Previous Due : "+getBalance());
            System.out.println("Remaining Due : "+(getBalance()-amount));
        }
    }
}
