class Human {
    private String name;
    private int age;
    
    Human() {

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}