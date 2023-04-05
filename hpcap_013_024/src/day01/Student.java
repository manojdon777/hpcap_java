package day01;

public class Student
{
    int rollNumber;
    String fname;
    String lname;
    float percentage;
    public Student(int rollNumber, String fname, String lname, float percentage)
    {
        this.rollNumber = rollNumber;
        this.fname = fname;
        this.lname = lname;
        this.percentage = percentage;
    }
    public String toString()
    {
        return "Roll no is " + rollNumber + ". FName is " + fname + ". LName is " + lname + ". Percentage is " + percentage;
    }
}
