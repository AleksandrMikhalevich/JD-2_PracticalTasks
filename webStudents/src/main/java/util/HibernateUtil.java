package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-07 20:22
 */
public class HibernateUtil {

    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY =
            Persistence.createEntityManagerFactory("web-students");

    public static EntityManager getEntityManager() {
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }

    public static void close() {
        ENTITY_MANAGER_FACTORY.close();
    }
}
