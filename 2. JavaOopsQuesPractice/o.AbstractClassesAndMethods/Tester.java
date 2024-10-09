public class Tester {
    public static void main(String[] args) {
        // ShoppingPayment obj1 = new ShoppingPayment(10000.23,5001);
        // obj1.setBalance(10000.23);
        // obj1.payBill(5000.0);

        // ShoppingPayment obj2 = new ShoppingPayment(5000.0,5001);
        // obj2.setBalance(5000.0);
        // obj2.payBill(5000.0);

        CreditCardPayment obj3 = new CreditCardPayment(10000.23,5001);
        obj3.setBalance(5000.0);
        obj3.payBill(10000.0);

        CreditCardPayment obj4 = new CreditCardPayment(10000.23,5001);
        obj4.setBalance(1000.23);
        obj4.payBill(0.0);
    }
}
