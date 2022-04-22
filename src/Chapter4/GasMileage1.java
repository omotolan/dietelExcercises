package Chapter4;

public class GasMileage1 {
    private int gallons;
    private int miles;
    private final int oneGallonEqualsTwelveMiles = 12; //miles

    public GasMileage1(int gallons, int miles) {
        this.gallons = gallons;
        this.miles = miles;
    }

    public void setGallons(int gallons) {
        this.gallons = gallons;
    }

    public int getGallons() {
        return gallons;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public double getMilesPerGallon() {

        return oneGallonEqualsTwelveMiles * gallons;
    }

    public double getGallonsPerMiles() {
        return miles / oneGallonEqualsTwelveMiles;
    }
}
