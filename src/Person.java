// Super Person class for driver and passenger

public class Person {

    // Fields:
    private String name;
    private String surname;
    private String phoneNumber;
    private double balance;

    // Constructor:
    Person (String name, String surname, String phoneNumber, double balance) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    // Methods:

    // Getters:
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Setters:
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}