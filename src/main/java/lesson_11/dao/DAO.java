package lesson_11.dao;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-15 12:04
 */
public interface DAO<T> {

    void save(T t);
    void update(T t);
    void read(Class<?> t, int id);
    void delete(Class<?> t, int id);

}
