import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {
    private Pet pet;

    @Before
    public void setup() {
        pet = new Pet("rocky");
        System.out.println("before");
    }

    @Test
    public void getName() throws Exception{
        assertEquals(pet.getName(), "rocky");
    }

    @Test
    public void startHappy() {
        assertTrue(pet.startHappy());
    }

    @Test
    public void testHappy() {
        assertFalse(pet.isHappy());
    }

    @After
    public void finish() {
        System.out.println("After");

    }
}