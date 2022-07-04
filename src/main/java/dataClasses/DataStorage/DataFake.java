package dataClasses.DataStorage;

import dataClasses.Address;
import dataClasses.Info;
import dataClasses.User;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;

public class DataFake {


    public static HashMap<Long, User> fillingMap() {
     HashMap <Long, User>fake =new HashMap<>();
     for (int i=0; i<100; i++)
     {   User user = createFakeUser( );
         long key = (long) (Math.random() * 999999999);;
        fake.put(key,user);
     }
        return fake;
    }


    private static String generator() {
        String generatedString = RandomStringUtils.randomAlphabetic(6);

       return generatedString;

    }



     public static User createFakeUser(){
         User user = new User();
         String house= String.valueOf(Math.random() * 3);
         String flat= String.valueOf(Math.random() * 3);
       user.info=new Info(generator(),generator(),new Address(generator(),generator(), house,flat));
       user.setUserCard();
         return user;

     }





}
