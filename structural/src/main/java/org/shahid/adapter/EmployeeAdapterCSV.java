package org.shahid.adapter;


/**
 * Class Adapter Implementation.
 * public class EmployeeAdapterCSV extends EmployeeCSV implements Employee {
 * <p>
 * Compilation issue
 *
 * @Override public String getId() {
 * return instance.getId() + "";
 * }
 */


public class EmployeeAdapterCSV implements Employee {

    private final EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV instance) {
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getFirstname();
    }

    @Override
    public String getLastName() {
        return instance.getLastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
