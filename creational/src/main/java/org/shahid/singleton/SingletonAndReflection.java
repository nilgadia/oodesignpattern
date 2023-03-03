package org.shahid.singleton;

import java.lang.reflect.Constructor;

public class SingletonAndReflection {

    private static final SingletonAndReflection instance = new SingletonAndReflection();

    private SingletonAndReflection() {
        if (instance != null) {
            throw new IllegalStateException("Singleton already initialized");
        }
    }

    public static SingletonAndReflection getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingletonAndReflection singletonInstance = SingletonAndReflection.getInstance();
        SingletonAndReflection reflectionInstance = null;

        try {
            Constructor[] constructors = SingletonAndReflection.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                reflectionInstance = (SingletonAndReflection) constructor.newInstance();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        System.out.println("singletonInstance hashCode: " + singletonInstance.hashCode());
        System.out.println("reflectionInstance hashCode: " + reflectionInstance.hashCode());
    }
}
