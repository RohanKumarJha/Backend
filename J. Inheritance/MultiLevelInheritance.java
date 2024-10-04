class GrandParent {
    public void youShow() {
        System.out.println("Show your OfficeWork first");
    }
}

class Parent extends GrandParent {
    public void show() {
        System.out.println("Show your homework child");
    }
}

class Child extends Parent {

}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.youShow();
        obj.show();
    }
}
