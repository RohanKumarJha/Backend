class B {
    public void showYourValueOfDesignToo() {
        System.out.println("Show the value.");
    }
}

class A extends B{
    public void showYourValueOfDesignsToo() {
        System.out.println("Show the value of A.");
    }
}

public class Annotations {
    public static void main(String[] args) {
        A obj = new A();
        obj.showYourValueOfDesignToo();
    }
}