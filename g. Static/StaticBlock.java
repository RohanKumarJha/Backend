class Mobile {
    String brand;
    int price;
    static String name;
    
    static {
        name = "SmartPhone";
    }

    public void show() {
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.brand = "Apple";
        obj.price = 1700;

        obj.show();

    }
}
