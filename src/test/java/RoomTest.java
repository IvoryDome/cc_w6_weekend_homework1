import org.junit.Before;
import org.junit.Test;
import rooms.*;
import people.*;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Bedroom bedroom;
    Bedroom bedroom2;
    DiningRoom diningRoom;
    ConferenceRoom conferenceRoom;
    Lounge lounge;
    Bar bar;
    Casino casino;
    Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom("3", BedroomType.SINGLE, 50);
        bedroom2 = new Bedroom("17", BedroomType.PRESIDENTIAL_SUITE, 500);
        guest1 = new Guest("James Garfield");
    }


    @Test
    public void testRoomHasName(){
    assertEquals("3", bedroom.getName());
    }

    @Test
    public void testRoomIsEmpty(){
        assertEquals(0 ,bedroom.getOccupants().size());
    }

    @Test
    public void roomCanCheckIn(){
        bedroom.checkInGuestToRoom(guest1);
        assertEquals(1 ,bedroom.getOccupants().size());
    }

    @Test
    public void roomHasRate(){
        assertEquals(500, bedroom2.getRate(), 0.1);
    }

    @Test public void roomCanBeEmptied(){
        bedroom2.checkInGuestToRoom(guest1);
        bedroom2.emptyRoom();
        assertEquals(0, bedroom2.getOccupants().size());
    }




}
