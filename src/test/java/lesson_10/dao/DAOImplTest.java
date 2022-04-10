package lesson_10.dao;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
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
            Connection connection = getConnection("jdbc:h2:mem:car");
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
    void select() throws SQLException {
        try (ResultSet resultSet = STATEMENT.executeQuery("select * from car")) {
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " "
                        + resultSet.getString(2));
            }
        }
    }

    @Test
    void update() {
        try {
            STATEMENT.executeUpdate("update car set price = 13000 where id = 1");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void delete() {
        try {
            STATEMENT.executeUpdate("delete from car where id = 2");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void insert() {
        try {
            STATEMENT.executeUpdate("insert into car(name, color, price) values ('Renault Logan', 'White', 10000)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}