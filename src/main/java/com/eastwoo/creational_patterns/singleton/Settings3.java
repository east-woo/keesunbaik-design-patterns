package com.eastwoo.creational_patterns.singleton;

/**
 * double checked locking
 */
public class Settings3 {

    private static volatile Settings3 instance;

    private Settings3() { }

    public static Settings3 getInstance() {
        if (instance == null) {
            synchronized (Settings3.class) {
                if (instance == null) {
                    instance = new Settings3();
                }
            }
        }

        return instance;
    }

}
