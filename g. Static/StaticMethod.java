class Mobile {
    String brand;
    int price;
    static String name;

    public static void show(Mobile obj) {
        System.out.println("Brand:"+obj.brand+"; Price:"+obj.price+"; Name:"+name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1700;

        Mobile.name = "SmartPhone";

        Mobile.show(obj1);
        Mobile.show(obj2);
    }
}
