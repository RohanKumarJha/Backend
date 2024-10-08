public class Tester {
    public static void main(String[] args) {
        PlayerRating obj = new PlayerRating(0, null);
        obj.playerPosition = 1;
        obj.playerName = "Beckham";
        obj.calculateAverageRating(9, 9.9);
        obj.display();

        PlayerRating obj2 = new PlayerRating(0, null);
        obj2.playerPosition = 1;
        obj2.playerName = "Oscar";
        obj2.calculateAverageRating(1, 1,1);
        obj2.display();
    }
}
