class Phone {
    String model;
    int price;
    static String type;

    static {
        type = "SmartPhone";
    }

    public static void show(Phone obj) {
        System.out.println(obj.model+" : "+obj.price+" : "+type);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.model = "Samsung";
        obj.price = 1700;

        Phone.show(obj);
    }
}
