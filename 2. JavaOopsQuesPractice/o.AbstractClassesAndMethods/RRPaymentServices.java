abstract public class RRPaymentServices {
      private double balance;
      private int customerId=5001;

      RRPaymentServices(double balance,int customerId) {
        this.balance = balance;
        this.customerId = customerId;
      }

      public double getBalance() {
        return balance;
      }
      public void setBalance(double balance) {
        this.balance = balance;
      }
      public int getCustomerId() {
        return customerId;
      }

      public abstract void payBill(double balance);
}