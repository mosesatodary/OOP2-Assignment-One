import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a rental agency that manages cars, customers, and rentals.
 */
public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    /**
     * Constructs a RentalAgency object.
     */
    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    /**
     * Adds a car to the rental agency's inventory.
     *
     * @param car the car to be added
     */
    public void addCar(Car car) {
        cars.add(car);
    }

    /**
     * Adds a customer to the rental agency's records.
     *
     * @param customer the customer to be added
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * Finds an available car for rental.
     *
     * @return an available car, or null if no cars are available
     */
    public Car findAvailableCar() {
        for (Car car : cars) {
            if (car.isAvailable()) {
                return car;
            }
        }
        return null;
    }

    /**
     * Rents a car to a customer.
     *
     * @param customer the customer renting the car
     * @param car the car to be rented
     * @param rentalDate the date the car is rented
     */
    public void rentCar(Customer customer, Car car, LocalDate rentalDate) {
        if (car.isAvailable()) {
            car.setAvailable(false);
            Rental rental = new Rental(car, customer, rentalDate);
            rentals.add(rental);
            System.out.println("Car rented to " + customer.getName());
        } else {
            System.out.println("Car is not available.");
        }
    }

    /**
     * Returns a rented car.
     *
     * @param car the car being returned
     * @param returnDate the date the car is returned
     */
    public void returnCar(Car car, LocalDate returnDate) {
        for (Rental rental : rentals) {
            if (rental.getCar().equals(car) && rental.getReturnDate() == null) {
                rental.returnCar(returnDate);
                System.out.println("Car returned.");
                return;
            }
        }
        System.out.println("Rental not found.");
    }

    /**
     * Lists all available cars.
     */
    public void listAvailableCars() {
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
            }
        }
    }

    /**
     * Lists all customers.
     */
    public void listCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    /**
     * Lists all rental transactions.
     */
    public void listRentals() {
        for (Rental rental : rentals) {
            System.out.println(rental);
        }
    }
}
