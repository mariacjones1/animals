package Tests;

import Animals.*;
import Exceptions.VomitException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
