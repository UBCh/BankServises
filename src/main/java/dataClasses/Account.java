package dataClasses;

public class Account {

    private  String passvord;
    private  String shortName;
    private   long id;
    public Account() {
    }

    public Account(String passvord, String shortName, long id) {
        this.passvord = passvord;
        this.shortName = shortName;
        this.id = id;
    }

    public static Account bornAccount(String shName, String pas, long i){
        Account account=new Account();
       account.setShortName(shName);
       account.setPassvord(pas);
       account.setId(i);
        return account;
    }


    public void setPassvord(String pas) {
        this.passvord = pas;
    }

    public void setShortName(String shName) {
        this.shortName = shName;
    }



    public  long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public  String getPassvord() {
        return passvord;
    }

    public  String getShortName() {
        return shortName;
    }





}
