package tests;

import animals.*;
import exceptions.GenderException;
import exceptions.VomitException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    @Test
    public void catAgeTest() {
        Cat.age = 17;
        assertEquals(17, Cat.getAge(), "Cat age does not match.");
    }

    @Test
    public void catEatTest() throws VomitException {
        Cat testCat = new Cat();
        testCat.eat("chicken");
        assertEquals("chicken", Cat.lastAte, "Cat last ate does not match.");
    }

    @Test
    public void catSleepTest() {
        Cat testCat = new Cat();
        assertFalse(testCat.sleep());
    }

    @Test
    public void catRespireTest() {
        assertEquals("CO2", Cat.respire(), "Cat is not breathing.");
    }

    @Test
    public void catExcreteTest() {
        assertEquals("Poop.", Cat.excrete(), "Cat can't poop.");
    }

    @Test
    public void catReproduceTest() throws GenderException {
        Cat testCat = new Cat();
        testCat.gender = "female";
        assertEquals(Cat.name + " has given birth to a kitten.", testCat.reproduce("kitten"), "Cat can not reproduce.");
    }
}
