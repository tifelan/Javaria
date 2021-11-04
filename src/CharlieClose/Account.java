package CharlieClose;

public class Account {
    private String name;
    private double balance;
    private double deposit;
    private double withdraw;

//    public Account(String name, double balance, double deposit, double withdraw)//all args constructor
//    {
//
//        this.name = name;// "this." used when a local variable wants to shadow an instance variable.
//        if (balance > 0.0)
//            this.balance = balance;
//        if(deposit>0.0)
//            this.deposit = deposit;
//        if( withdraw <= balance)
//            this.withdraw = withdraw;
//    }

    public void setName(String name) {
        this.name = name;// "this." is cos local variables are different, and they have to be shadowed fpr the compiler to know which is which    }
    }

    public String getName() {
        return name;
    }

    public void setDeposit(double amountDeposited) {
        if (amountDeposited > 0.0)
           balance = balance + amountDeposited;
    }

    public double getDeposit(){
        return balance;
    }
//    public double getBalanceAfterDeposit() {
//        return deposit;
//    }

    public void setAmountToWithdraw(double amountToWithdraw) {
        if (amountToWithdraw > balance) {
            System.out.println("Withdraw amount exceed account balance");
        } else balance = balance - amountToWithdraw;
    }
    public double getBalanceAfterWithdrawal(){
        return balance;
    }

}