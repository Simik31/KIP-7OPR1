package cz.osu.student.R19584.task3;

import java.util.ArrayList;

public class Register {

    private final ArrayList<Payable> inner;

    public Register() {
        inner = new ArrayList<>();
    }

    public void add(Payable toBePayed) {
        inner.add(toBePayed);
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (Payable toPay : inner) {
            ret.append(toPay.toString())
                    .append(toPay.getClass().getSimpleName().equals("Employee") ? "Salary: " : "Total price: ")
                    .append(toPay.getPayableAmount().toString())
                    .append("\n\n");
        }
        return "To pay:\n" + ret.toString();
    }
}
