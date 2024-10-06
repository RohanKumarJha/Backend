class Mobile {
    String model;
    int price;

    Mobile() {
        model = "Apple";
        price = 1500;
    }

    Mobile(String model,int price) {
        this.model = model;
        this.price = price;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Mobile obj = new Mobile();
        System.out.println(obj.model+" : "+obj.price);

        Mobile obj2 = new Mobile("Samsung",1700);
        System.out.println(obj2.model+" : "+obj2.price);
    }
}