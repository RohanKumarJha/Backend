package tools;

public class Package {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.addition(10, 12)+" : "+obj.substraction(12, 7)+" : "+obj.multiplication(12, 4)+" : "+obj.division(20, 5));
    }
}