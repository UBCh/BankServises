package dataClasses.UserCard;


public class Card {

    private long cardNumber = (long) (Math.random() * 999999999);
    private int cvv = (int) (100 + (Math.random() * 900));
    private int money=0;

    public Card() {
    }

    public int getCvv() {
        return cvv;
    }

    public void setCard() {
       this.cardNumber = cardNumber;
       this.cvv = cvv;
           }

    public int getMoney() {
        return money;
    }

    public void setMoney(int babki) {
        money = babki;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}