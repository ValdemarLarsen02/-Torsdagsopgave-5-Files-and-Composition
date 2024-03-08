package Task2;

public class Main {
    public static void main(String[] args) {
        // Opretter en ny instans af Cafe klassen
        Cafe cafe = new Cafe();

        // Printer den nuværende arbejdsmappe brugt da jeg havde problemer med at load .txt filen.
        System.out.println("Arbejdsmappe " + System.getProperty("user.dir"));

        // Kalder loadMenuData() metoden for at indlæse data fra Cafe klassen
        cafe.loadMenuData();

        
        // kaffemenuen
        System.out.println("Coffee Menu:");
        for (String coffee : cafe.getCoffeeMenu()) {
            System.out.println(coffee);
        }
    }
}
