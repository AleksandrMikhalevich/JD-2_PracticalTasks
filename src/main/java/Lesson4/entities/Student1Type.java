package Lesson4.entities;

import Lesson4.impl.Student1TypeImpl;
import org.apache.commons.math3.util.Precision;

import java.util.Random;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 17:37
 */
public class Student1Type extends Student {

    public Student1Type() {
        super(1, Precision.round(new Random().nextDouble(), 1), new Student1TypeImpl());
    }

    @Override
    public String toString() {
        return super.toString() + ", время на практику = " + calculatePracticeTime() + " часов" +
                ", время на разборы = " + calculateReviewTime() + " часов" +", время на работу в потоке = "
                + calculateClassTime() + " часов" +", суммарное время на освоение навыка = "
                + calculateSummary() + " часов"+ "\n";
    }

}
