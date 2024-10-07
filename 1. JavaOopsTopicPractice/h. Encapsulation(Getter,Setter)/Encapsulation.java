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
        obj.setModel("Apple");
        obj.setPrice(1700);
        obj.setType("SmartPhone");
        System.out.println(obj.getModel()+" : "+obj.getPrice()+" : "+obj.getType());
    }
}