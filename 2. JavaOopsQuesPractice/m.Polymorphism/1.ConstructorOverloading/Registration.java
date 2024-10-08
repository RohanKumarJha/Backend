public class Registration {
    private String customerName;
    private String panCardNo;
    private int voterId;
    private String passportNo;
    private int licensenNo;
    private long[] telephoneNo;

    Registration(String customerName,String passportNo,long[] telephoneNo) {
        this.customerName = customerName;
        this.passportNo = passportNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations "+customerName+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("Passport number: "+passportNo);
        System.out.println("Phone numbers: "+telephoneNo[0]);
        System.out.println(telephoneNo[1]);
    }
    Registration(String customerName,int licensenNo,String panCardNo,long[] telephoneNo) {
        this.customerName = customerName;
        this.licensenNo = licensenNo;
        this.panCardNo = panCardNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations "+customerName+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("License number: "+licensenNo);
        System.out.println("Pan card number: "+panCardNo);
        System.out.println("Phone numbers: "+telephoneNo[0]);
        System.out.println(telephoneNo[1]);
    }
    Registration(String customerName,int voterId,int licensenNo,long[] telephoneNo) {
        this.customerName = customerName;
        this.voterId = voterId;
        this.licensenNo = licensenNo;
        this.telephoneNo = telephoneNo;
        System.out.println("Congratulations "+customerName+"!!! you have been successfully registered for our services with the following details:");
        System.out.println("Voter Id: "+voterId);
        System.out.println("License number: "+licensenNo);
        System.out.println("Phone numbers: "+telephoneNo[0]);
        System.out.println(telephoneNo[1]);
    }

    public String getCustomerName() {
        return customerName;
    }
    public String getPanCardNo() {
        return panCardNo;
    }
    public int getVoterId() {
        return voterId;
    }
    public String getPassportNo() {
        return passportNo;
    }
    public int getLicensenNo() {
        return licensenNo;
    }
    public long[] getTelephoneNo() {
        return telephoneNo;
    }
}