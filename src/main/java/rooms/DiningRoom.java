package rooms;

public class DiningRoom extends Room {

    int capacity;
    private DiningRoomType type;

    private DiningRoom(String name, int capacity){
        super(name, capacity);
        this.type = type;
//        this.diningRoomType
    }

    public int getCapacity() {
        return capacity;
    }

//    public DiningRoomType getType() {
//        return type;
//    }
}
