package iopackage;

import java.io.Serializable;

public class Student implements Serializable {
    public int serialVersionID = 10;

    private int rollNo;
    private String name;
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Roll No = " + rollNo + " , Name = " + name;
    }
}
