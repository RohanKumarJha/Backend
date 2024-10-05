class Mobile {
    private String name;
    private int price;

    Mobile() {
        name = "Samsung";
        price = 1700;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        System.out.println(obj.getName()+" : "+obj.getPrice());
        obj.setName("Apple");
        obj.setPrice(2000);
        System.out.println(obj.getName()+" : "+obj.getPrice());
    } 
}