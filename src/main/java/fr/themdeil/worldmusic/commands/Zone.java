package fr.themdeil.worldmusic.commands;

public class Zone {

    private String name;
    private int x;
    private int y;
    private int z;

    public Zone(String name, int x, int y, int z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public String getCoords() {
        return x + " " + y + " " + z;
    }

}
