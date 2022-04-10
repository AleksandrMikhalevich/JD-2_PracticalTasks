package lesson_10.dao;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 13:03
 */
public class DAOFactory {

    private static final DAOFactory instance = new DAOFactory();
    private final DAOImpl daoImpl = new DAOImpl();

    public DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return instance;
    }

    public DAO getImplThroughDAO() {
        return daoImpl;
    }

}
