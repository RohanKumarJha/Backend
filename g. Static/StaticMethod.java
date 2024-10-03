class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand: "+brand+"; Price: "+price+"; Name: "+name);
    }
    public static void staticShow(Mobile obj) {
        System.out.println("Brand: "+obj.brand+"; Price: "+obj.price+"; Name: "+name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile.name = "SmartPhone";

        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1700;

        obj1.show();
        obj2.show();

        Mobile.staticShow(obj1);
    }
}
