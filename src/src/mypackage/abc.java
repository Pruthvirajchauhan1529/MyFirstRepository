package mypackage;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class abc {

    public static void studentData(List<Student> students){
        students.add(new Student(1,"Pruthviraj"));
        students.add(new Student(2,"Pruthviraj"));
        students.add(new Student(4,"Pruthviraj"));
    }

    public static void main(String[] args) {
        System.out.println("Hello GIT...");
        System.out.println("Hello java....");
        System.out.println("sssxvrcsx");
        System.out.println("dvsvjsnv");

        List<Student> students = new ArrayList<>();
        studentData(students);
        System.out.println(students);
    }
}
