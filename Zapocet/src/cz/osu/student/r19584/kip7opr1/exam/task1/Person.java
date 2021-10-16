package cz.osu.student.r19584.kip7opr1.exam.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Person {

    private Address address;
    private BirthDate birthDate;
    private final char sex;
    private int controlDigits;
    private String name;
    private String birthID;

    public Person(Address address, BirthDate birthDate, char sex, String name) {
        setAddress(address);
        setBirthDate(birthDate);
        this.sex = sex;
        setName(name);
        setBirthID();
    }

    public Address getAddress() {
        return new Address(address);
    }

    public void setAddress(Address address) {
        this.address = new Address(address);
    }

    public BirthDate getBirthDate() {
        return new BirthDate(birthDate);
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = new BirthDate(birthDate);
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        String s = getBirthDate().getDay() + "." + getBirthDate().getMonth() + "." + getBirthDate().getYear();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1, now1);
        return diff1.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void setBirthID() {
        Random r = new Random();
        int ran = r.nextInt(100);
        int lastTwo = 0;
        String tmp = (getBirthDate().getYear() % 100 < 10 ? "0" : "") + getBirthDate().getYear() % 100
                + (getSex() == 'M' ? (getBirthDate().getMonth() < 10 ? "0" : "")
                        : (getBirthDate().getMonth() < 10 ? "5" : "6"))
                + getBirthDate().getMonth() + (getBirthDate().getDay() < 10 ? "0" : "") + getBirthDate().getDay()
                + (ran < 10 ? "0" : "") + ran;
        while (Long.parseLong(tmp + (lastTwo < 10 ? "0" : "") + lastTwo) % 11 != 0)
            lastTwo++;
        birthID = tmp.substring(0, 6) + "/" + (ran < 10 ? "0" : "") + ran + (lastTwo < 10 ? "0" : "") + lastTwo;
    }

    public String getBirthID() {
        return birthID;
    }

    @Override
    public String toString() {
        return getName() + "\nSex: " + (getSex() == 'M' ? "Male" : "Female") + "\n" + getBirthDate().toString() + " ("
                + getBirthID() + ")" + "\nAge: " + getAge() + "\n" + getAddress().toString();
    }

    public void print() {
        System.out.println(toString());
    }
}
