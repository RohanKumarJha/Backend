abstract class Car {
    public abstract void drive();

    public void music() {
        System.out.println("Listen Music....");
    }
}

abstract class WagonR extends Car {
    public void drive() {
        System.out.println("You can drive also...");
    }
    public abstract void enjoy();
}

class Wagon extends WagonR {
    public void enjoy() {
        System.out.println("You can enjoy while driving");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Car obj = new Wagon();
        obj.music();
        obj.drive();
    }
}