package org.shahid.singleton;

public class LazyInnerClassSingleton {

    /**
     * private constructor to prevent others from instantiating this class
     */
    private LazyInnerClassSingleton() {
    }

    public static LazyInnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     * This inner class is loaded only after getInstance() is called for the first time.
     */
    private static class SingletonHelper {
        private static final LazyInnerClassSingleton INSTANCE = new LazyInnerClassSingleton();
    }
}