enum Status {
    Running, Failed, Success, Pending;
}
public class Enum {
    public static void main(String[] args) {
        // Status s1 = Status.Running;
        // System.out.println(s1);
        // System.out.println(s1.ordinal());

        // Status[] s2 = Status.values();
        // for(Status ss : s2) {
        //     System.out.println(ss);
        // }

        // Status s3 = Status.Success;
        // if(s3 == Status.Running) {
        //     System.out.println("All Good");
        // } else if(s3 == Status.Failed) {
        //     System.out.println("Oh shit!!!");
        // } else if(s3 == Status.Success) {
        //     System.out.println("Hurrah, we did it");
        // } else {
        //     System.out.println("Ohh!!! God");
        // }

        Status s4 = Status.Success;

        switch(s4) {
            case Running : {
                System.out.println("All Good");
                break;
            }
            case Failed : {
                System.out.println("Oh shit!!!");
                break;
            }
            case Success : {
                System.out.println("Hurrah, we did it");
                break;
            }
            case Pending : {
                System.out.println("Ohh!!! God");
                break;
            }
            default : {
                System.out.println("Wrong Choice");
            }
        }
    }
}