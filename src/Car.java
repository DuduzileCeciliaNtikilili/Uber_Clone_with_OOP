public class Car implements Vehicle {
    
    // Fields:
    String numberPlate;
    String colour;
    String model;
    String type;
    double base_rate;

    // Constructor:
    Car(String numberPlate, String colour, String model, String type) {
        this.numberPlate = numberPlate;
        this.colour = colour;
        this.model = model;
        this.type = type;
        if (type.equals("XL")) {
            this.base_rate = 15.00;
        } else {
            this.base_rate = 10.00;
        }
    }

    // Methods:
    @Override
    public String getNumberPlate() {
        return numberPlate;
    };

    @Override
    public String getcolour() {
        return colour;
    };

    @Override
    public String getModel() {
        return model;
    };

    public String toString() {
        return this.model + " car of " + this.colour + " colour, with number plate " + this.numberPlate;    }
}