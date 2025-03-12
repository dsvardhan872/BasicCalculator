package com.dsv.assignment12.app;

import java.util.Scanner;

public class ATMStarter {
    public static void main(String[] args) {
        CheckingAccount CA = new CheckingAccount();
        SavingsAccount SA = new SavingsAccount();
        int option2;

        System.out.println("1.Savings\n2.Checking");
        System.out.println("What is your Account type");
        int option = new Scanner(System.in).nextInt();
        if(option == 1){
            do {
                System.out.println("1.Deposit Money");
                System.out.println("2.Withdraw Money");
                System.out.println("3.Display balance");
                System.out.println("4.exit");
                option2 = new Scanner(System.in).nextInt();
                switch (option2) {
                    case 1:
                        System.out.println("Enter the amount:");
                        int depositAmount = new Scanner(System.in).nextInt();
                        SA.setDepositAmount(depositAmount);
                        SA.deposit();
                        break;
                    case 2:
                        if(SA.displayBalance() <= 0){
                            System.out.println("Insufficient balance");
                            break;
                        }
                        System.out.println("Enter the amount to withdraw");
                        SA.setWithdrawAmount(new Scanner(System.in).nextInt());
                        SA.withdrawl();
                        break;
                    case 3:
                        System.out.println(SA.displayBalance());
                        break;
                    default:
                        System.out.println("Thank you for using this ATM");
                }
            }while(option2 < 4);
        }
        else{
            do {
                System.out.println("1.Deposit Money");
                System.out.println("2.Withdraw Money");
                System.out.println("3.Display balance");
                System.out.println("4.exit");
                option2 = new Scanner(System.in).nextInt();
                switch (option2) {
                    case 1:
                        System.out.println("Enter the amount:");
                        int depositAmount = new Scanner(System.in).nextInt();
                        CA.setDepositAmount(depositAmount);
                        CA.deposit();
                        break;
                    case 2:
                        if(CA.displayBalance() <= 0){
                            System.out.println("Insufficient balance");
                            break;
                        }
                        System.out.println("Enter the amount to withdraw");
                        CA.setWithdrawAmount(new Scanner(System.in).nextInt());
                        CA.withdrawl();
                        break;
                    case 3:
                        System.out.println(CA.displayBalance());
                        break;
                    default:
                        System.out.println("Thank you for using this ATM");
                }
            }while(option2 < 4);

        }
    }
}
