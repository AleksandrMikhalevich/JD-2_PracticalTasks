package dao;

import entity.Student;

import java.util.List;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-07 20:48
 */
public interface StudentDao {

    void create(Student student);

    Student findById(int id);

    List<Student> findAll();

    void update(Student student);

    void delete(int id);

}
