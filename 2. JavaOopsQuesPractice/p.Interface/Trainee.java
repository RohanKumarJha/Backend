public class Trainee implements DataProvider {
    int marksSecured;

    Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    public void calcPercentage() {
        System.out.println("The total aggregate percentage secured is "+((float)(marksSecured)*100)/totalMaximumMarks);
    }
}
