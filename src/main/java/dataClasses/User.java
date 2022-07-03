package dataClasses;

import dataClasses.UserCard.Card;

public class User {

     public Info info;
    public Card card;
    private static long id = (long) (Math.random() * 999999999);


    public User() {
    }

    public Info getInfo() {
        return info;
    }

    public Card getCard() {
        return card;
    }

    public static long getId() {
        return id;
    }



    public static User createUser() {
        User user = new User();
        user.setUserInfo();
        user.setUserCard();
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


}
