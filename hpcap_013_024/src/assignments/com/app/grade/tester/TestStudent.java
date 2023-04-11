package assignments.com.app.grade.tester;

import assignments.com.app.grade.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1,60,"aa");
        Student s2 = new Student(1,80,"bb");
//        s[0] = new Student(1001, 92, "aaa");
//        s[1] = new Student(1002, 96, "aaa");
//        s[2] = new Student(1003, 85, "aaa");
//        s[3] = new Student(1004, 75, "aaa");
//        s[4] = new Student(1005, 83, "aaa");

        StudentOperation so = new StudentOperation();
        so.addStudent(s1);
        so.addStudent(s2);
        so.calculateGrade();
    }
}
