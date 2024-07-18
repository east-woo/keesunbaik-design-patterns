package com.eastwoo.creational_patterns.factory_method._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteship = new WhiteshipFactory().orderShip("Whiteship", "keesun@mail.com");
        System.out.println(whiteship);

        Ship blackship = new BlackshipFactory().orderShip("Blackship", "keesun@mail.com");
        System.out.println(blackship);
    }
}
