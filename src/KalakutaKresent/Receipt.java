package KalakutaKresent;

import DowntownStore.Cart;

public class Receipt extends Cart {
    private double totalCost;
    private double amountPaid;
    private String CashierName;
    private String CustomerName;
    private double change;

public Receipt() {
}
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        if (totalCost > 0)
            this.totalCost = totalCost;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        if (amountPaid > 0)
            this.amountPaid = amountPaid;
    }

    public String getCashierName() {
        return CashierName;
    }

    public void setCashierName(String cashierName) {
        CashierName = cashierName;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        if (amountPaid > totalCost)
            this.change = change;
    }
}
