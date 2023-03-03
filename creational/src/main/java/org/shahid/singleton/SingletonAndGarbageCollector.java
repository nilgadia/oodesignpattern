package org.shahid.singleton;
/*
 * package creational.singleton.examples;
 *
 * import java.lang.reflect.Method;
 *
 * //https://wiki.sei.cmu.edu/confluence/display/java/MSC07-J.+Prevent+multiple+
 * instantiations+of+singleton+objects public class SingletonAndGarbageCollector
 * {
 *
 * { ClassLoader cl1 = new MyClassLoader(); Class class1 =
 * cl1.loadClass(MySingleton.class.getName()); Method classMethod =
 * class1.getDeclaredMethod("getInstance", new Class[] { }); Object singleton =
 * classMethod.invoke(null, new Object[] { });
 * ObjectPreserver.preserveObject(singleton); // Preserve the object
 * System.out.println(singleton.hashCode()); }
 *
 * ClassLoader cl1 = new MyClassLoader(); Class class1 =
 * cl1.loadClass(MySingleton.class.getName()); Method classMethod =
 * class1.getDeclaredMethod("getInstance", new Class[] { }); // Retrieve the
 * preserved object Object singleton = ObjectPreserver.getObject();
 * System.out.println(singleton.hashCode()); }
 *
 * class ObjectPreserver implements Runnable { private static ObjectPreserver
 * lifeLine = new ObjectPreserver();
 *
 * private ObjectPreserver() { } // make private
 *
 * @Override public void run() { // TODO Auto-generated method stub
 *
 * } }
 */