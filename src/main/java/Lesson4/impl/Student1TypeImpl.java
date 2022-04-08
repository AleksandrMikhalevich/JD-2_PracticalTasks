package Lesson4.impl;

import Lesson4.interfaces.CalculateStrategy;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 15:03
 */
public class Student1TypeImpl implements CalculateStrategy {

    @Override
    public int calculatePracticeTime(int practiceTime, double talent) {
        return (int) (practiceTime / talent);
    }

    @Override
    public int calculateReviewTime(int reviewTime, double talent) {
        return (int) (reviewTime / talent);
    }

    @Override
    public int calculateClassTime(int classTime, double talent) {
        return (int) (classTime / talent);
    }

    @Override
    public int calculateSummary(int practiceTime, int reviewTime, int classTime, double talent) {
        return (int) ((practiceTime / talent) + (reviewTime / talent) + (classTime / talent));
    }
}
