import java.util.Scanner;
class User{
    private String name;
    private long phoneNumber;

    public void setName(String n){
        name=n;
    }
    public void setPhoneNumber(int pn){
        phoneNumber = pn;
    }
    public String getName(){
        return name;
    }
    public long getPhoneNumber(){
        return phoneNumber;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+phoneNumber);
    }
}
class Driver extends User{
    String vehicleType;
    String licenceNumber;

    public Driver(String vehicleType,String licenceNumber){
        this.vehicleType=vehicleType;
        this.licenceNumber=licenceNumber;
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle: "+vehicleType);
        System.out.println("Licence: "+licenceNumber);
    }
}

class Passenger extends User {
    Scanner sc = new Scanner(System.in);
    String pickUpLocation;
    String dropLocation;
    int travelDistance;

    public Passenger(String pickUpLocation, String dropLocation, int travelDistance) {
        this.pickUpLocation = pickUpLocation;
        this.dropLocation = dropLocation;
        this.travelDistance = travelDistance;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Pickup: " + pickUpLocation);
        System.out.println("Drop: " + dropLocation);
        System.out.println("Travel Distance per $10/km: " + travelDistance);
    }

    public void calculateFare(){
        System.out.println("Price: "+travelDistance*10);
    }
}
public class RideSharingSystem {
    public static void main(String[] args) {
        System.out.println("----Driver Info----");
        User driver1 = new Driver("Car","WB40Y7355");
        driver1.setName("xyz");
        driver1.setPhoneNumber(74774113);
        driver1.displayInfo();
        System.out.println("----User Info");
        User passenger1= new Passenger("Durgapur","Panagarh",15);
        passenger1.setName("abc");
        passenger1.setPhoneNumber(990725937);
        passenger1.displayInfo();
        ((Passenger) passenger1).calculateFare();


    }


}
