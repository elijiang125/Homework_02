import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class constructorTest {
    //write a test program that constructs a list and prints it

    //we're gonna do emptyList first because it's supposed to be empty
    //if it's not empty, then that's concerning kekw

    @Test
    public void emptyListTest() {
        EmptyList list1 = new EmptyList();

        assertTrue(list1.empty());

        assertEquals(list1.head(), null);
        assertEquals(list1.tail(), null);
        assertEquals(list1.toString(), "");

        assertEquals(list1.length(), 0);


        NonEmptyList list2 = new NonEmptyList("A");

        assertEquals(list1.merge(list2), list2);

        assertFalse(list1.contains("A"));
    }

    //alright that works! Let's do nonemptyLists now

    @Test
    public void nonEmptyListTest() {
        NonEmptyList list1 = new NonEmptyList("A");

        assertFalse(list1.empty());

        assertEquals("A", list1.head());

        assertEquals(list1.NIL, list1.tail());

        assertEquals("A ", list1.toString());

        assertEquals(list1.length(), 1);

        //okay I wanna add more onto this lisplist

        NonEmptyList list2 = new NonEmptyList("B", list1);

        assertFalse(list2.empty());

        assertEquals("B", list2.head());

        assertEquals(list1, list2.tail());

        assertEquals("B A ", list2.toString());

        assertEquals(list2.length(), 2);

        LispList officialList = list1.merge(list2);

        assertTrue(officialList.head() == "A");
        assertTrue(officialList.tail().head() == "B");
        assertTrue(officialList.tail().tail().head() == "A");
    }
}
