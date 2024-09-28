import java.time.LocalDate;

/**
 * Represents a rental transaction in the rental system.
 */
public class Rental {
    private Car car;
    private Customer customer;
    private LocalDate rentalDate;
    private LocalDate returnDate;

    /**
     * Constructs a Rental object with the specified details.
     *
     * @param car the car being rented
     * @param customer the customer renting the car
     * @param rentalDate the date the car was rented
     */
    public Rental(Car car, Customer customer, LocalDate rentalDate) {
        this.car = car;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.returnDate = null;
    }

    // Getters
    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    /**
     * Marks the car as returned and sets the return date.
     *
     * @param returnDate the date the car was returned
     */
    public void returnCar(LocalDate returnDate) {
        this.returnDate = returnDate;
        car.setAvailable(true);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "car=" + car +
                ", customer=" + customer +
                ", rentalDate=" + rentalDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
