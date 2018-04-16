import org.junit.Before;
import org.junit.Test;
import people.Guest;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public before(){
        guest = new Guest("James Garfield");
    }

    @Test
    public guestHasName(){
        assertEquals("James Garfield", guest.getName());
    }
}
