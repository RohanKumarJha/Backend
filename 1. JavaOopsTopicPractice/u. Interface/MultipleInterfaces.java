interface A {
    void show();
    void dance();
}
interface B {
    void view();
}
class Entertain implements A,B{
    public void show() {
        System.out.println("You can show...");
    }
    public void dance() {
        System.out.println("You can dance...");
    }
    public void view() {
        System.out.println("You can view...");
    }
}

public class MultipleInterfaces {
    public static void main(String[] args) {
        Entertain obj = new Entertain();
        obj.show();
        obj.dance();
        obj.view();
    }
}
