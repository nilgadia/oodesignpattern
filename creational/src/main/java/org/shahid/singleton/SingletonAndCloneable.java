package org.shahid.singleton;

public class SingletonAndCloneable implements Cloneable {
    private static SingletonAndCloneable instance;

    private SingletonAndCloneable() {
        // Private constructor prevents instantiation by untrusted callers
    }

    // Lazy initialization
    public static synchronized SingletonAndCloneable getInstance() {
        if (instance == null) {
            instance = new SingletonAndCloneable();
        }
        return instance;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
