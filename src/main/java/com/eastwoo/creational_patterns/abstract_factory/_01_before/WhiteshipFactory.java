package com.eastwoo.creational_patterns.abstract_factory._01_before;


import com.eastwoo.creational_patterns.factory_method._02_after.DefaultShipFactory;
import com.eastwoo.creational_patterns.factory_method._02_after.Ship;
import com.eastwoo.creational_patterns.factory_method._02_after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
