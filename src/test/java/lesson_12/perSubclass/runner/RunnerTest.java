package lesson_12.perSubclass.runner;

import lesson_12.perSubclass.entity.HomeTask;
import lesson_12.perSubclass.entity.Person;
import lesson_12.perSubclass.entity.WorkTask;
import lesson_12.perSubclass.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.junit.AfterClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-17 16:41
 */
class RunnerTest {

    @Test
    void shouldSaveIntoDBByPerClassHierarchy() {
        HomeTask homeTask = HomeTask.builder()
                .taskName("Test")
                .description("Making a test")
                .startDate("17-04-2022")
                .endDate("17-04-2022")
                .performer(new Person("A", "M"))
                .curator(new Person("G", "V"))
                .build();
        WorkTask workTask = WorkTask.builder()
                .taskName("Test_2")
                .description("Making a test")
                .cost("10")
                .build();
        EntityManager entityManager = HibernateUtil.getEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(homeTask);
            entityManager.persist(workTask);
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            entityManager.getTransaction().rollback();
        }

        entityManager.getTransaction().begin();
        HomeTask homeTaskFromDB = entityManager.find(HomeTask.class, homeTask.getId());
        WorkTask workTaskFromDB = entityManager.find(WorkTask.class, workTask.getId());
        Assertions.assertEquals(homeTask, homeTaskFromDB);
        Assertions.assertEquals(workTask, workTaskFromDB);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @AfterClass
    public static void clean() {
        HibernateUtil.close();
    }
}