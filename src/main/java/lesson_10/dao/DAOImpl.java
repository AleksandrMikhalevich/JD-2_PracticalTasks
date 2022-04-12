package lesson_10.dao;

import lesson_10.cons.SQLConsumer;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 13:05
 */
public class DAOImpl implements DAO {

    @Override
    public SQLConsumer<Statement> select(String request) {
        return (statement -> {
            ResultSet resultSet = statement.executeQuery(request);
            int columns = resultSet.getMetaData().getColumnCount();
            {
                while (resultSet.next()) {
                    for (int i = 1; i <= columns; i++) {
                        System.out.print(resultSet.getString(i) + " ");
                    }
                    System.out.println("\n");
                }
            }
        });
    }

    @Override
    public SQLConsumer<Statement> update(String request) {
        return (statement -> statement.executeUpdate(request));
    }

    @Override
    public SQLConsumer<Statement> delete(String request) {
        return (statement -> statement.executeUpdate(request));
    }

    @Override
    public SQLConsumer<Statement> insert(String request) {
        return (statement -> statement.executeUpdate(request));
    }
}
