package lesson_11.dao;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-15 12:20
 */
public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final DAOImpl daoImpl = new DAOImpl();

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public DAO<Object> getImplThroughDAO() {
        return daoImpl;
    }
}
