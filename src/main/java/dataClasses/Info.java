package dataClasses;


import java.util.Scanner;

public class Info {

    private String name;
    private String surname;
    private Address address;

    public Info() {
    }

    public Info(String name,String surname, Address address) {
        this.name = name;
        this.surname=surname;
        this.address = address;

    }


    public void setInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter surname: ");
        this.surname = scanner.nextLine();
        address = new Address();
        this.address.cetAddress(scanner);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }
}





