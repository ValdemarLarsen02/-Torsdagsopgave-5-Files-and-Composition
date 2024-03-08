public class Customer {
    // Attributterne for klassen
    private String firstName;
    private String lastName;
    private String username;
    private int id; // Id for kunden

    // Statisk counter for at holde styr på næste ID
    private static int counter = 1;

    // Constructor for Customer klassen
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    // toString metode
    @Override
    public String toString() {
        return "Customer{" +
                "ID=" + id +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Username='" + username + '\'' +
                '}';
    }
    

}
