class Mobile {
    String brand;
    int price;
    static String name;

    static {
        name = "SmartPhone";
    }

    public void show() {
        System.out.println("Brand: "+brand+"; Price: "+price+"; Name: "+name);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1700;

        obj1.show();
        obj2.show();
    }
}
