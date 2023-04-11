package assignments.com.app.grade.tester;

import assignments.com.app.grade.Student;

public class StudentOperation {

    Student studentsArray[] = new Student[5];
    private int top = -1;
    public void addStudent(Student students){
        studentsArray[++top] = students;
    }
    public void calculateGrade() {
        for (int i=0; i<=top; i++){
            float marks = studentsArray[i].getMarks();
            if(marks > 95)
                System.out.println("A");
            else if(marks > 90)
                System.out.println("B");
            else if (marks > 85)
                System.out.println("C");
            else
            System.out.println("D");
        }
    }
}
