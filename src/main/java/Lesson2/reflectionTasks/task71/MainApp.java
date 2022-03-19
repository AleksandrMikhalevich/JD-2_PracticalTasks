package Lesson2.reflectionTasks.task71;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 12:51
 */
public class MainApp {

    public static void main(String[] args) {
        try {
            System.out.println("Call reflection method through reflection:");
            Method method = HelloWorld.class.getMethod("printHelloWorld");
            method.invoke(HelloWorld.class);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
