package service;

import dao.StudentDao;
import dao.StudentDaoImpl;
import entity.Student;

import java.util.List;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-07 20:55
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public void addStudent(Student student) {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.create(student);
    }

    @Override
    public Student findStudentById(int id) {
        StudentDao studentDao = new StudentDaoImpl();
        return studentDao.findById(id);
    }

    @Override
    public List<Student> findAll() {
        StudentDao studentDao = new StudentDaoImpl();
        return studentDao.findAll();
    }

    @Override
    public void updateStudent(Student student) {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.update(student);
    }

    @Override
    public void deleteStudent(int id) {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.delete(id);
    }
}
