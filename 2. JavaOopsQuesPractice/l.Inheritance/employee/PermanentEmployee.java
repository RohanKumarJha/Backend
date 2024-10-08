package employee;

public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private int experience;

    public double getBasicPay() {
        return basicPay;
    }
    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }
    public double getHra() {
        return hra;
    }
    public void setHra(double hra) {
        this.hra = hra;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void calculateSalary() {
        if(experience < 3) {
            setSalary((getBasicPay()*0)/100+basicPay+hra);
        } else if(experience >= 3 && experience < 5) {
            setSalary((getBasicPay()*5)/100+basicPay+hra);
        } else if(experience >= 5 && experience < 10) {
            setSalary((getBasicPay()*7)/100+basicPay+hra);
        } else if(experience >= 10) {
            setSalary((getBasicPay()*12)/100+basicPay+hra);
        } 
    }
}
