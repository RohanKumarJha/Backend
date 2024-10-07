class OuterClass {
    String name;
    int price;

    public void show() {
        System.out.println("In a show");
    }
    class InnerClass {
        public void extract() {
            System.out.println("In extract class");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.show();
        obj.new InnerClass().extract();
        
    }
}