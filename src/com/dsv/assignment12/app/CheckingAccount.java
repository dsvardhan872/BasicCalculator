package com.dsv.assignment12.app;

import com.dsv.assignment12.model.BankAccount;

public class CheckingAccount extends BankAccount {
    private int balance;
    private int depositAmount;
    private int withdrawAmount;
    @Override
    public void deposit() {
        balance =balance+ depositAmount;
        System.out.println("Amount deposited successfully");
    }

    @Override
    public void withdrawl() {
       balance =balance- withdrawAmount;
        System.out.println("Amount withdrawl successfully");
    }

    @Override
    public int displayBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(int depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(int withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
