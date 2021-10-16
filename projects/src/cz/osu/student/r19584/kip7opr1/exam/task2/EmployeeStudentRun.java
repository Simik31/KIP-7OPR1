package cz.osu.student.r19584.kip7opr1.exam.task2;

public class EmployeeStudentRun {
    public static void main(String[] args) {

        Address a1 = new Address("Czechia", "Olomouc", "Ostrvska 1", 77900);
        BirthDate b1 = new BirthDate(31, 12, 1999);
        Student s1 = new Student(a1, b1, 'M', "Martin Šimara", "University of Ostrava", "Software systems");
        s1.print();

        System.out.println("\n\n");

        Address a2 = new Address("Czechia", "Prague", "Hrozenkovska 461", 15521);
        BirthDate b2 = new BirthDate(1, 1, 2000);
        Student s2 = new Student(a2, b2, 'M', "Dan Konecny", "Silesian University in Opava",
                "Computer Science and Technology");
        s2.print();

        System.out.println("\n\n");

        Address a3 = new Address("Czechia", "Opava", "Hradecka 85", 77900);
        BirthDate b3 = new BirthDate(12, 4, 1986);
        Crowns c1 = new Crowns(19000);
        Employee e1 = new Employee(a3, b3, 'M', "Petr Zapletal", Position.RESEARCH, c1);
        e1.print();

        System.out.println("\n\n");

        Address a4 = new Address("Czechia", "Prague", "Narodni 1175", 10221);
        BirthDate b4 = new BirthDate(7, 3, 1987);
        Crowns c2 = new Crowns(25000);
        Employee e2 = new Employee(a4, b4, 'F', "Klara Novakova", Position.ADMINISTRATION, c2);
        e2.print();
    }

}
