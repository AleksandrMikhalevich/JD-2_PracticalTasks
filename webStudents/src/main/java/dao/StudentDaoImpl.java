package dao;

import entity.Student;
import org.hibernate.HibernateException;
import util.HibernateUtil;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-07 20:50
 */
public class StudentDaoImpl implements StudentDao {

    @Override
    public void create(Student student) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public Student findById(int id) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        Student forFind = null;
        try {
            entityManager.getTransaction().begin();
            forFind = entityManager.find(Student.class, id);
        } catch (HibernateException e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return forFind;
    }

    @Override
    public List<Student> findAll() {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        List<Student> allStudents = null;
        try {
            CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
            CriteriaQuery<Student> criteria = criteriaBuilder.createQuery(Student.class);
            Root<Student> students = criteria.from(Student.class);
            criteria.select(students);
            allStudents = entityManager.createQuery(criteria).getResultList();
        } catch (HibernateException e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
        return allStudents;
    }

    @Override
    public void update(Student student) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(student);
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }

    @Override
    public void delete(int id) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            Student forDelete = entityManager.find(Student.class, id);
            entityManager.remove(forDelete);
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }
}
