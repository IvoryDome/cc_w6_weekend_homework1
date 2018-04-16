package hotels;

import rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Room> rooms;

    public Hotel(String name, ArrayList rooms){
        this.name = name;
        this.rooms = new ArrayList<Room>();
    }



}
