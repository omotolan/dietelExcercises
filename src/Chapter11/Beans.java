package Chapter11;

public class Beans {
    private int numberOfSpoons;
    private boolean withOmiEwa;


    public Beans(int amount, boolean withOmiEwa) {
        this.withOmiEwa = withOmiEwa;
        numberOfSpoons = amount/50;
    }
    public String toString(){
        return  String.format("format: %d spoons of beans. %s", numberOfSpoons, withOmiEwa? ",with hot OmiEwa.": ".");
    }
}
