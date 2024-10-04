class Human {
    private String name;
    private int age;

    Human(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+" : "+age);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class ParaConstructor {
    public static void main(String[] args) {
        new Human("Rohan",26);
    }
}
