package rooms;

import people.Guest;

import java.util.ArrayList;

public abstract class Room {


    private String name;
    private ArrayList<Guest> occupants;
    private int capacity;

    public Room(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.occupants = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity(){
        return capacity;
    }

    public ArrayList<Guest> getOccupants() {
        return new ArrayList<>(occupants);
    }

    public boolean isRoomFull(){
        return occupants.size() == capacity;
    }

    public void checkInGuestToRoom(Guest guest){
        if (!isRoomFull()) {
            this.occupants.add(guest);
        }
    }

    public void emptyRoom(){
        this.occupants.clear();
    }

}
