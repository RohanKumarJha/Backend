
public class LocationChanger {
    private String location;
    private String name;

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void checkCity() {
        String[] arr = getLocation().split(", ");
        String city = arr[1];
        switch(city) {
            case "Delhi" : 
                System.out.println("Welcome to Infy Mysore Delhites!");
                break;
            case "Trivandrum" :
                System.out.println("Welcome to MyDC people of Trinfy!");
                break;
            case "Bhubaneshwar" : 
                System.out.println("You came a long way down South! We welcome you!");
                break;
            default : 
                System.out.println("Oops your city name is not listed!");
        }

    }

    public void editAddress() {
        String[] arr = getLocation().split(", ");
        String add = arr[2];
        switch(add) {
            case "SEZ" :
                System.out.println("Your location remains the same!");
                break;
            default :
                System.out.println("Your location has been changed from STP to SEZ.");
        }
    }

    public void welcomeEmployee() {
        String[] arr = getName().split(" ");
        System.out.println("Hello "+arr[0]);
    }
}