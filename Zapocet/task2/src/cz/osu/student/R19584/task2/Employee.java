package cz.osu.student.R19584.task2;

public class Employee extends Person {

    private Position position;
    private Crowns salary;

    public Employee(Address address, BirthDate birthDate, char sex, String name, Position position, Crowns salary) {
        super(address, birthDate, sex, name);
        setPosition(position);
        setSalary(salary);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Crowns getSalary() {
        return salary;
    }

    public void setSalary(Crowns salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPosition: " + getPosition().toString() + "\nSalary: " + getSalary().toString();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}