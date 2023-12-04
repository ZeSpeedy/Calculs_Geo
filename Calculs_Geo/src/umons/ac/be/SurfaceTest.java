package umons.ac.be;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurfaceTest {

    @Test
    public void surfaceEquals(){
        System.out.println("Test surfaceEquals");
        assertEquals(Surface.getSurf(5,3), 15);
    }

    @Test
    public void surfaceNotEquals(){
        System.out.println("Test surfaceNotEquals");
        assertNotEquals(Surface.getSurf(1,1), 3);
    }

}