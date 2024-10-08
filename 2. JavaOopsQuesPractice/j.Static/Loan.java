public class Loan {
    private static int loanCounter;
    private int loanNo;
    private int accountNo;
    private int customerNo;
    private float loanAmount;
    private int loanDuration;
    private float interest;

    Loan() {
        loanCounter++;
    }

    static int getLoanCounter() {
        return loanCounter;
    }
    private int getLoanNo() {
        return loanNo;
    }
    private void setLoanNo() {
        this.loanNo = loanNo;
    }
    private int getAccountNo() {
        return accountNo;
    }
    private void setAccountNo() {
        this.accountNo = accountNo;
    }
    private int getCustomerNo() {
        return customerNo;
    }
    private void setCustomerNo() {
        this.customerNo = customerNo;
    }
    private float getLoanAmount() {
        return loanAmount;
    }
    private void setLoanAmount() {
        this.loanAmount = loanAmount;
    }
    private int getLoanDuration() {
        return loanDuration;
    }
    private void setLoanDuration() {
        this.loanDuration = loanDuration;
    }
    private float getInterest() {
        return interest;
    }
    private void setInterest() {
        this.interest = interest;
    }

    Loan(int accountNo,int customerNo,int loanAmount,float loanDuration) {
        loanCounter++;
    }
}