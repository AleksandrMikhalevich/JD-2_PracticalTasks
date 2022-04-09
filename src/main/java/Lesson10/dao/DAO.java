package Lesson10.dao;

import Lesson10.cons.SQLConsumer;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 12:57
 */
public interface DAO {

    SQLConsumer<Statement> select(String request) throws SQLException;
    SQLConsumer<Statement> update(String request) throws SQLException;
    SQLConsumer<Statement> delete(String request) throws SQLException;
    SQLConsumer<Statement> insert(String request) throws SQLException;
}
