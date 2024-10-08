public class Tester {
    public static void main(String[] args) {
        User obj = new User(0, null, null, 0);
        obj.setId(101);
        obj.setUserName("Joe");
        obj.setEmailId("joe@abc.com");
        obj.setWalletBalance(100);
        int billAmount = 70;
        if(obj.makePayment(billAmount)) {
            System.out.println("Congratulations "+obj.getUserName()+", payment of $"+billAmount+" was successful! Your wallet balance is $"+obj.getWalletBalance());
        } else {
            System.out.println("Your account having insufficient Balance, please recharge first......");
        }

        PremiumUser obj2 = new PremiumUser(0, null, null, 0);
        obj2.setId(101);
        obj2.setUserName("Joe");
        obj2.setEmailId("joe@abc.com");
        obj2.setWalletBalance(100);
        int PrebillAmount = 70;
        if(obj2.makePayment(billAmount)) {
            System.out.println("Congratulations "+obj.getUserName()+", payment of $"+PrebillAmount+" was successful! Your wallet balance is $"+obj.getWalletBalance());
            System.out.println("You have "+PrebillAmount*0.1+" points!");
        } else {
            System.out.println("Your account having insufficient Balance, please recharge first......");
        }
    }
}
