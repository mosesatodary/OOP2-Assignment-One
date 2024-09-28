/**
 * Represents a car in the rental system.
 */
public class Car {
    private String registrationNumber;
    private String make;
    private String model;
    private boolean isAvailable;

    /**
     * Constructs a Car object with the specified details.
     *
     * @param registrationNumber the registration number of the car
     * @param make the make of the car
     * @param model the model of the car
     */
    public Car(String registrationNumber, String make, String model) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.isAvailable = true;
    }

    // Getters and setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
