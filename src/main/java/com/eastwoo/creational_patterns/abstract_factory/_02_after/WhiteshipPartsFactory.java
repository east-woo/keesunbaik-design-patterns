package com.eastwoo.creational_patterns.abstract_factory._02_after;

import com.eastwoo.creational_patterns.abstract_factory._01_before.WhiteAnchor;
import com.eastwoo.creational_patterns.abstract_factory._01_before.WhiteWheel;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : WhiteshipPartsFactory
 * @since : 2024-08-17
 */
public class WhiteshipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
