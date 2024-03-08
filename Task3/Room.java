package Task3;

public class Room {
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    // initialiserer alle felter med data.
    public Room(int numberOfDoors, int numberOfLamps, int numberOfWindows) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    // Getters for hvert felt
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }
}
