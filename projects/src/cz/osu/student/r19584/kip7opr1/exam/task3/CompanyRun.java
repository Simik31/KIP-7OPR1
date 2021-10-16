package cz.osu.student.r19584.kip7opr1.exam.task3;

public class CompanyRun {
    public static void main(String[] args) {

        Company company = new Company("Packeta", new Address("Czechia", "Ostrava", "Opavska", 70200));

        Address employeeAddress1 = new Address("Czechia", "Opava", "Hradecka 85", 77900);
        BirthDate employeeBirthDate1 = new BirthDate(1, 1, 2000);
        Crowns salaryEmployee1 = new Crowns(19000);
        Employee employee1 = new Employee(employeeAddress1, employeeBirthDate1, 'M', "Petr Zapletal", Position.RESEARCH,
                salaryEmployee1);

        Address employeeAddress2 = new Address("Czechia", "Praha", "Narodni 1175", 10221);
        BirthDate employeeBirthDate2 = new BirthDate(7, 3, 1987);
        Crowns SalaryEmployee2 = new Crowns(25000);
        Employee employee2 = new Employee(employeeAddress2, employeeBirthDate2, 'F', "Klara Novakova",
                Position.ADMINISTRATION, SalaryEmployee2);

        Invoice invoice1 = new Invoice("38181994", "Package ENDisc", 9, new Crowns(115));
        Invoice invoice2 = new Invoice("39109978", "Package ENBook", 4, new Crowns(270));

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addInvoice(invoice1);
        company.addInvoice(invoice2);

        company.print();
    }
}
