# Car Rental System

## Overview
This Car Rental System is implemented using Object-Oriented Programming (OOP) principles in Java. It includes classes for `Car`, `Customer`, `Rental`, and `RentalAgency`, encapsulating data and behaviors for a modular system.

## Classes and Functionalities

### Car
- **Attributes**: `registrationNumber`, `make`, `model`, `isAvailable`
- **Methods**:
  - `getRegistrationNumber()`, `getMake()`, `getModel()`, `isAvailable()`, `setAvailable(boolean)`
  - `toString()`: Returns a string representation of the car.

### Customer
- **Attributes**: `customerId`, `name`, `address`, `phoneNumber`
- **Methods**:
  - `getCustomerId()`, `getName()`, `getAddress()`, `getPhoneNumber()`
  - `toString()`: Returns a string representation of the customer.

### Rental
- **Attributes**: `car`, `customer`, `rentalDate`, `returnDate`
- **Methods**:
  - `getCar()`, `getCustomer()`, `getRentalDate()`, `getReturnDate()`
  - `returnCar(LocalDate)`: Marks the car as returned and sets the return date.
  - `toString()`: Returns a string representation of the rental.

### RentalAgency
- **Attributes**: `cars`, `customers`, `rentals`
- **Methods**:
  - `addCar(Car)`: Adds a car to the inventory.
  - `addCustomer(Customer)`: Adds a customer to the records.
  - `findAvailableCar()`: Finds an available car for rental.
  - `rentCar(Customer, Car, LocalDate)`: Rents a car to a customer.
  - `returnCar(Car, LocalDate)`: Returns a rented car.
  - `listAvailableCars()`: Lists all available cars.
  - `listCustomers()`: Lists all customers.
  - `listRentals()`: Lists all rental transactions.

## Main Class
- **Purpose**: Demonstrates and tests the Car Rental System.
- **Test Cases**:
  - Adding cars and customers.
  - Listing customers and available cars.
  - Renting and returning cars.
  - Handling unavailable cars.
  - Listing all rentals.
