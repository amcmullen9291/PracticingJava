package Workspace;


public class Person{
    int id;
    String firstName;
    String lastName;
    float gpa;
    int grade;

    public Person(int id, String firstName, String lastName, int grade, float gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.grade = grade;
    }

    public float getGpa() {
        return gpa;
    }

    public int getGrade(){
        return grade;
    }
}