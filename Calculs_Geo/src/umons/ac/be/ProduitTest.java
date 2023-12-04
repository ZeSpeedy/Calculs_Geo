package umons.ac.be;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {

    @Test
    public void multiplyEquals(){
        System.out.println("Test multiplyEquals");
        assertEquals(Produit.multiply(5,3), 15);
    }

    @Test
    public void multiplyNotEquals(){
        System.out.println("Test multiplyNotEquals");
        assertNotEquals(Produit.multiply(1,1), 3);
    }

}