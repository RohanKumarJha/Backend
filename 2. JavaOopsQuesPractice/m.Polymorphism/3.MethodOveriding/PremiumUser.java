public class PremiumUser extends User{
    private int rewardPoints;

    PremiumUser(int id,String userName,String emailId,double walletBalance) {
        super(id, userName, emailId, walletBalance);
    }

    public boolean makePayment(double billAmount) {
        return true;
    }
    public int getRewardPoint() {
        return rewardPoints;
    }
    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
