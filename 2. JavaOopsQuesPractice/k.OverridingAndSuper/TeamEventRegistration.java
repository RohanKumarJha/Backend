public class TeamEventRegistration extends EventRegistration {
    private int noOfParticipants;
    private int teamNo;

    TeamEventRegistration(String name,String nameOfEvent,int noOfParticipants,int teamNo) {
        super(name, nameOfEvent);
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }
    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }
    public int getTeamNo() {
        return teamNo;
    }
    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerEvent() {
        if(getNameOfEvent() == "ShakeALeg") {
            setRegistrationFee(50);
        } else if(getNameOfEvent() == "Sing&Win") {
            setRegistrationFee(60);
        } else if(getNameOfEvent() == "Actathon") {
            setRegistrationFee(80);
        } else if(getNameOfEvent() == "PlayAway") {
            setRegistrationFee(100);
        } else setRegistrationFee(-1);
    }
}
