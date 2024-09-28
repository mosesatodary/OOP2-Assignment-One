/**
 * Represents a customer in the rental system.
 */
public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String phoneNumber;

    /**
     * Constructs a Customer object with the specified details.
     *
     * @param customerId the ID of the customer
     * @param name the name of the customer
     * @param address the address of the customer
     * @param phoneNumber the phone number of the customer
     */
    public Customer(String customerId, String name, String address, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
