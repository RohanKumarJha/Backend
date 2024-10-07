class Mobile {
    String model;
    int price;
    static String type;

    public static void show(Mobile obj) {
        System.out.println(obj.model+" : "+obj.price+" : "+type);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.model = "Samsung";
        obj.price = 1500;
        // obj.type = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.model = "Apple";
        obj2.price = 1700;
        // obj2.type = "SmartPhone";

        Mobile.type = "Phone";

        Mobile.show(obj);
        Mobile.show(obj2);
    }
}
