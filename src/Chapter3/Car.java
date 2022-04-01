package Chapter3;

public class Car {
        String model;
        String year;
        double price;
        public Car(String model, String year, double price){
            this.model = model;
            this.year = year;
            this.price = price;
        }
        public void setModel(String model){
            this.model = model;
        }
        public String getModel(){
            return  model;
        }
        public  void  setYear(String year){
            this.year = year;
        }
        public String getYear(){
            return year;
        }
        public void setPrice(double amount){
            this.price = amount;
        }
        public double getPrice(){
            return price;
        }
        public double discountedPrice5(){
//            double amount = (price * 5)/100;
            double amount = price * 0.05;
            return price-=amount;
        }
    public double discountedPrice7(){
        double amount = (price * 7)/100;
        return price-=amount;
    }
}
