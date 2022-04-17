package lesson_12.perSubclass.runner;

import lesson_12.perSubclass.entity.HomeTask;
import lesson_12.perSubclass.entity.Person;
import lesson_12.perSubclass.entity.WorkTask;
import lesson_12.perSubclass.util.HibernateUtil;
import org.hibernate.HibernateException;

import javax.persistence.EntityManager;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-17 16:32
 */
public class Runner {

    public static void main(String[] args) {
        HomeTask homeTask = HomeTask.builder().taskName("HomeTask_12")
                .description("Hibernate_hierarchy")
                .startDate("16-04-2022")
                .endDate("17-04-2022")
                .performer(new Person("Alex", "Mikhalevich"))
                .curator(new Person("Gena", "Vlasik"))
                .build();
        WorkTask workTask = WorkTask.builder()
                .taskName("WorkTask_12")
                .description("Hibernate_hierarchy")
                .cost("4")
                .build();
        EntityManager entityManager = HibernateUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(homeTask);
            entityManager.persist(workTask);
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
            HibernateUtil.close();
        }
    }
}
