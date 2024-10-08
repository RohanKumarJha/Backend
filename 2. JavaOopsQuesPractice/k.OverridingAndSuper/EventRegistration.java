public class EventRegistration {
    private String name;
    private String nameOfEvent;
    private double registrationFee;

    EventRegistration(String name,String nameOfEvent) {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNameOfEvent() {
        return nameOfEvent;
    }
    public void setNameOfEvent(String nameOfEvent) {
        this.nameOfEvent = nameOfEvent;
    }
    public double getRegistrationFee() {
        return registrationFee;
    }
    public void setRegistrationFee(double registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void registerEvent() {
        if(nameOfEvent == "ShakeALeg") {
            registrationFee = 100;
        } else if(nameOfEvent == "Sing&Win") {
            registrationFee = 150;
        } else if(nameOfEvent == "Actathon") {
            registrationFee = 70;
        } else if(nameOfEvent == "PlayAway") {
            registrationFee = 130;
        }
    }
}