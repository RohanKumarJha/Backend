import tools.Calc;

public class Package {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.addition(12, 6)+" : "+obj.substraction(15, 5)+" : "+obj.multiplication(12,6)+" : "+obj.division(16, 4));
    }
}