package TEST.schoolTest.inherit_Test.com.hw1.model.dto;

public class Student extends Person{

    private int grade;

    private String major;

    public Student() {}

    public Student(String name, int age, double height, double weight, int grade, String major) {
        super(name, age, height, weight);
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String information() {
        return super.information() + ", 학년 [" + grade + "], 전공 [" + major + "]";
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
