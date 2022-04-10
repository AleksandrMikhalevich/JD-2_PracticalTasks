package lesson_10.jdbc;

import java.util.ResourceBundle;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 13:16
 */
public class JDBCResources {

    private static final String DATABASE_RESOURCE = "lesson_10";
    private static final String URL_KEY = "url";
    private static final String USER_KEY = "username";
    private static final String PASSWORD_KEY = "password";

    private static final ResourceBundle resource = ResourceBundle.getBundle(DATABASE_RESOURCE);

    private static final String URL =  getValue(URL_KEY);
    private static final String USER =  getValue(USER_KEY);
    private static final String PASSWORD =  getValue(PASSWORD_KEY);

    public static String getValue(String key) {
        return resource.getString(key);
    }

    public static String getUrl() {
        return URL;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }
}
