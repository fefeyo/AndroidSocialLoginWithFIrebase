package com.fefe.firebasesample;

/**
 * Created by fefe on 16/07/10.
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
    }
}
