package servises;

import dataClasses.DataStorage.MyBD;
import dataClasses.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.in;

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


    public static void addUser() throws SQLException {
//        добавляем в БД фейковые данные
//        User user = DataFake.createFakeUser();
//        Account account= DataFake.createFakeAccount();
//        MyBD.sendDataToBD(user,account);
        User user = User.createUser( );
        MyBD.sendDataToBD(user);
    }

    public static void getDataUsers() throws SQLException {
        MyBD.shouToBD( );
    }


    public static HashMap<String, String> lookForId(long id) throws SQLException {
        ResultSet rs = MyBD.searchValue(1, String.valueOf(id));
        if (rs == null) {
            System.out.println("Пользователь не найден");
            return null;
        }
        HashMap<String, String> result = new HashMap<>(MyBD.returnClient(rs));
        shouAccount(result);
        return result;

    }

    public static HashMap<String, String> lookForSurName(String surname) throws SQLException {
        ResultSet rs = MyBD.searchValue(2, String.valueOf(surname));
        if (rs == null) {
            System.out.println("Пользователь не найден");
            return null;
        }
        HashMap<String, String> result = new HashMap<>(MyBD.returnClient(rs));
        shouAccount(result);
        return result;

    }


    public static void transfer() throws SQLException {
        Scanner scanner = new Scanner(in);
        System.out.print("ваш логин ");
        String login1 = scanner.nextLine( );
        System.out.print("логин пользователя, кому вы хотите сделать перевод");
        String login2 = scanner.nextLine( );
        System.out.print("укажите сумму перевода");
        int summa = scanner.nextInt( );

        ResultSet resultSet = MyBD.searchValue(12, login1);
        int balanse1 = Integer.parseInt((MyBD.returnClient(resultSet)).get("saving"));
        int balans1Result = balanse1 - summa;
        MyBD.setToBd(resultSet.getInt(1), String.valueOf(balans1Result));
        ResultSet resultSet2 = MyBD.searchValue(12, login2);
        int balanse2 = Integer.parseInt((MyBD.returnClient(resultSet2)).get("saving"));
        int balans2Result = balanse2 + summa;
        MyBD.setToBd(resultSet2.getInt(1), String.valueOf(balans2Result));
        System.out.println("выполнен перевод с карты пользователя " + login1 +
                " , баланс карты до перевода " + balanse1 + "на карту пользователя "
                + login2 + " баланс карты пользователя" + login1 + " стал " + balans1Result);
    }

    public static HashMap<String, String> verification() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String logo = scanner.nextLine( );
        System.out.print("Enter password: ");
        String pass = scanner.nextLine( );
        ResultSet resultSet = MyBD.authorization(logo, pass);
        HashMap<String, String> result = new HashMap<>(MyBD.returnClient(resultSet));
        if (result == null) {
            System.out.println("Пользователь не найден");
            return null;
        }
        shouAccount(result);
        return result;
    }

    public static void shouAccount(HashMap<String, String> map) throws SQLException {
        System.out.println("Личный кабинет пользователя : " + map.get("login"));
        System.out.println("Фамилия Имя  полльзователя: " + map.get("surname") + "  " + map.get("name"));
        System.out.println(" Карта : " + map.get("cardNumber"));
        System.out.println(" Баланс : " + map.get("saving"));
    }


}


