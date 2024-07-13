package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit? (y/n) ");
        String InitialDeposit = sc.next();
        char InitialDepositChar = InitialDeposit.charAt(0);
        if (InitialDepositChar == 'y'){
            System.out.println("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account.addDeposit(deposit);
        }else {}

        account = new Account(number, name, account.getDeposit());

        System.out.println("Account data: ");
        System.out.println("Account: "+number+","+" Holder: "+name+","+" Balance: R$"+account.getDeposit());

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.addDeposit(deposit);
        System.out.println("Update account data");
        System.out.println("Account: "+number+","+" Holder: "+name+","+" Balance: R$"+account.getDeposit());
        System.out.println("Enter withdraw value: ");
        double removeDeposit = sc.nextDouble();
        account.removeDeposit(removeDeposit);
        System.out.println("Update account data");
        System.out.println("Account: "+number+","+" Holder: "+name+","+" Balance: R$"+account.getDeposit());


        sc.close();
    }
}
