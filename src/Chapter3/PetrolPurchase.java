package Chapter3;

public class PetrolPurchase {
    String location;
    String petrolType;
    int quantity;
    double pricePerLiter;
    double percentageDiscount;
    double netAmountPurchased;
    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLiter, double percentageDiscount){
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return location;
    }
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public String getPetrolType(){
        return petrolType;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPricePerLiter(double pricePerLiter){
        this.pricePerLiter = pricePerLiter;
    }
    public  double getPricePerLiter(){
        return pricePerLiter;
    }
    public void setPercentageDiscount(double percentageDiscount){
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount(){
        return percentageDiscount;
    }
    public double getPurchaseAmount(){
        double purchase = quantity * pricePerLiter;
netAmountPurchased = purchase - ((purchase* percentageDiscount)/100);
        return netAmountPurchased;
    }
}
