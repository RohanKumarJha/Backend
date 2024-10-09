public class Intern implements DataProvider {
    int marksSecured;
    int graceMarks;

    Intern(int marksSecured,int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    public void calcPercentage() {
        System.out.println("The total aggregate percentage secured is "+((float)(marksSecured+graceMarks)*100)/totalMaximumMarks);
    }
}
