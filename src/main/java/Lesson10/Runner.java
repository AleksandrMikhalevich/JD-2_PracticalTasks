package Lesson10;

import Lesson10.cons.SQLConsumer;
import Lesson10.dao.DAO;
import Lesson10.dao.DAOFactory;
import Lesson10.entity.Car;
import Lesson10.entity.MyColumn;
import Lesson10.entity.MyTable;

import java.sql.SQLException;
import java.sql.Statement;

import static Lesson10.jdbc.JDBCUtils.getConnection;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 12:56
 */
public class Runner {


    public static void main(String[] args) throws SQLException, NoSuchFieldException {
        String table = Car.class.getDeclaredAnnotation(MyTable.class).name();
        String column_1 = Car.class.getDeclaredField("name").getDeclaredAnnotation(MyColumn.class).name();
        String column_2 = Car.class.getDeclaredField("color").getDeclaredAnnotation(MyColumn.class).name();
        String column_3 = Car.class.getDeclaredField("price").getDeclaredAnnotation(MyColumn.class).name();
        String tableInsert = Car.class.getDeclaredAnnotation(MyTable.class).name() + "(" + column_1
                + "," + column_2 + "," + column_3 + ")";
        DAOFactory daoFactory = DAOFactory.getInstance();
        DAO dao = daoFactory.getImplThroughDAO();
//        execute(dao.insert("insert into "+ tableInsert +  "values ('Subaru Forester', 'Grey', 25000)"));
//        execute(dao.insert("insert into "+ tableInsert +  "values ('Mitsubishi ASX', 'Red', 17000)"));
//        execute(dao.update("update " + table + " set price = 17500 where name = 'Mitsubishi ASX'"));
//        execute(dao.delete("delete from " + table + " where name = 'Mitsubishi ASX'"));
//        execute(dao.update("update " + table + " set price = 24000 where name = 'Subaru Forester'"));
        execute(dao.insert("insert into "+ tableInsert +  "values ('Subaru Outback', 'Black', 27000)"));
        execute(dao.select("select * from " + table));
    }

    public static void execute(SQLConsumer<Statement> request) {
        try (Statement statement = getConnection().createStatement()) {
            request.accept(statement);
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void getFromReflection() {

    }
}
