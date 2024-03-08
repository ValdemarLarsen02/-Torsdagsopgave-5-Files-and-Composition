package Task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        this.coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    // Metode til at indlæse menu data
    public void loadMenuData() {
        try {
           
            File file = new File("coffes.txt");
            Scanner scanner = new Scanner(file);
            
            // Læser filen fra top til bund
            while (scanner.hasNextLine()) {
                String coffeeName = scanner.nextLine();
                // Tilføjer hver kaffenavn til coffeeMenu ArrayList
                coffeeMenu.add(coffeeName);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Der sket en fejl filen kunne ikke findes.");
            e.printStackTrace();
        }
    }
}
