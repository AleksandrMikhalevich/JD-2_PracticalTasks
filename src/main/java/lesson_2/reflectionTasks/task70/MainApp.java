package lesson_2.reflectionTasks.task70;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 12:48
 */
public class MainApp {

    public static void main(String[] args) {
        Man man = new Man();
        ReflectionMethod.getInfoAboutClassByReflectionMethod();
        System.out.println("====================================");
        callReflectionMethod(man);
    }

    public static void callReflectionMethod(Man man) {
        try {
            System.out.println("Call reflection method through reflection:");
            Method method = ReflectionMethod.class.getMethod("getInfoAboutClassByReflectionMethod");
            method.invoke(man);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
