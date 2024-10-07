class Parent {
    public void show() {
        System.out.println("I've Samsung phone,but it's my Dad phone.");
    }
}
class Child extends Parent {
    public void show() {
        System.out.println("I've Apple phone,now it's mine.");
    }
}
public class Override {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }    
}