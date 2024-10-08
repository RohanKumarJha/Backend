public class PlayerRating {
    int playerPosition;
    String playerName;
    double criticOneRating;
    double criticTwoRating;
    double criticThreeRating;
    double averageRating;
    char category;

    PlayerRating(int playerPosition,String playerName) {

    }

    public void calculateAverageRating(double criticOneRating,double criticTwoRating) {
        averageRating = (criticOneRating+criticTwoRating)/2;
    }
    public void calculateAverageRating(double criticOneRating,double criticTwoRating,double criticThreeRating) {
        averageRating = (criticOneRating+criticTwoRating+criticThreeRating)/3;
    }
    public void calculateCategory() {
        if(averageRating > 8) {
            category = 'A';
        } else if((averageRating < 8) && (averageRating >= 5)) {
            category = 'B';
        } else if((averageRating < 5) && (averageRating >= 0)) {
            category = 'C';
        }
    }
    public void display() {
        System.out.println("The player name is "+playerName);
        System.out.println("The player position is "+playerPosition);
        System.out.println("The average rating is "+averageRating);
        System.out.println("The category is "+category);
    }
}