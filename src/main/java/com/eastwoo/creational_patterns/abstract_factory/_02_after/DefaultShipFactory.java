package com.eastwoo.creational_patterns.abstract_factory._01_before;

import com.eastwoo.creational_patterns.factory_method._02_after.Ship;
import com.eastwoo.creational_patterns.factory_method._02_after.ShipFactory;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
