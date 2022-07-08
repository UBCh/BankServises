package dataClasses.DataStorage;

import dataClasses.Account;
import dataClasses.Address;
import dataClasses.Info;
import dataClasses.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.HashMap;

public class DataFake {

//    Для генерирования фейковых данных для заполнения БД

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
         String house= String.valueOf(RandomUtils.nextInt(0,100));
         String flat= String.valueOf(RandomUtils.nextInt(0,100));;
       user.info=new Info(generator(),generator(),new Address(generator(),generator(), house,flat));
       user.setUserCard();
         return user;

     }

    public static Account createFakeAccount(){
        String secretName= generator();
        String passw= generator();
        Account account=new Account(secretName,passw);
        return account;

    }



}
