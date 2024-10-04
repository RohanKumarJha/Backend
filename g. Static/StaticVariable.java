class Mobile {
    String brand;
    int price;
    static String name;

    public void show() {
        System.out.println("Brand:"+brand+"; Price:"+price+"; Name:"+name);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile.name = "Phone";
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;
        // Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1700;
        // Mobile.name = "SmartPhone";

        // obj1.name = "Phone";
        // obj2.name = "Phone";

        // Mobile.name = "phone";

        obj1.show();
        obj2.show();
    }
}