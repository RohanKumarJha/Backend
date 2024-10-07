class Calculator {
    public void add(int n1,int n2) {
        System.out.println(n1+n2);
    }
    public void add(int n1,int n2,int n3) {
        System.out.println(n1+n2+n3);
    }
    public void add(double n1,double n2) {
        System.out.println(n1+n2);
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(2,3);
        calc.add(3, 5, 7);
        calc.add(4.0, 6.2);
    }
}