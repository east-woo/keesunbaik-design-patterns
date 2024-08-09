package com.eastwoo.creational_patterns.abstract_factory._01_before;

import com.eastwoo.creational_patterns.factory_method._02_after.Ship;

public class Whiteship extends Ship {

    public Whiteship() {
        setName("whiteship");
        setLogo("\uD83D\uDEE5️");
        setColor("white");
    }
}
