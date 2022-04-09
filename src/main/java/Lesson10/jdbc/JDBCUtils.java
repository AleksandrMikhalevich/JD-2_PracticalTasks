package Lesson10.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 13:21
 */
public class JDBCUtils {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection conn;
        conn = DriverManager.getConnection(JDBCResources.getUrl(),
                JDBCResources.getUser(), JDBCResources.getPassword());
        return conn;
    }
}
