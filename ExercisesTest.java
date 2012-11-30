import java.util.List;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * Sample tests for the functional programming exercises.
 * Full credit for the assignment requires providing a
 * more extensive set of tests.
 * @author Dr. Jody Paul, Edited by Zach Souser
 * @version Intermediate Programming 1.1
 */
public class ExercisesTest {
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    List<Integer> li1, li2, li3;
    @Before
    public void setUp() {
        this.li1 = java.util.Arrays.asList(2, 7, 13, 9, 11);
        this.li2 = java.util.Arrays.asList(0,1,2);
        this.li3 = java.util.Arrays.asList(1,1,1);
    }

    @Test
    public void testSum() {
        assertEquals(42, (int)Exercises.sum(li1));
        assertEquals(3, (int)Exercises.sum(li2));
        assertEquals(3, (int)Exercises.sum(li3));
    }

    @Test
    public void testProduct() {
        assertEquals(18018, (int)Exercises.product(li1));
        assertEquals(0, (int)Exercises.product(li2));
        assertEquals(1, (int)Exercises.product(li3));
    }

    @Test
    public void testStrCount() {
        assertEquals(2, (int)Exercises.strCount("catdogcat", "cat"));
        assertEquals(0, (int)Exercises.strCount("x", "foo"));
        assertEquals(2, (int)Exercises.strCount("ccccc", "cc"));
        assertEquals(1, (int)Exercises.strCount("asdfgh","asdf"));
        
        assertEquals(3, (int)Exercises.strCount("let's try this again","t"));

    }

    @Test
    public void testGroupExists() {
        assertTrue(Exercises.groupExists(li1, 0));
        assertTrue(Exercises.groupExists(li1, 2));
        assertTrue(Exercises.groupExists(li1, 7));
        assertTrue(Exercises.groupExists(li1, 9));
        assertTrue(Exercises.groupExists(li1, 31));
        assertTrue(Exercises.groupExists(li1, 42));
        assertFalse(Exercises.groupExists(li1, 1));
        assertFalse(Exercises.groupExists(li1, 3));
        assertFalse(Exercises.groupExists(li1, 12));
        assertFalse(Exercises.groupExists(li1, 4));
        
        assertTrue(Exercises.groupExists(li2,1));
        assertTrue(Exercises.groupExists(li2,2));
        assertTrue(Exercises.groupExists(li2,3));
        assertFalse(Exercises.groupExists(li2,5));
        assertFalse(Exercises.groupExists(li2,9));
        
        assertTrue(Exercises.groupExists(li3,1));
        assertTrue(Exercises.groupExists(li3,2));
        assertTrue(Exercises.groupExists(li3,3));
        assertFalse(Exercises.groupExists(li3,4));
        assertFalse(Exercises.groupExists(li3,5));
       
        assertTrue(Exercises.groupExists(li1,0));
        assertTrue(Exercises.groupExists(li2,0));
        assertTrue(Exercises.groupExists(li3,0));
       
    }
}