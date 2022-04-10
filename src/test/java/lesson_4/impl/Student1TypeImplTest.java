package lesson_4.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-20 17:23
 */
class Student1TypeImplTest {

    Student1TypeImpl student1Type = new Student1TypeImpl();

    @Test
    void shouldBeEqualsCalculatePracticeTime() {
        assertEquals(student1Type.calculatePracticeTime(66, 0.5), 132);
    }

    @Test
    void shouldBeEqualsCalculateReviewTime() {
        assertEquals(student1Type.calculateReviewTime(66, 0.7),94);
    }

    @Test
    void shouldBeEqualsCalculateClassTime() {
        assertEquals(student1Type.calculateClassTime(66, 0.1),660);
    }

    @Test
    void shouldBeEqualsCalculateSummary() {
        assertEquals(student1Type.calculateSummary(66, 66,66, 0.5),396);
    }
}