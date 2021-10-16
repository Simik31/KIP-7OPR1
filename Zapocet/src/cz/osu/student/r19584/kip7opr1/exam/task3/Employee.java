package cz.osu.student.r19584.kip7opr1.exam.task3;

public class Employee extends Person implements Payable {

    private Position position;
    private Crowns salary;

    public Employee(Address address, BirthDate birthDate, char sex, String name, Position position, Crowns salary) {
        super(address, birthDate, sex, name);
        setPosition(position);
        setSalary(salary);
    }

    public Crowns getPayableAmount() {
        return new Crowns(salary);
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setSalary(Crowns salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPosition: " + getPosition().toString() + "\n";
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
