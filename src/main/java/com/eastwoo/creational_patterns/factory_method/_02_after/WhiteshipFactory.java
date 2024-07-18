package com.eastwoo.creational_patterns.factory_method._02_after;



public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
