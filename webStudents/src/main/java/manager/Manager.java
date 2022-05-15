package manager;

import entity.Student;
import service.StudentService;
import service.StudentServiceImpl;
import util.HibernateUtil;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-07 20:46
 */
public class Manager {

    public static void main(String[] args) {
        Student student = Student.builder()
                .firstName("Jack")
                .secondName("Jackovich")
                .surname("Black")
                .faculty("History")
                .yearOfStudy("5")
                .build();
        Student student2 = Student.builder()
                .firstName("John")
                .secondName("Johnovich")
                .surname("White")
                .faculty("Math")
                .yearOfStudy("5")
                .build();
        StudentService studentService = new StudentServiceImpl();
        studentService.addStudent(student);
        studentService.addStudent(student2);
        System.out.println(studentService.findAll());
        HibernateUtil.close();
    }
}
