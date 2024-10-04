class Parent {
    public void phone() {
        System.out.println("I've Samsung phone.");
    }
}

class Child extends Parent {
    public void phone() {
        System.out.println("I've having Apple phone.");
    }
}

public class Overide {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.phone();
    }
}