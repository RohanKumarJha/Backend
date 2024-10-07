public class Tester {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate();
        System.out.println(chocolate1.getBarCode()+" : "+chocolate1.getName()+" : "+chocolate1.getWeight()+" : "+chocolate1.getCost());

        Chocolate chocolate2 = new Chocolate();
        chocolate2.setBarCode(102);
        chocolate2.setName("Hershey's");
        chocolate2.setWeight(24);
        chocolate2.setCost(50);
        System.out.println(chocolate2.getBarCode()+" : "+chocolate2.getName()+" : "+chocolate2.getWeight()+" : "+chocolate2.getCost());
    }
}
