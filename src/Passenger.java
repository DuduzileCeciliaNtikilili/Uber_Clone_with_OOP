public class Passenger extends Person {

    // Field:
    String email;

    //Constructor:
    Passenger(String email, String name, String surname,String phone_number, int balance){
        super(name,surname,phone_number, balance);
        this.email = email;
    }

    //Methods:

    // Setter:
    public void setEmail(String email){
        this.email  = email;
    }

    // Getter:
    public String getEmail() {
        return this.email;
    }

    // To String
    @Override
    public String toString(){
        return super.toString() + " and I am a passenger";
    }
}