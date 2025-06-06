package finalAssignment;

/**
 * The Customer class represents a customer with a first name and last name.
 */
public class Customer {
    private String firstName;
    private String lastName;

    /**
     * Constructs a Customer with the specified first name and last name.
     * 
     * @param firstName the first name of the customer
     * @param lastName the last name of the customer
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the first name of the customer.
     * 
     * @return the first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the first name of the customer.
     * 
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the customer.
     * 
     * @return the last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets the last name of the customer.
     * 
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
