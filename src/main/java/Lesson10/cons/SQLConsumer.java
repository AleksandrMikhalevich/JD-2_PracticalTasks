package Lesson10.cons;

import java.sql.SQLException;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 12:59
 */
@FunctionalInterface
public interface SQLConsumer<T> {

    void accept(T t) throws SQLException;


}
