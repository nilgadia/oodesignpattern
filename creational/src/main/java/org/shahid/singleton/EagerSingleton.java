package org.shahid.singleton;

public class EagerSingleton {

    /**
     * Create an instance of the class at the time of class loading
     */
    private static final EagerSingleton instance = new EagerSingleton();

    /**
     * private constructor to prevent others from instantiating this class
     */
    private EagerSingleton() {
    }

    /**
     * Provide a global point of access to the instance
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
