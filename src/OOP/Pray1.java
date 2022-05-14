package OOP;

public class Pray1 extends Pray {
    private int halleluyah;

    public Pray1(int halleluyah) {
        this.halleluyah = halleluyah;
    }

    @Override
    public void pray() {
       // super.pray();
        System.out.println("pray 1");
    }
}
