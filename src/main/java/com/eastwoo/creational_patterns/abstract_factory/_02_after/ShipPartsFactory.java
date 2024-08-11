package com.eastwoo.creational_patterns.abstract_factory._02_after;


/**
 * Please explain the class!!
 *
 * @author : dongwoo
 * @fileName : ShipPartsFactory
 * @since : 2024-08-17
 */
public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
