package dataClasses.DataStorage;


import dataClasses.Account;
import dataClasses.User;
import dataClasses.UserCard.TypesCard;

import java.sql.*;
import java.util.HashMap;


public class MyBD {


    private static final String url = "jdbc:mysql://localhost:3306/UBCh";
    private static final String user = "app";
    private static final String password = "pass";


    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    private static final String INSERT_NEW = "INSERT users VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String GET_ALL = "SELECT * from users";
    private static final String UPDATE_TRANCF = "UPDATE users SET saving=? WHERE id = ?";
//    private static final String INSERT_TRANS = "INSERT users VALUES (?)";
//    private static final String GET_ID = "SELECT * from users where id=?";

    //  добавление нового клиента в БД
    public static void sendDataToBD(User u) throws SQLException {
        PreparedStatement preparedStatement = null;
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement( );
        preparedStatement = con.prepareStatement(INSERT_NEW);
        preparedStatement.setInt(1, (int) User.getId( ));
        preparedStatement.setString(2, User.getInfo( ).getSurname( ));
        preparedStatement.setString(3, User.getInfo( ).getName( ));
        preparedStatement.setString(4, User.getInfo( ).getAddress( ).getCity( ));
        preparedStatement.setString(5, User.getInfo( ).getAddress( ).getOutside( ));
        preparedStatement.setString(6, User.getInfo( ).getAddress( ).getHouse( ));
        preparedStatement.setString(7, User.getInfo( ).getAddress( ).getFlat( ));
        preparedStatement.setString(8, String.valueOf(User.getCard( ).getCardNumber( )));
        preparedStatement.setString(9, String.valueOf(User.getCard( ).getCvv( )));
        preparedStatement.setString(10, String.valueOf(TypesCard.GOLD));
        preparedStatement.setString(11, String.valueOf(User.getCard( ).getMoney( )));
        preparedStatement.setString(13, Account.getShortName( ));
        preparedStatement.setString(12, Account.getPassword( ));
        preparedStatement.execute( );
    }
//вывод всей базы данных

    public static void shouToBD() throws SQLException {
//        String qwery="select * from users" ;    //String qwery="select * from users where id=2"    - позволяет выбрать конкретную строку  или
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement( );
        rs = stmt.executeQuery(GET_ALL);
        while (rs.next( )) {
            System.out.println("Клиент :  " + rs.getString(2) + "  " + rs.getString(3) + "    тип карты:   " + rs.getString(10));
            //  result.getString("id") - обращается по имени столбика
        }

    }
//    авторизация
    public static ResultSet authorization(String login, String pass) throws SQLException {
        PreparedStatement preparedS = null;
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement( );
        preparedS = con.prepareStatement(GET_ALL);
        rs = preparedS.executeQuery( );
        while (rs.next( )) {
            if (rs.getString(12).equals(login) & rs.getString(13).equals(pass)) {
                return rs;
            }
        }

        return null;
    }
// изменение суммы на счете
    public static void setToBd(int id, String value) throws SQLException {
        PreparedStatement ps = null;
        con = DriverManager.getConnection(url, user, password);
        ps = con.prepareStatement(UPDATE_TRANCF);
        ps.setInt(1, Integer.parseInt(value));
        ps.setInt(2, id);
        ps.executeUpdate( );
    }
//поиск пользователя по разным полям
    public static ResultSet searchValue(int index, String value) throws SQLException {
        con = DriverManager.getConnection(url, user, password);
        stmt = con.createStatement( );
        PreparedStatement preparedS = con.prepareStatement(GET_ALL);
        rs = preparedS.executeQuery( );
        while (rs.next( )) {
            if (rs.getString(index).equals(value)) {
                return rs;
            }
        }

        return null;
    }
// формирование клиентских данных из БД
    public static HashMap<String, String> returnClient(ResultSet rs) throws SQLException {
        HashMap<String, String> client = new HashMap<>( );

        client.put("id", String.valueOf(rs.getInt(1)));
        client.put("surname", rs.getString(2));
        client.put("name", rs.getString(3));
        client.put("city", rs.getString(4));
        client.put("outside", rs.getString(5));
        client.put("house", rs.getString(6));
        client.put("flat", rs.getString(7));
        client.put("cardNumber", rs.getString(8));
        client.put("cvv", rs.getString(9));
        client.put("typeCard", rs.getString(10));
        client.put("saving", rs.getString(11));
        client.put("login", rs.getString(13));
        client.put("password", rs.getString(12));
        return client;

    }

}
