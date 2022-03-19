package Lesson2.reflectionTasks.task70;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 12:48
 */
public class ReflectionMethod {

    public static void getInfoAboutClassByReflectionMethod() {
        Field[] fields = Man.class.getDeclaredFields();
        System.out.println("_____________________");
        System.out.println("Class \"Man\" fields");
        System.out.println("_____________________");
        for (Field field : fields) {
            System.out.println("Field name: " + field.getName());
            System.out.println("Field type: " + field.getType().getName());
            System.out.println();
        }
        Method[] methods = Man.class.getDeclaredMethods();
        System.out.println("_____________________");
        System.out.println("Class \"Man\" methods");
        System.out.println("_____________________");
        for (Method method : methods) {
            System.out.println("\n" + "Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
            Class<?>[] parameters = method.getParameterTypes();
            System.out.print("Parameters: " );
            for (Class<?> parameter : parameters) {
                System.out.print(parameter.getName());
            }
            System.out.println();
        }
    }
}
