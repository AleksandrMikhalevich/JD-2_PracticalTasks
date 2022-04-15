package lesson_11.dao;

import lesson_11.entity.Address;
import lesson_11.entity.People;
import lesson_11.util.HibernateUtil;
import org.junit.AfterClass;
import org.junit.jupiter.api.Test;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-15 14:05
 */
class DAOImplTest {

    private static final DAOFactory daoFactory = DAOFactory.getInstance();
    private static final DAO<Object> dao = daoFactory.getImplThroughDAO();
    private static Address TEST_ADDRESS = Address.builder().city("Minsk").street("Bogdanovicha").house("90").build();
    private static People TEST_PEOPLE = People.builder().firstName("Jerry").surname("Mouse").secondName("Jerryevich").build();

    @Test
    void save() {
        dao.save(TEST_ADDRESS);
        dao.save(TEST_PEOPLE);
    }

    @Test
    void update() {
        TEST_ADDRESS = Address.builder().city("Minsk").street("Orlovskaya").house("10").build();
        TEST_PEOPLE = People.builder().firstName("Spike").surname("Dog").secondName("Spikovich").build();
        dao.update(TEST_ADDRESS);
        dao.update(TEST_PEOPLE);
    }

    @Test
    void read() {
        dao.read(Address.class, 1);
        dao.read(People.class, 1);
    }

    @Test
    void delete() {
        dao.save(TEST_ADDRESS);
        dao.save(TEST_PEOPLE);
        dao.delete(Address.class, 1);
        dao.delete(People.class, 1);
    }

    @AfterClass
    public static void cleanUp() {
        HibernateUtil.close();
    }
}