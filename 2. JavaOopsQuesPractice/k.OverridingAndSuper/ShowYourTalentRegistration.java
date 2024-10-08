public class ShowYourTalentRegistration{
    public static void main(String[] args){

       SingleEventRegistration obj1 = new SingleEventRegistration("Jenny", "Sing&Win");
       obj1.setName("Hudson");
       obj1.setNameOfEvent("Sing&Win");
       obj1.setParticipantNo(2);
       obj1.registerEvent();
       if(obj1.getRegistrationFee() == -1) {
        System.out.println("Please choose a valid event");
       } else {
        System.out.println("Thank You "+obj1.getName()+" for your participation.Your registration fee is: "+obj1.getRegistrationFee());
        System.out.println("You are participant no: "+obj1.getParticipantNo());
       }

       TeamEventRegistration obj2 = new TeamEventRegistration("Jenny", "Sing&Win", 5, 1);
       obj2.setName("Jenny");
       obj2.setNameOfEvent("Sing&Win");
       obj2.setNoOfParticipants(5);
       obj2.setTeamNo(1);
       obj2.registerEvent();
       if(obj2.getRegistrationFee() == -1) {
        System.out.println("Please choose a valid event");
       } else {
        System.out.println("Thank You "+obj2.getName()+" for your participation.Your registration fee is: "+obj2.getRegistrationFee()*obj2.getNoOfParticipants());
        System.out.println("Your team Number is : "+obj2.getTeamNo());
       }
     }
 }
 
