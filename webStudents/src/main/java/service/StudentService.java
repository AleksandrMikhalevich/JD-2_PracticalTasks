package service;

import entity.Student;

import java.util.List;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-07 20:53
 */
public interface StudentService {

    void addStudent(Student student);

    Student findStudentById(int id);

    List<Student> findAll();

    void updateStudent(Student student);

    void deleteStudent(int id);

}
