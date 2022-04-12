package lesson_10.dao;

import lesson_10.cons.SQLConsumer;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-10 16:35
 */
class DAOImplTest {

    private static Statement STATEMENT;

    static {
        try {
            Connection connection = getConnection("jdbc:h2:mem:lesson_10_test");
            STATEMENT = connection.createStatement();
            STATEMENT.execute("create schema lesson_10_test");
            STATEMENT.execute("create table car(id int not null auto_increment primary key, name char(50), " +
                    "color char(50), price int)");
            STATEMENT.execute("insert into car(name, color, price) values ('Lada X-ray', 'Red', 12000)");
            STATEMENT.execute("insert into car(name, color, price) values ('Lada Vesta', 'Silver', 10000)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void shouldSelectFromDBTest() throws SQLException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        DAO dao = daoFactory.getImplThroughDAO();
        SQLConsumer<Statement> select = dao.select("select * from car");
        select.accept(STATEMENT);
    }

    @Test
    void shouldUpdateDBTest() throws SQLException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        DAO dao = daoFactory.getImplThroughDAO();
        SQLConsumer<Statement> update = dao.update("update car set price = 13000 where id = 1");
        update.accept(STATEMENT);
    }

    @Test
    void shouldDeleteFromDBTest() throws SQLException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        DAO dao = daoFactory.getImplThroughDAO();
        SQLConsumer<Statement> delete = dao.delete("delete from car where id = 2");
        delete.accept(STATEMENT);
    }

    @Test
    void shouldInsertIntoDBTest() throws SQLException {
        DAOFactory daoFactory = DAOFactory.getInstance();
        DAO dao = daoFactory.getImplThroughDAO();
        SQLConsumer<Statement> insert = dao.insert("insert into car(name, color, price) values ('Lada X-ray', 'Red', 12000)");
        insert.accept(STATEMENT);
        SQLConsumer<Statement> insert2 = dao.insert("insert into car(name, color, price) values ('Lada Vesta', 'Silver', 10000)");
        insert2.accept(STATEMENT);
    }
}