import java.util.*;

public class UberApp {

    public static void main(String[] args) {

        System.out.println("   __  ______  __________ \n" +
                "  / / / / __ )/ ____/ __ \\\n" +
                " / / / / __  / __/ / /_/ /\n" +
                "/ /_/ / /_/ / /___/ _, _/ \n" +
                "\\____/_____/_____/_/ |_|\n");

        // Example Passenger to test Code:
        // Passenger testPassenger = new Passenger("testPassenger@gmail.com", "Test", "Passenger","012 345 6789", 12000);

        Passenger newPassenger;

        Scanner sc = new Scanner(System.in);

        userInput(true, "name");
        String name;
        while (true) {
            name = sc.nextLine();
            if (!name.trim().isEmpty()) {
                break;
            }
            userInput(false, "name");
        }

        userInput(true, "surname");
        String surname;
        while (true) {
            surname = sc.nextLine();
            if (!surname.trim().isEmpty()) {
                break;
            }
            userInput(false, "surname");
        }

        userInput(true, "email");
        String email;
        while (true) {
            email = sc.nextLine();
            if (!email.trim().isEmpty()) {
                break;
            }
            userInput(false, "email");
        }

        userInput(true, "phone number");
        String phoneNumber;
        while (true) {
            phoneNumber = sc.nextLine();
            if (!phoneNumber.trim().isEmpty()) {
                break;
            }
            userInput(false, "phone number");
        }

        System.out.print("Please enter your account balance: ");
        int accBalance = sc.nextInt();
        sc.nextLine();

        newPassenger = new Passenger(email, name, surname, phoneNumber, accBalance);

        System.out.print("\nPlease enter your starting location: ");
        String startPoint = sc.nextLine();

        System.out.print("Please enter your final destination location: ");
        String endPoint = sc.nextLine();

        System.out.print("Please select your Uber type: XL or X: ");
        String vehicleType = sc.nextLine().toUpperCase();

        sc.close();

        System.out.println("\nStarting Location: " + startPoint.toUpperCase());
        System.out.println("End Location: " + endPoint.toUpperCase());
        System.out.println("Uber Type: " + vehicleType.toUpperCase());

//        UberRide uberRide = new UberRide(startPoint, endPoint, testPassenger);
        UberRide uberRide = new UberRide(startPoint, endPoint, newPassenger);

        Driver assignedDriver = uberRide.assignDriver(vehicleType);

        System.out.println("\nCalculating trip cost...");
        uberRide.calculateCost(startPoint, endPoint);
        
        System.out.println("\nSearching for a driver...");
        System.out.println("Assigned driver: " + assignedDriver.getName().substring(0,1).toUpperCase() + assignedDriver.getName().substring(1) + " " + assignedDriver.getSurname().substring(0,1).toUpperCase() + assignedDriver.getSurname().substring(1));
        System.out.println("Assigned car: " + assignedDriver.getCar());
        
        System.out.println("\nProcessing payment...");
//        uberRide.completePayment(assignedDriver, testPassenger);
        uberRide.completePayment(assignedDriver, newPassenger);
    }

    public static void userInput(boolean valid, String input) {
        if (valid) {
            System.out.print("Please enter your " + input + ": ");
        } else {
            System.out.print("Invalid input. Please enter your " + input + ": ");
        }
    }
}