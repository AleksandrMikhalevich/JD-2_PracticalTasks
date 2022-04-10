package lesson_4.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-20 17:54
 */
class Student3TypeImplTest {

    Student3TypeImpl student3Type = new Student3TypeImpl();

    @Test
    void shouldBeEqualsCalculatePracticeTime() {
        assertEquals(student3Type.calculatePracticeTime(66,1.0),198);
    }

    @Test
    void shouldBeEqualsCalculateReviewTime() {
        assertEquals(student3Type.calculateReviewTime(0,1.0),0);
    }

    @Test
    void shouldBeEqualsCalculateClassTime() {
        assertEquals(student3Type.calculateClassTime(66,0.7),0);
    }

    @Test
    void shouldBeEqualsCalculateSummary() {
        assertEquals(student3Type.calculateSummary(66,0,0,0.5),396);
    }
}