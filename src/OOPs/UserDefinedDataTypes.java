package OOPs;

public class UserDefinedDataTypes {
    public static class Student {
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prince";
        s1.rno = 10;
        s1.cgpa = 9.6;

        Student s2 = new Student();
        s2.name = "Shivam";
        s2.rno = 1;
        s2.cgpa = 9.7;

        System.out.println(s1.name);
    }
}
