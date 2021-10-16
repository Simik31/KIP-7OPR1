package cz.osu.student.r19584.kip7opr1.exam.task2;

public class Student extends Person {

    private String universityName;
    private String branchOfStudy;

    public Student(Address address, BirthDate birthDate, char sex, String name, String universityName,
            String branchOfStudy) {
        super(address, birthDate, sex, name);
        setUniversityName(universityName);
        setBranchOfStudy(branchOfStudy);
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getBranchOfStudy() {
        return branchOfStudy;
    }

    public void setBranchOfStudy(String branchOfStudy) {
        this.branchOfStudy = branchOfStudy;
    }

    public String toString() {
        return super.toString() + "\nUniversity: " + getUniversityName() + "\nBranch of study: " + getBranchOfStudy();
    }

    @Override
    public void print() {
        System.out.println(toString());
    }
}
