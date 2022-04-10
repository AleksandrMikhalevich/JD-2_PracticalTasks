package lesson_4.entities;

import lesson_4.impl.Student2TypeImpl;
import org.apache.commons.math3.util.Precision;

import java.util.Random;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 17:38
 */
public class Student2Type extends Student {

    public Student2Type() {
        super(2, Precision.round(new Random().nextDouble(), 1), new Student2TypeImpl());
    }

    @Override
    public String toString() {
        return super.toString() + ", время на практику = " + calculatePracticeTime() + " часов" +
                ", время на разборы = " + calculateReviewTime() + " часов" + ", суммарное время на освоение навыка = "
                + calculateSummary() + " часов" + "\n";
    }
}
