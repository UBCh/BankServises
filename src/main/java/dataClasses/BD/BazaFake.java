package dataClasses.BD;

import dataClasses.Address;
import dataClasses.Info;
import dataClasses.User;

import java.util.HashMap;

public class BazaFake {


    public static HashMap<Long, User> fillingMap() {
     HashMap <Long, User>fake =new HashMap<>();
     for (int i=0; i<100; i++)
     {   User user = createFakeUser( );
         long key = (long) (Math.random() * 999999999);;
        fake.put(key,user);
     }
        return fake;
    }

     public static User createFakeUser(){
         User user = new User();
       user.info=new Info("Василий","Трамп",new Address("Москва","Проспект мира","10","7"));
       user.setUserCard();
         return user;

     }





}
