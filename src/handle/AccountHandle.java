package handle;

import entity.Account;

import java.util.Scanner;

public class AccountHandle {
    public Account inputInfo (Scanner scanner){
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập số account");
        int accountNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        System.out.println("Nhập số dư");
        double accountBalance = Double.parseDouble(scanner.nextLine());
        return new Account(name, accountNumber, email, accountBalance);
    }
}
