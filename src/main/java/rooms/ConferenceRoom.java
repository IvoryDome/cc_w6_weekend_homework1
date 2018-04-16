package rooms;

public class ConferenceRoom extends Room {

    private int capacity;

    public ConferenceRoom(String name, int capacity) {
        super(name, capacity);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}













