package servises;

import dataClasses.Account;
import dataClasses.DataStorage.StorageAccountData;
import dataClasses.User;

import java.util.Scanner;

import static java.lang.System.in;

public class AccountServis {




      public static boolean logoVerification(String logo) {
          if (StorageAccountData.lostLogin(logo)) {
              return true;
          }
          return false;
      }



    public static boolean verification(String logo, String pass) {
        if (StorageAccountData.lostPass(logo,pass)){ return true;}
                 return false;
    }

    public static Account createAccaunt(){
        Scanner scanner = new Scanner(in);
        System.out.print("придумайте логин");
       String logo = scanner.nextLine();
       while (logoVerification(logo))
       { System.out.print("пользователь с таким логином уже зарегестрирован в базе, придумайте логин");
           logo = scanner.nextLine(); }
       System.out.print("введите пароль ");
       String pass = scanner.nextLine();
         Bank.addUser();
         Account account= new Account(logo,pass,User.getId());
           StorageAccountData.mapAdd(account.getId(),account);
           return account;
       }

    public static void accountGetContent(String logo,String pass) {
          Account account= StorageAccountData.getAccount(logo,pass);
        System.out.println("Ваш логин   -"+ account.getShortName());
        System.out.println("Ваш пароль  -"+ account.getPassvord());
       User user= Bank.lookForId(account.getId());
        System.out.println("Личные данные  -"+ user.getInfo().getName()+"  "+ user.getInfo().getSurname());
        System.out.println("ваши карта   -"+ user.getCard().getCardNumber());
        System.out.println("баланс на карте -"+ user.getCard().getMoney( ));

    }





    }


