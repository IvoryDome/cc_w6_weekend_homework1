import org.junit.Before;
import org.junit.Test;
import people.Guest;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("James Garfield");
    }

    @Test
    public void guestHasName(){
        assertEquals("James Garfield", guest.getName());
    }
}
