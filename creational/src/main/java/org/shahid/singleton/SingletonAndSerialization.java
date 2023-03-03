package org.shahid.singleton;

import java.io.*;

public class SingletonAndSerialization {

    public static void main(String[] args) {
        SerializableSingleton instance1 = SerializableSingleton.getInstance();

        try {
            // Serialize singleton object to a file.
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(instance1);
            out.close();

            // Deserialize singleton object from the file
            ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            SerializableSingleton instance2 = (SerializableSingleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode: " + instance1.hashCode());
            System.out.println("instance2 hashCode: " + instance2.hashCode());
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}

class SerializableSingleton implements Serializable {
    private static final long serialVersionUID = 8806820726158932906L;

    private static SerializableSingleton instance;

    private SerializableSingleton() {
    }

    public static synchronized SerializableSingleton getInstance() {
        if (instance == null) {
            instance = new SerializableSingleton();
        }
        return instance;
    }

    protected Object readResolve() {
        return instance;
    }
}

