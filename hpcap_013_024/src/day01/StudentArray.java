package day01;

public class StudentArray
{
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"CDAC", "HPCAP",50f);
        Student s2 = new Student(2,"cdac", "hpcap",60f);
        Student sArray[] = new Student[2];
        sArray[0] = s1;
        sArray[1] = s2;
        for (int i=0;i< sArray.length;i++)
        {
            System.out.println(sArray[i]);
        }
    }
}
