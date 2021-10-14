package cz.osu.student.R19584.task1;

public class BirthDate {

    private int day;
    private int month;
    private int year;

    public BirthDate(int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(year < 1000 || year > 9999)  throw new IllegalArgumentException("Illegal year");
        if(month < 1 || month > 12) throw new IllegalArgumentException("Illegal month");
        if(day < 1 || day > daysInMonth[month - 1]) throw new IllegalArgumentException("Illegal day");

        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public BirthDate(BirthDate birthDate) {
        setDay(birthDate.getDay());
        setMonth(birthDate.getMonth());
        setYear(birthDate.getYear());
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Birth date: " + getDay() + "." + getMonth() + "." + getYear();
    }

    public void print() {
        System.out.println(toString());
    }
}
