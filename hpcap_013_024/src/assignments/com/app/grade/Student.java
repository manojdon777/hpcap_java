package assignments.com.app.grade;

public class Student {
    private int rollNo;
    private float marks;
    private String name;
    private String grade;


    public Student(int rollno, float marks, String name ){
        this.rollNo = rollno;
        this.marks = marks;
        this.name = name;

    }
    public float getMarks(){
        return this.marks;
    }
}
