package org.shahid.singleton;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class SingletonAndClassloader {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonAndClassloader sac = new SingletonAndClassloader();
        URL classUrl = sac.getUrl("org/shahid/singleton/LazyDoubleCheckedLockingSingleton.class");
        ClassLoader cl1 = new URLClassLoader(new URL[]{classUrl});
        ClassLoader cl2 = new URLClassLoader(new URL[]{classUrl});
        Class<?> instance1 = cl1.loadClass("LazyDoubleCheckedLockingSingleton");
        Class<?> instance2 = cl2.loadClass("LazyDoubleCheckedLockingSingleton");
    }

    private URL getUrl(String fileName) throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        return classLoader.getResource(fileName);
    }
//    private static Class getClass(String classname) throws ClassNotFoundException {
//        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
//        if (classLoader == null)
//            classLoader = SingletonAndClassloader.class.getClassLoader();
//        return (classLoader.loadClass(classname));
//    }
}
