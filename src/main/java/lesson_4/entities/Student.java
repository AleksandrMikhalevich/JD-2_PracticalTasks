package lesson_4.entities;

import lesson_4.interfaces.CalculateStrategy;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 12:58
 */
@EqualsAndHashCode
@Getter
@Setter
public class Student {

    private final int type;
    private final double talent;
    CalculateStrategy calculateStrategy;

    public Student(int type, double talent, CalculateStrategy calculateStrategy) {
        this.type = type;
        this.talent = talent;
        this.calculateStrategy = calculateStrategy;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "тип = " + type +
                ", талант = " + talent;
    }

    public int calculatePracticeTime() {
        return calculateStrategy.calculatePracticeTime(66, talent);
    }

    public int calculateReviewTime() {
        return calculateStrategy.calculateReviewTime(66, talent);
    }

    public int calculateClassTime() {
        return calculateStrategy.calculateClassTime(66, talent);

    }

    public int calculateSummary() {
        return calculateStrategy.calculateSummary(66,66,66, talent);
    }
}

