public class Passenger extends Person {

    // Fields:
    String email;

    // Constructor:
    Passenger(String name, String surname, String phoneNumber, double balance, String email) {
        super(name, surname, phoneNumber, balance);
        this.email = email;
    }

    // Methods:
    // Setters:
    public void setEmail(String email) {
        this.email = email;
    }

    // Getters:
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return super.toString() + " and I am a passenger";
    }
}