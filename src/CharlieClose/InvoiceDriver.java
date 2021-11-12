package CharlieClose;

import java.util.Scanner;

public class InvoiceDriver {
    public static void main(String[] args) {
        Invoice smallInvoice = new Invoice();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Part Number: ");
        String partNumber = input.nextLine();
        smallInvoice.setPartNumber(partNumber);
        System.out.println();
        System.out.println("Enter Part Description: ");
        String partDescription = input.nextLine();
        smallInvoice.setPartDescription(partDescription);
        System.out.println();
        System.out.println("Enter quantity purchased: ");
        int quantityPurchased = input.nextInt();
        smallInvoice.setQuantityPurchased(quantityPurchased);
        System.out.println();
        System.out.println("Enter price per item:");
        double price = input.nextDouble();
        smallInvoice.setPricePerItem(price);
        System.out.println();
        smallInvoice.setInvoiceAmount(quantityPurchased, price);
        smallInvoice.getInvoiceAmount();

        System.out.println();
        System.out.printf("""
                
                EMEKA & SONS INTERNATIONAL
                
                Part Number: %s
                
                Part Description: %s
                
                Quantity Purchased: %d
                
                Price per item: %.2f
                
                Amount Payable: %.2f
                
                """, smallInvoice.getPartNumber(), smallInvoice.getPartDescription(), smallInvoice.getQuantityPurchased(), smallInvoice.getPricePerItem(), smallInvoice.getInvoiceAmount());

    }
}
