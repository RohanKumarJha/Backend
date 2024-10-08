public class SingleEventRegistration extends EventRegistration {
    private int participantNo;

    SingleEventRegistration(String name,String nameOfEvent) {
        super(name, nameOfEvent);
    }

    public int getParticipantNo() {
        return participantNo;
    }
    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public void registerEvent() {
        if(getNameOfEvent() == "ShakeALeg") {
            setRegistrationFee(100);
        } else if(getNameOfEvent() == "Sing&Win") {
            setRegistrationFee(150);
        } else if(getNameOfEvent() == "PlayAway") {
            setRegistrationFee(130);
        } else setRegistrationFee(-1);
    }
}
