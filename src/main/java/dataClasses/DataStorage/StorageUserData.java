package dataClasses.DataStorage;

import dataClasses.Info;
import dataClasses.User;
import dataClasses.UserCard.Card;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;


public class StorageUserData {
    public static HashMap<Long, User> mapUser= DataFake.fillingMap();

    public StorageUserData() {
    }


    public static HashMap hashmapAdd(User user) {
        Long key = user.getId();
      mapUser.put(key, user);
        return mapUser;
    }

    public static ArrayList<User> lostSurname(String surname) {
        Collection<User> users = mapUser.values();
        ArrayList<User> resultArrayList= new ArrayList<>();
        for (User tmp : users) {
            Info infoUser = tmp.getInfo();
             if ((infoUser.getSurname()).equals(surname)) {
                resultArrayList.add(tmp);
                        }}
            if (resultArrayList.isEmpty()){ return null;}
            else { return resultArrayList;}

        }



    public static Long ownerSearchByCardNumber(long cardNumber1) {
        Collection<User> users = mapUser.values();
           for (User tmp : users) {
           Card cardUser = tmp.getCard();
            long numberCa = cardUser.getCardNumber();
            if (numberCa==cardNumber1) {
                Collection<Long> keys = mapUser.keySet();
                for (Long tmpKey : keys) {
                    User tmp2 = mapUser.get(tmpKey);
                    if (tmp2.equals(tmp)) {
                        Long idUser = tmp.getId();
                      return idUser;
                    }
                }
            }

        }
        return null;
    }

    public static int[] refill(long id1, long id2, int summa) {
        User user1=mapUser.get(id1);
        User user2=mapUser.get(id2);
      Card cardUser1 = user1.getCard();
       Card cardUser2 = user2.getCard();
        int balansNumber1=cardUser1.getMoney();
        int balansNumber2=cardUser2.getMoney();
        int i=balansNumber1-summa;
        int j=balansNumber2+summa;
        cardUser1.setMoney(i);
        cardUser2.setMoney(j);
        int[] result = {cardUser1.getMoney(),cardUser2.getMoney()};
         return result;



        }






}
