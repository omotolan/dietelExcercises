package OOP;

public class PapaNosaDriver {
    public static void main(String[] args) {
        Pray pray = new Pray1(); // super pray class
        Pray prayy = new Pray2(); // sub pray class declared in the supper class type
        Pray prayyy = new Pray1(); // sub pray class declared in the sub class type
        Walk walk = new Walk();
        PapaNosa nosa = new PapaNosa(walk, pray);
        PapaNosa tola = new PapaNosa(walk, pray);
        PapaNosa ademola = new PapaNosa(walk, pray);
        PapaNosa tobi = new PapaNosa(walk, prayy);

        // here you can create various prayer types and pass to the objects
        ademola.pray();
        tobi.walk();
        tobi.pray();

        nosa.toString();
        System.out.println( nosa.toString());

        /* nosa and tola use same pray method. instead of overriding the pray method from the parent class and writing same code for
        nosa and tola, just use composition and let the objects use the prayer methods. it enhances method re-usability instead
        of copying and pasting same code**/
        nosa.pray();
        tola.pray();
    }
}
