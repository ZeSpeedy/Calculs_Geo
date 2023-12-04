package umons.ac.be;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    public void addEquals(){
        System.out.println("Test addEquals");
        assertEquals(Addition.add(5,3), 8);
    }

    @Test
    public void addNotEquals(){
        System.out.println("Test addNotEquals");
        assertNotEquals(Addition.add(1,1), 3);
    }
}