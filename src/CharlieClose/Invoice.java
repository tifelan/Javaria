package CharlieClose;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;
    private double invoiceAmount;

    public Invoice(){
    }
//    public Invoice(String partNumber, String partDescription, int quantityPurchased, double pricePerItem) {
//        this.partNumber = partNumber;
//        this.partDescription = partDescription;
//        this.quantityPurchased = quantityPurchased;
//        if(pricePerItem > 0.0)
//        this.pricePerItem = pricePerItem;
//    }

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

    public int getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased) {
        this.quantityPurchased = quantityPurchased;

    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if(pricePerItem > 0.0)
        this.pricePerItem = pricePerItem;
    }

    public void setInvoiceAmount(int quantityPurchased, double price){
        invoiceAmount = quantityPurchased * pricePerItem;
    }

    public double getInvoiceAmount(){
        return invoiceAmount;
    }
}