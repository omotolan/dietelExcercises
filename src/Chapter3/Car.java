package Chapter3;

public class Car {
    String model;
    String year;
    double price;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double amount) {
        this.price = amount;
    }

    public double getPrice() {
        return price;
    }

    public double discountedPrice5() {

        return (price * 5) / 0.01;
    }

    public double discountedPrice7() {
        return (price * 7) / 0.01;
    }
}
