package lesson_4.entities;

import lesson_4.impl.Student3TypeImpl;
import org.apache.commons.math3.util.Precision;

import java.util.Random;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 17:38
 */
public class Student3Type extends Student {

    public Student3Type() {
        super(3, Precision.round(new Random().nextDouble(), 1), new Student3TypeImpl());
    }

    @Override
    public String toString() {
        return super.toString() + ", время на практику = " + calculatePracticeTime() + " часов" +
                ", суммарное время на освоение навыка = " + calculateSummary() + " часов" + "\n";
    }
}
