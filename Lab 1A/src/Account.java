//Donark Patel
// csc 236
//Lab 1A
//Date: 9/8/2018
//This application maintain a bank account.
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account()
    {
         id = 0;
         balance = 0;
         annualInterestRate = 0;
    }


    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id, double balance, double annualInterestRate, Date dateCreated)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        Date date = new Date();
        dateCreated = date;
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        double monthlyInterestRate;
        monthlyInterestRate = (this.annualInterestRate/100)/12;
        return monthlyInterestRate;
    }
    public double getMonthlyInterest()
    {
        double monthlyInterest;
        monthlyInterest = ((this.annualInterestRate/100)/12) * this.balance;
        return monthlyInterest;
    }
    public void withdraw(double withdrawAmount)
    {
        this.balance = this.balance - withdrawAmount;
    }
    public void deposit(double depositAmount)
    {
        this.balance = this.balance + depositAmount;
    }
}
