public class Tester {
    public static void main(String[] args) {
        LocationChanger obj1 = new LocationChanger();
        obj1.setName("Annabelle Michael");
        obj1.welcomeEmployee();
        obj1.setLocation("BL003, Delhi, STP");
        obj1.checkCity();
        obj1.editAddress();

        LocationChanger obj2 = new LocationChanger();
        obj2.setName("Jissele James");
        obj2.welcomeEmployee();
        obj2.setLocation("FL091, Pune, SEZ");
        obj2.checkCity();
        obj2.editAddress();
    }
}
