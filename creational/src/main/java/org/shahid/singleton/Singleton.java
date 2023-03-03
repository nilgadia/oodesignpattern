package org.shahid.singleton;

public class Singleton {

    private static final Singleton instance = new Singleton();

    //private constructor.
    private Singleton() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static Singleton getInstance() {
        return instance;
    }

    protected Singleton readResolve() {
        return getInstance();
    }
}
