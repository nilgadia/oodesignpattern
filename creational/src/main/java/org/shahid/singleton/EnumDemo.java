package org.shahid.singleton;

import java.io.Serializable;

enum ElvisEnum {
    INSTANCE;
    private int id;
    private String name;

    ElvisEnum() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EnumDemo {

    public static void main(String[] args) {
        ElvisEnum elvisEnum = ElvisEnum.INSTANCE;
        elvisEnum.setId(12);
        System.out.println(elvisEnum.getId());
    }
}

class ElvisFactory {
    public static ElvisFactory elvisFactory = null;

    private ElvisFactory() {
    }

    public static ElvisFactory getElvisFactoryInstance() {
        if (elvisFactory == null) {
            elvisFactory = new ElvisFactory();
        }
        return elvisFactory;
    }
}

class ElvisField {
    public static final ElvisField INSTANCE = new ElvisField();

    private ElvisField() {
    }
}

class ElvisFactorySerializable implements Serializable {
    private static final long serialVersionUID = 1L;
    public static ElvisFactorySerializable instance = null;

    private ElvisFactorySerializable() {
    }

    public static ElvisFactorySerializable getInstance() {
        if (instance == null) {
            instance = new ElvisFactorySerializable();
        }
        return instance;
    }

    private Object readResolve() {
        return instance;
    }
}