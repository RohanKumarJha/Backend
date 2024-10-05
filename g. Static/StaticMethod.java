class Phone {
    String model;
    int price;
    static String type;

    public static void show(Phone obj) {
        System.out.println(obj.model+" : "+obj.price+" : "+type);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.model = "Samsung";
        obj.price = 1700;

        Phone obj2 = new Phone();
        obj2.model = "Apple";
        obj2.price = 1500;

        Phone.type = "SmartPhone";

        Phone.show(obj);
        Phone.show(obj2);
    }
}
