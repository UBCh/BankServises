package dataClasses;

import dataClasses.UserCard.Card;

public class User {

     public static Info info;
    public static Card card;
    private static long id = (long) (Math.random() * 999999999);;
    private static Account account;


    public User() {
    }

    public static Info getInfo() {
        return info;
    }

    public static Card getCard() {
        return card;
    }

    public static long getId() {
        return id;
    }



    public static User createUser() {
        User user = new User();
        user.setUserInfo();
        user.setUserCard();
        user.setAccount();
        return user;
    }

    void setUserInfo() {
        info = new Info();
        info.setInfo();
    }

    public void setUserCard() {
        card = new Card();
        card.setCard();
    }
    public void setAccount(){
        account=new Account();
        account.setPassvord();
        account.setShortName();
    }

    public static Account getAccount() {
        return account;
    }
}
