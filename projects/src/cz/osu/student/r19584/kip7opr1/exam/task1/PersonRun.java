package cz.osu.student.r19584.kip7opr1.exam.task1;

public class PersonRun {
    public static void main(String[] args) {
        Address a1 = new Address("Czechia", "Olomouc", "Ostrvska 1", 77900);
        BirthDate b1 = new BirthDate(31, 12, 1999);
        Person p1 = new Person(a1, b1, 'M', "Martin Šimara");
        p1.print();

        System.out.println("\n\n");

        Address a2 = new Address("Czechia", "Prague", "Hrozenkovska 461", 15521);
        BirthDate b2 = new BirthDate(1, 1, 2000);
        Person p2 = new Person(a2, b2, 'M', "Dan Konecny");
        p2.print();

        System.out.println("\n\n");

        Address a3 = new Address("Slovakia", "Bratislava", "Zochova 1", 81103);
        BirthDate b3 = new BirthDate(1, 10, 2000);
        Person p3 = new Person(a3, b3, 'F', "Dagmar Tichá");
        p3.print();
    }
}
