package Lesson2.reflectionTasks.task72;

import java.lang.reflect.Method;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 12:53
 */
public class AnnotationAcademyInfo {

    public static void main(String[] args) {
        Class<AnnotationAcademyInfo> annotationAcademyInfo = AnnotationAcademyInfo.class;
        try {
            Method method1 = annotationAcademyInfo.getMethod("withAnnotation");
            Method method2 = annotationAcademyInfo.getMethod("withOutAnnotation");
            boolean annotation1 = method1.isAnnotationPresent(AnnotationCreation.AcademyInfo.class);
            boolean annotation2 = method2.isAnnotationPresent(AnnotationCreation.AcademyInfo.class);
            System.out.println("Check for annotation in method withAnnotation(): " + annotation1);
            System.out.println("================");
            System.out.println("Check for annotation in method withOutAnnotation(): " + annotation2);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    @AnnotationCreation.AcademyInfo(year = "2020")
    public static Method withAnnotation() {
        System.out.println("Annotation used in this method");
        return null;
    }

    public static Method withOutAnnotation() {
        System.out.println("Annotation not used in this method");
        return null;
    }
}
