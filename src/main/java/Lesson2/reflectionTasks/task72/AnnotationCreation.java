package Lesson2.reflectionTasks.task72;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 12:53
 */
public class AnnotationCreation {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface AcademyInfo {
        String year();
    }
}
