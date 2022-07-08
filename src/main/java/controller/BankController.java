package controller;

import servises.Bank;

import java.sql.SQLException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class BankController {

    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(in);
        out.println("выбор пользователя: Работник банка -введите 1; клиент Банка -введите 2");
        switch (scanner.nextInt( )) {
            case 1:
                if (!Bank.password("myPassword")) {
                    for (int i = 0; i < 3; i++) {
                        out.println("Для доступа введите пароль:");
                        String tmp = scanner.nextLine( );
                        if (Bank.password(tmp)) {
                            break;
                        } else {
                            System.exit(1);
                        }
                    }
                } else {

                    System.out.println("выбор функции");
                }
                while (true) {
                    String[] menu = {"1-добавить клиента банка",
                            "2-выполнить транзакцию",
                            "3-найти клиента банка по id",
                            "4-клиента банка по фамилии",
                            "5- вывести всю базу клиентов в консоль",
                            "100-остановить программу"};
                    for (String s : menu) {
                        System.out.println(s);
                    }
                    switch (scanner.nextInt( )) {
                        case 1:
                            Bank.addUser( );
                            break;
                        case 2:
                            Bank.transfer( );
                            break;
                        case 3:
                            System.out.println("введите номер id пользователя, которого хотите найти");
                            long id = scanner.nextInt( );
                            Bank.lookForId(id);
                            break;
                        case 4:
                            System.out.println("введите фамилию пользователя, которого хотите найти");
                            String surname = scanner.next( );
                            Bank.lookForSurName(surname);
                            break;
                        case 5:
                            Bank.getDataUsers( );
                            break;
                        case 100:
                            System.exit(1);

                    }
                }
            case 2:
                out.println("выбор операции: хотите стать клиентом -введите 1; являетесь клиентом Банка -введите 2");
                switch (scanner.nextInt( )) {
                    case 1:
                        Bank.addUser( );
                        break;
                    case 2:
                        Bank.verification( );
                }

        }


    }




}



