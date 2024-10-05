class Phone {
    String model;
    int price;
    static String type;

    public void show() {
        System.out.println(model+" : "+price+" : "+type);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Phone obj = new Phone();
        obj.model = "Samsung";
        obj.price = 1700;
        // obj.type = "Phone";

        Phone obj2 = new Phone();
        obj2.model = "Apple";
        obj2.price = 1500;
        // obj2.type = "Phone";

        Phone.type = "SmartPhone";

        obj.show();
        obj2.show();
    }    
}