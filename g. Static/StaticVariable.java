class Mobile {
    String brand;
    int price;
    // String name;
    static String name;

    public void show() {
        System.out.println("Brand: "+brand+"; Price: "+price+"; Name: "+name);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // // obj1.name = "SmartPhone";
        // Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // // obj2.name = "SmartPhone";
        // Mobile.name = "SmartPhone";

        // // obj1.name = "Phone";
        // Mobile.name = "Phone";

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
    }
}