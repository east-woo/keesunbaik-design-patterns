package com.eastwoo.creational_patterns.abstract_factory._02_after;

import com.eastwoo.creational_patterns.factory_method._02_after.Ship;
import com.eastwoo.creational_patterns.factory_method._02_after.ShipFactory;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : ShipInventory
 * @since : 2024-08-17
 */
public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
