package dataClasses;

import java.util.Scanner;

public class Address {


    private String city;
    private String outside;
    private String house;
    private String flat;

    public Address() {
    }

    public Address(String city, String outside, String house, String flat) {
        this.city = city;
        this.outside = outside;
        this.house = house;
        this.flat = flat;
    }

    void cetAddress(Scanner scanner) {

        System.out.print("Enter city: ");
        this.city = scanner.nextLine();
        System.out.print("Enter outside: ");
        this.outside = scanner.nextLine();
        System.out.print("Enter house: ");
        this.house = scanner.nextLine();
        System.out.print("Enter flat: ");
        this.flat = scanner.nextLine();

    }

    public String getCity() {
        return this.city;
    }


    public String getOutside() {
        return this.outside;
    }


    public String getHouse() {
        return this.house;
    }


    public String getFlat() {
        return this.flat;
    }


}
