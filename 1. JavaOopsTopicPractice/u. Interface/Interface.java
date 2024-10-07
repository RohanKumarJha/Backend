interface Computer {
    void code();
}
class Desktop implements Computer {
    public void code() {
        System.out.println("I'll code in Computer.");
    }
}
class Laptop implements Computer {
    public void code() {
        System.out.println("I'll code in Laptop.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Computer obj1 = new Desktop();
        obj1.code();

        Computer obj2 = new Laptop();
        obj2.code();
    }  
}