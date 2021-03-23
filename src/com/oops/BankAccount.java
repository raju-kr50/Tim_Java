package com.oops;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor");
    }
    
    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Parameterized constructor called..");
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Deposit of "+amount+" is successful. New balance is "+ getBalance());
    }

    public void withdrawFund(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance");
        } else {
            setBalance(this.balance - amount);
            System.out.println("Withdrawal of " + amount + " successful. Remaining balance is " + getBalance());
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("364765732",20.0,"John","john@gmail.com","487835");
        bankAccount.withdrawFund(100.0);

        bankAccount.depositFund(50.0);
        bankAccount.withdrawFund(100.0);

        bankAccount.depositFund(51.0);
        bankAccount.withdrawFund(100.0);

    }
}
