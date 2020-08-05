public class Car implements Vehicle {

    // Fields:
    String numberPlate;
    String colour;
    String model;
    String type;
    double base_rate;

    //Constructor
    Car(String numberPlate, String colour, String model, String type) {
        this.numberPlate = numberPlate;
        this.colour = colour;
        this.model = model;
        this.type = type;
        if(type.equals("XL")) {
            this.base_rate = 15.00;
        } else {
            this.base_rate = 10.00;
        }
    }

    //Methods:

    // Getters:
    @Override
    public String getNumberPlate() {
        return numberPlate;
    }

    public double getBaseRate() {
        return base_rate;
    }

    @Override
    public String getColor() {
        return colour;
    }

    @Override
    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return type;
    }

    // To String:
    @Override
    public String toString() {
        return colour.toUpperCase() + " " + model.toUpperCase() + ", with number plate: " + numberPlate.toUpperCase();
    }
}