package lesson_4.interfaces;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-19 14:50
 */
public interface CalculateStrategy {

    int calculatePracticeTime(int practiceTime, double talent);

    int calculateReviewTime(int reviewTime, double talent);

    int calculateClassTime(int classTime, double talent);

    int calculateSummary(int practiceTime, int reviewTime, int classTime, double talent);
}
