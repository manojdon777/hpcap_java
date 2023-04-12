package iopackage;

import java.io.*;

public class TestStudentSerializable {
    public static void main(String[] args) {
        Student s = new Student(1,"Ashish");
        try{
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
            oos.flush();
            fos.close();
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s1 = ((Student) ois.readObject());
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
