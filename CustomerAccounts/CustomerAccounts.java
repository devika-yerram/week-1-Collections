import java.util.TreeMap;

public class CustomerAccounts {
    private TreeMap<Integer, Customer> customers = new TreeMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public void removeCustomer(int customerId) {
        customers.remove(customerId);
    }

    public void displayCustomers() {
        System.out.println("Customer Accounts:");
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }
}