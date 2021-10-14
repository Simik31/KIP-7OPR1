package cz.osu.student.R19584.task3;

public class Invoice implements Payable {

    String partNumber;
    String partDescription;
    int quantity;
    Crowns pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, Crowns pricePerItem) {
        setPartNumber(partNumber);
        setPartDescription(partDescription);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public Crowns getPayableAmount() {
        return pricePerItem.multiply(quantity);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Crowns getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(Crowns pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice for part number " + getPartNumber() + "\n" +
                "Part description: " + getPartDescription() + "\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Price per item: " + getPricePerItem() + "\n";
    }

    public void print() {
        System.out.println(toString());
    }
}
