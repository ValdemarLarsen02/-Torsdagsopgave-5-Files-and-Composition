package Task3;

import java.util.ArrayList;

public class Building {
    private ArrayList<Room> rooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private boolean isOfficeBuilding;

    // Constructor (som vist i tidligere eksempler)
    public Building(ArrayList<Room> rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
        this.rooms = rooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.isOfficeBuilding = isOfficeBuilding;
    }

    // Getter for rooms
    public ArrayList<Room> getRooms() {
        return rooms;
    }

    // Getter for numberOfBathrooms
    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    // Getter for numberOfFloors
    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    // Getter for isOfficeBuilding
    public boolean isOfficeBuilding() {
        return isOfficeBuilding;
    }
}
