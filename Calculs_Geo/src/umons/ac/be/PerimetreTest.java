package umons.ac.be;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerimetreTest {
    @Test
    public void perimetreEquals(){
        System.out.println("Test perimetreEquals");
        assertEquals(Perimetre.getPeri(5,3, 2), 16);
    }

    @Test
    public void perimetreNotEquals(){
        System.out.println("Test perimetreNotEquals");
        assertNotEquals(Perimetre.getPeri(1,1, 10), 3);
    }

}