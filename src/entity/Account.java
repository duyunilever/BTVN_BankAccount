package entity;

import service.IAccount;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Account implements IAccount {
    private String name;
    private int accountNumber;
    private String email;
    private double accountBalance;

    public Account(String name, int accountNumber, String email, double accountBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    @Override
    public double recharge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn nạp");
        double amount = Double.parseDouble(scanner.nextLine());
        double accountBalanceNew = accountBalance + amount;
        return accountBalance = accountBalanceNew;
    }

    @Override
    public String changeEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập email mới");
        String emailNew = scanner.nextLine();
        return email = emailNew;
    }

    @Override
    public void displayInfo() {
        System.out.println(this);
    }
}
