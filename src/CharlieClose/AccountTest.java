package CharlieClose;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account gooseAccount = new Account();
        Account ganderAccount = new Account();
        System.out.println("Please enter your name:");
        String acctName = input.nextLine();
        gooseAccount.setName(acctName);
        System.out.println("Please enter your name:");
        acctName = input.nextLine();
        ganderAccount.setName(acctName);

        System.out.printf("%s has a default balance of %.2f\n", gooseAccount.getName(), gooseAccount.getDeposit());
        System.out.printf("%s has a default balance of %.2f\n", ganderAccount.getName(), ganderAccount.getDeposit());
        System.out.println();
        System.out.println("Gander, How much deposit will be made? ");
        double amountToDeposit = input.nextDouble();
        ganderAccount.setDeposit(amountToDeposit);
        System.out.printf("Gander, your balance is %.2f\n",ganderAccount.getDeposit());
        System.out.println();
        System.out.println("Goose, How much deposit will be made? ");
        amountToDeposit =input.nextDouble();
        gooseAccount.setDeposit(amountToDeposit);
        System.out.printf("Goose, your balance is %.2f", gooseAccount.getDeposit());
        System.out.println("\n");
        System.out.println("Withdrawals");
        System.out.println("Goose, How much will you like to withdraw today");
        double amountToWithdraw = input.nextDouble();
        gooseAccount.setAmountToWithdraw(amountToWithdraw);
        System.out.printf("Goose, your account balance is now %.2f\n", gooseAccount.getBalanceAfterWithdrawal());
        System.out.println("Gander, How much will you like to withdraw today");
        amountToWithdraw = input.nextDouble();
        ganderAccount.setAmountToWithdraw(amountToWithdraw);
        System.out.printf("Gander, your account balance is now %.2f", ganderAccount.getBalanceAfterWithdrawal());

    }
}
