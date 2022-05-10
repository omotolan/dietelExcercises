package OOP;

public class PapaNosaDriver {
    public static void main(String[] args) {
        Pray pray = new Pray2();
        Walk walk = new Walk();
        PapaNosa nosa = new PapaNosa(walk, pray);

        nosa.pray();
        nosa.walk();
    }
}
