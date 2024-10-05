class Mobile {
    private String model;
    private int price;
    private String type;

    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getModel() {
        return model;
    }
    public int getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        obj.setModel("Samsung");
        obj.setPrice(1700);
        obj.setType("SmartPhone");
        System.out.println(obj.getModel()+" : "+obj.getPrice()+" : "+obj.getType());

        Mobile obj2 = new Mobile();
        obj2.setModel("Apple");
        obj2.setPrice(2000);
        obj2.setType("SmartPhone");
        System.out.println(obj2.getModel()+" : "+obj2.getPrice()+" : "+obj2.getType());
    }
}