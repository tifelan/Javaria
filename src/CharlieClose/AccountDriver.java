package CharlieClose;

public class AccountDriver {
    public static void main(String[] args) {
//    Account myAccount = new Account(); //() is an implicit call to the class to bequeath attributes to the newly created objects of class
//    System.out.println("Enter name: ");//prompt to enter name
//    Scanner input = new Scanner(System.in);//creation of scanner
//    String accountName = input.nextLine();//creation of a local variable to store input gotten from the user.
//    myAccount.setName(accountName);// set method call
//    System.out.printf("Your account name is %s", myAccount.getName());
//    System.out.println("How much was deposited: ");
//    int amountDeposited = input.nextInt();
//    myAccount.setDeposit(amountDeposited);
//    System.out.printf("Balance:%d", myAccount.getDeposit());
//
     Account accountOne = new Account();
     Account accountTwo = new Account();
     System.out.printf("Account name is %s\n", accountOne.getName());
     System.out.printf("Account balance is %f.2\n", accountOne.getDeposit());
     System.out.printf("your balance after Withdrawal is %.2f\n", accountOne.getBalanceAfterWithdrawal());
     //JOptionPane.showMessageDialog(null, "Are you sure provided details are correct?");
     System.out.printf("Account name is %s\n", accountTwo.getName());
     System.out.printf("Account balance is %.2f\n", accountTwo.getDeposit());
     System.out.printf("your balance after Withdrawal is %.2f\n", accountTwo.getBalanceAfterWithdrawal());
     //JOptionPane.showMessageDialog(null, "Welcome to Java");



    }
}
