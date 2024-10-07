class Calculator {
    public int add(int n1,int n2) {
        return n1+n2;
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(23, 67);
        System.out.println(result);
    }
}