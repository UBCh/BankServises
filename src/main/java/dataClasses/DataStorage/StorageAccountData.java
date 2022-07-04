package dataClasses.DataStorage;

import dataClasses.Account;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StorageAccountData {


    private static Map<Long, Account > accauntBD =new HashMap<>();

       public static  Map<Long, Account> mapAdd(Long id, Account account ) {
        accauntBD.put(id, account);
        return accauntBD;
    }


    public static boolean lostLogin(String logo) {
        Collection<Account> accounts = accauntBD.values();
        for (Account tmp : accounts)
        {if (tmp.getShortName().equals(logo)){
                return true;
            }}
         return false;


    }

    public static boolean lostPass(String logo, String pass) {
        Collection<Account> accaunt = accauntBD.values( );
        for (Account tmp : accaunt) {
            if ((tmp.getShortName( )).equals(logo) && (tmp.getPassvord().equals(pass))) { return true;

            }
        } return false;


    }

      public static Account getAccount(String logo, String pass){
           if (lostPass(logo,pass)) {
               Collection<Account> accaunt = accauntBD.values( );
               for (Account tmp : accaunt) {
                   if (tmp.getShortName().equals(logo)) { return tmp;}
               }
           }
          return null;
      }

}
