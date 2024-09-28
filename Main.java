import java.time.LocalDate;

/**
 * Main class to demonstrate and test the Car Rental System.
 */
public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        // Create cars
        Car car1 = new Car("ABC123", "Toyota", "Corolla");
        Car car2 = new Car("XYZ789", "Honda", "Civic");
        Car car3 = new Car("LMN456", "Ford", "Focus");

        // Create customers
        Customer customer1 = new Customer("C001", "John Mwangi", "123 Main St", "0712-345678");
        Customer customer2 = new Customer("C002", "Jane Wanjiku", "456 Elm St", "0722-567890");
        Customer customer3 = new Customer("C003", "Alice Njeri", "789 Oak St", "0733-789012");

        // Add cars and customers to the agency
        agency.addCar(car1);
        agency.addCar(car2);
        agency.addCar(car3);
        agency.addCustomer(customer1);
        agency.addCustomer(customer2);
        agency.addCustomer(customer3);

        // List all customers
        System.out.println("All Customers:");
        agency.listCustomers();
        System.out.println();

        // List available cars
        System.out.println("Available Cars:");
        agency.listAvailableCars();
        System.out.println();

        // Rent a car
        System.out.println("Renting a car to John Mwangi:");
        agency.rentCar(customer1, car1, LocalDate.now());
        System.out.println();

        // List available cars after renting one
        System.out.println("Available Cars after renting one:");
        agency.listAvailableCars();
        System.out.println();

        // Rent another car
        System.out.println("Renting a car to Jane Wanjiku:");
        agency.rentCar(customer2, car2, LocalDate.now());
        System.out.println();

        // List available cars after renting another one
        System.out.println("Available Cars after renting another one:");
        agency.listAvailableCars();
        System.out.println();

        // Return the first car
        System.out.println("Returning the car rented by John Mwangi:");
        agency.returnCar(car1, LocalDate.now().plusDays(3));
        System.out.println();

        // List available cars after returning one
        System.out.println("Available Cars after returning one:");
        agency.listAvailableCars();
        System.out.println();

        // List all rentals
        System.out.println("All Rentals:");
        agency.listRentals();
        System.out.println();

        // Attempt to rent an unavailable car
        System.out.println("Attempting to rent an unavailable car:");
        agency.rentCar(customer3, car2, LocalDate.now());
        System.out.println();

        // Rent the returned car to another customer
        System.out.println("Renting the returned car to Alice Njeri:");
        agency.rentCar(customer3, car1, LocalDate.now());
        System.out.println();

        // List available cars after renting the returned car
        System.out.println("Available Cars after renting the returned car:");
        agency.listAvailableCars();
        System.out.println();

        // List all rentals again
        System.out.println("All Rentals after additional transactions:");
        agency.listRentals();
    }
}
