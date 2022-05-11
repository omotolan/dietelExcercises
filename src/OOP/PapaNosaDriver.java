package OOP;

public class PapaNosaDriver {
    public static void main(String[] args) {
        Pray pray = new Pray(); // super pray class
        Pray prayy = new Pray1(); // sub pray class declared in the supper class type
        Pray1 prayyy = new Pray1(); // sub pray class declared in the sub class type
        Walk walk = new Walk();
        PapaNosa nosa = new PapaNosa(walk, pray);
        // here you can create various prayer types and pass to the objects
        nosa.pray();
        nosa.walk();
        nosa.pray();
    }
}
