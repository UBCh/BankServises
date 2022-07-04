package servises;

import dataClasses.DataStorage.StorageUserData;
import dataClasses.User;


import java.util.ArrayList;

public class Bank {

    public static final Bank BANK = new Bank( );


    static final String bankPassword = "myPassword";

    public static boolean password(String password) {
        if (password.equals(bankPassword)) {
            return true;
        } else {
            System.out.println("Wrong password");
            return false;
        }
    }


    public static void addUser() {
        User user = User.createUser( );
        StorageUserData.hashmapAdd(user);
        System.out.print(StorageUserData.mapUser.toString( ));

    }

    public static void getDataUsers() {
        System.out.println(StorageUserData.mapUser.entrySet( ));
    }

    public static User lookForId(long id) {
        if (StorageUserData.mapUser.containsKey(id)) {
            return StorageUserData.mapUser.get(id);
        }
        return null;
    }

    public static ArrayList<User> lookForSurName(String surname) {
        ArrayList<User> result = StorageUserData.lostSurname(surname);
        if (result == null) {
            System.out.println("пользователь не найден");
            return null;
        }
        return result;

    }


    public static void transfer(long id1, long id2, int summa) {
        var result = StorageUserData.refill(id1, id2, summa);
        System.out.println("выполнен перевод с карты номер " + id1 + " , баланс карты " + result[0] + "на карту номер " + id2 + " баланс карты " + result[1]);
    }


}


