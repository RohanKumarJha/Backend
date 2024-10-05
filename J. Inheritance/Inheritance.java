class Grandparent {
    String name;
    int age;
}
class Parent extends Grandparent {
    public void show() {
        System.out.println(name+" : "+age);
    }
}
class Child extends Parent {

}

public class Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.name = "Rohan";
        obj.age = 26;
        obj.show();
    }
}
