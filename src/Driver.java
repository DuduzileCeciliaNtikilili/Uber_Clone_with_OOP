public class Driver extends Person {

    // Fields:
    Car car;
    String licenseID;

    // Constructor:
    public Driver(String name, String surname, String phoneNumber, double balance, String licenseId) {
        super(name, surname, phoneNumber, balance);
        this.licenseID = licenseId;
        this.licenseID = licenseId;
    }

    // Methods:
    // Setters:
    public void setCar(Car car) {
        this.car = car;
    }

    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }

    // Getters:
    public Car getCar() {
        return car;
    }

    public String getLicenseID() {
        return licenseID;
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a driver";
    }
}