class AdvCalc extends Calc {
    public int mult(int a,int b) {
        return a*b;
    }
    public int div(int a,int b) {
        return a/b;
    }
}

class Calc {
    public int add(int a,int b) {
        return a+b;
    }
    public int sub(int a,int b) {
        return a-b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        System.out.println(obj.add(20, 5));
        System.out.println(obj.sub(20, 5));
    }
}