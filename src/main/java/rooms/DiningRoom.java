package rooms;

import java.util.ArrayList;

public class DiningRoom extends Room {

    int capacity;
    private DiningRoomType type;

    private DiningRoom(String name, ArrayList occupants, int capacity, DiningRoomType diningRoomType){
        super(name, occupants);
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public DiningRoomType getType() {
        return type;
    }
}
