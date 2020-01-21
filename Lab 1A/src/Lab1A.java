//Donark Patel
// csc 236
//Lab 1A
//Date: 9/8/2018
//This application maintain a bank account.
public class Lab1A {
    public static void main(String [] args){
        Account acc = new Account(1122, 20000.00,4.5);
        System.out.println("Account number: " + acc.getId());
        System.out.println("Balance: $" + acc.getBalance());
        System.out.println("Annual interest rate: " + acc.getAnnualInterestRate()+"%");
        System.out.println("-------------------");
        acc.withdraw(2500.00);
        System.out.println("Withdraw: $2500.00");
        System.out.println("Balance: $" + acc.getBalance());
        System.out.println("-------------------");
        acc.deposit(3000.00);
        System.out.println("Deposit: $3000.00");
        System.out.println("Balance: $" + acc.getBalance());
        System.out.println("-------------------");
        System.out.println("Balance: $" + acc.getBalance());
        System.out.printf("%s %.2f\n","Monthly interest: $",acc.getMonthlyInterest());
        System.out.println("Date: " + acc.getDateCreated());

    }
}
