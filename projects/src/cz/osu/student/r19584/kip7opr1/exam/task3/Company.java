package cz.osu.student.r19584.kip7opr1.exam.task3;

public class Company {

    String name;
    Address address;
    Register register;

    public Company(String name, Address address) {
        setName(name);
        setAddress(address);
        register = new Register();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = new Address(address);
    }

    public Register getRegister() {
        return register;
    }

    public void addInvoice(Invoice invoice) {
        register.add(invoice);
    }

    public void addEmployee(Employee employee) {
        register.add(employee);
    }

    @Override
    public String toString() {
        return "Company name: " + getName() + "\n" + getAddress() + "\n\n" + getRegister().toString();
    }

    public void print() {
        System.out.println(toString());
    }
}
