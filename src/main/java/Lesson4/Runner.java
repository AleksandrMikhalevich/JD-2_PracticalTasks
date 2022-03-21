package Lesson4;

import Lesson4.entities.Student;
import Lesson4.entities.Student1Type;
import Lesson4.entities.Student2Type;
import Lesson4.entities.Student3Type;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 15:50
 */
public class Runner {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student1Type();
        Student student2 = new Student1Type();
        Student student3 = new Student1Type();
        Student student4 = new Student2Type();
        Student student5 = new Student2Type();
        Student student6 = new Student2Type();
        Student student7 = new Student3Type();
        Student student8 = new Student3Type();
        Student student9 = new Student3Type();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        String formatted = students.toString()
                .replace("[", "")
                .replace("]", "");
        System.out.println(formatted);

    }
}

