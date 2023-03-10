package org.shahid.memento;

//memento
public class EmployeeMemento {

    private final String name;
    private final String phone;

    public EmployeeMemento(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
