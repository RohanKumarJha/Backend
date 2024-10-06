
class Mobile {
    String model;
    int price;
    static String type;

    public void show() {
        System.out.println(model+" : "+price+" : "+type);
    }
}

public class StaticVar {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.model = "Samsung";
        obj.price = 1500;
        // obj.type = "SmartPhone";
        // Mobile.type = "Phone";

        Mobile obj2 = new Mobile();
        obj2.model = "Apple";
        obj2.price = 1700;
        // obj2.type = "SmartPhone";
        // Mobile.type = "Phone";

        Mobile.type = "Phone";

        obj.show();
        obj2.show();
    }
}
