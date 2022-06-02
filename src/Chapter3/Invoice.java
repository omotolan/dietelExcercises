package Chapter3;

public class Invoice {
    //instance variables
    private String partNumber;
    private String partDescription;
    private int quantityOfItemBeingPurchased;
    private double pricePerItem;
    private double amount;

    // constructor
    public Invoice(String partNumber, String partDescription, int quantityOfItemBeingPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantityOfItemBeingPurchased = quantityOfItemBeingPurchased;
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        }
    }

    // methods
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setQuantityOfItemBeingPurchased(int quantityOfItemBeingPurchased) {
        this.quantityOfItemBeingPurchased = quantityOfItemBeingPurchased;
    }

    public int getQuantityOfItemBeingPurchased() {
        return quantityOfItemBeingPurchased;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getAmount(int quantityOfItemBeingPurchased) {
        this.amount = quantityOfItemBeingPurchased * pricePerItem;
        if (quantityOfItemBeingPurchased < 1) {
            return 0;
        }
        if (pricePerItem < 0) {
            return 0.0;
        }
        return this.amount;
    }
}
