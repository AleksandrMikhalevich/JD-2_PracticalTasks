package lesson_4.impl;

import lesson_4.interfaces.CalculateStrategy;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 15:04
 */
public class Student3TypeImpl implements CalculateStrategy {

    @Override
    public int calculatePracticeTime(int practiceTime, double talent) {
        return (int) (3 * practiceTime / talent);
    }

    @Override
    public int calculateReviewTime(int reviewTime, double talent) {
        return 0;
    }

    @Override
    public int calculateClassTime(int classTime, double talent) {
        return 0;
    }

    @Override
    public int calculateSummary(int practiceTime, int reviewTime, int classTime, double talent) {
        return (int) (3 * practiceTime / talent);
    }
}
