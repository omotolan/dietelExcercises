package Chapter8;

public class Cylinder {
    private double radius = 1.0;
    private double height = 1.0;

    public Cylinder() {

    }

    public double getRadius() {
        return radius;
    }

    private void validate(double height, double radius) {
        validateHeight(height);
        validateRadius(radius);
    }

    private void validateHeight(double height) {
        boolean isHeightValid = height > 0;
        if (!isHeightValid) {
            throw new IllegalArgumentException("height can not be less that zero");
        }
    }

    private void validateRadius(double radius) {
        boolean isRadiusValid = radius > 0;
        if (!isRadiusValid) {
            throw new IllegalArgumentException("radius can not be less that zero");
        }
    }

    public void setRadius(double radius) {
        validateRadius(radius);
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        validateHeight(height);
        this.height = height;
    }

    public double calculateVolumeOfCylinder() {

        return Math.PI * (getRadius() * getRadius()) * getHeight();
    }
}
