package com.dsv.assignment12.model;
//12.Design an abstract class "BankAccount" with abstract methods for deposit,
// withdrawal, and displayBalance. Create concrete subclasses like "Savings Account" and
// "CheckingAccount" that extend the BankAccount class and implement these methods.
public abstract class BankAccount {

    public abstract void deposit();
    public abstract void withdrawl();
    public abstract int displayBalance();
}
