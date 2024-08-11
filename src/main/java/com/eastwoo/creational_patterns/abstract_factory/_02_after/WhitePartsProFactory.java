package com.eastwoo.creational_patterns.abstract_factory._02_after;

/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : WhitePartsProFactory
 * @since : 2024-08-17
 */
public class WhitePartsProFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
