import entity.Account;
import handle.AccountHandle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountHandle accountHandle = new AccountHandle();
        Account account = accountHandle.inputInfo(scanner);
        account.recharge();
        account.changeEmail();
        account.displayInfo();
    }
}