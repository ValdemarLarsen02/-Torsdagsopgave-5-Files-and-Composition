import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Opretter en ArrayList til at holde kunder
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Valemar", "Larsen", "Løven"));
        customers.add(new Customer("Marcus", "Løbel", "The streamer"));
        //Printer kunderne
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}
