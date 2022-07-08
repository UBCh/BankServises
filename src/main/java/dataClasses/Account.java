package dataClasses;

import java.util.Scanner;

import static java.lang.System.in;

public class Account {

    private static String passvord;
    private static String shortName;

    public Account() {
    }

    public Account(String passvord, String shortName) {
        this.passvord = passvord;
        this.shortName = shortName;

    }

    public static Account bornAccount() {
        Account account = new Account( );
        account.setShortName( );
        account.setPassvord( );

        return account;
    }

    public static String getPassword() {
        return passvord;
    }

    public static String getShortName() {
        return shortName;
    }


    public void setPassvord() {
        Scanner scanner = new Scanner(in);
        System.out.print("придумайте логин ");
        String pass = scanner.nextLine( );
        passvord = pass;
    }

    public void setShortName() {
        Scanner scanner = new Scanner(in);
        System.out.print("введите пароль");
        String logo = scanner.nextLine( );
        shortName = logo;
    }


}
