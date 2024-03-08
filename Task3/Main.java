package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, 5, 3)); // Tilføjer et rum med 5 lamper
        rooms.add(new Room(2, 4, 2)); // Tilføjer et rum med 4 lamper
        rooms.add(new Room(1, 2, 4)); // Tilføjer et rum med 2 lamper
        Building myBuilding = new Building(rooms, 2, 5, true);

        // Beregner det samlede antal lamper i bygningen
        int totalLamps = countLampsInBuilding(myBuilding);
        System.out.println("There is " + totalLamps + " lamps in the building");

        boolean normalBuilding = isNormal(myBuilding);
        System.out.println("Is the building normal? " + normalBuilding);
    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps(); // Lægger antallet af lamper i hvert rum til totalen
        }
        return totalLamps; // Returnerer det samlede antal lamper i bygningen
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true; // Bygningen er normal
        } else {
            System.out.println("This is an odd building");
            return false; // Bygningen er ikke normal
        }
    }
}
