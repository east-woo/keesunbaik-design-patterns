package com.eastwoo.creational_patterns.abstract_factory._02_after;

import com.eastwoo.creational_patterns.abstract_factory._01_before.WhiteAnchor;
import com.eastwoo.creational_patterns.abstract_factory._01_before.WhiteWheel;
import com.eastwoo.creational_patterns.factory_method._02_after.DefaultShipFactory;
import com.eastwoo.creational_patterns.factory_method._02_after.Ship;
import com.eastwoo.creational_patterns.factory_method._02_after.Whiteship;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : WhiteshipFactory
 * @since : 2024-08-17
 */
public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}

