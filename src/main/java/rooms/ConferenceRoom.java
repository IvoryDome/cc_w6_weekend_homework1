package rooms;

import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private int capacity;

    public ConferenceRoom(String name, ArrayList occupants, int capacity) {
        super(name, occupants);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}













