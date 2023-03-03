package org.shahid.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreationDemo {

    public static void main(String[] args) {

        // Using new
        Foo foo = new Foo();
        foo.abountMe();
        // Using Class.forName("").newInstance()
        try {
            Class clazz = Class.forName("org.singleton.shahid.Foo");
            foo = (Foo) clazz.newInstance();
            foo.abountMe();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        // Using clone method
        try {
            foo = (Foo) foo.clone();
            foo.abountMe();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // Using de-serialization
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            // Serialization
            fos = new FileOutputStream("file.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(foo);
            // De serialization
            fis = new FileInputStream("file.txt");
            ois = new ObjectInputStream(fis);
            foo = (Foo) ois.readObject();
            foo.abountMe();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fos.close();
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // Using reflection.
        Constructor<Foo> constructor;
        try {
            constructor = Foo.class.getDeclaredConstructor();
            foo = constructor.newInstance();

            foo.abountMe();
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
                 | IllegalArgumentException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

class Foo implements Cloneable, Serializable {

    public void abountMe() {
        System.out.println("I am foo");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
