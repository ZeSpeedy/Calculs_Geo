package umons.ac.be;

public class Perimetre {
    public static int getPeri(int a, int b, int c){
        return Produit.multiply(Addition.add(a,b), c);
    }
}
