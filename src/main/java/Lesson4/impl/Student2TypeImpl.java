package Lesson4.impl;

import Lesson4.interfaces.CalculateStrategy;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 15:04
 */
public class Student2TypeImpl implements CalculateStrategy {

    @Override
    public int calculatePracticeTime(int practiceTime, double talent) {
        return (int) (2 * practiceTime / talent);
    }

    @Override
    public int calculateReviewTime(int reviewTime, double talent) {
        return (int) (2 * reviewTime / talent);
    }

    @Override
    public int calculateClassTime(int classTime, double talent) {
        return 0;
    }

    @Override
    public int calculateSummary(int practiceTime, int reviewTime, int classTime, double talent) {
        return (int) ((2 * practiceTime / talent) + (2 * reviewTime / talent));
    }
}
