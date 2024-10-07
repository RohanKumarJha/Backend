class GrandParent {
    String name="Dada Ji";
    int age=70;
}

class Parent extends GrandParent {
    public void show() {
        System.out.println(name+" : "+age);
    }
}

class Child extends Parent {

}

public class Inheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    } 
}