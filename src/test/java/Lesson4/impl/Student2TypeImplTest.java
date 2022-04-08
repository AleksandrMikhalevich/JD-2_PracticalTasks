package Lesson4.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-20 17:46
 */
class Student2TypeImplTest {

    Student2TypeImpl student2Type = new Student2TypeImpl();

    @Test
    void shouldBeEqualsCalculatePracticeTime() {
        assertEquals(student2Type.calculatePracticeTime(66, 1.0), 132);
    }

    @Test
    void shouldBeEqualsCalculateReviewTime() {
        assertEquals(student2Type.calculateReviewTime(66, 0.5), 264);
    }

    @Test
    void shouldBeEqualsCalculateClassTime() {
        assertEquals(student2Type.calculateClassTime(0, 0.5), 0);
    }

    @Test
    void shouldBeEqualsCalculateSummary() {
        assertEquals(student2Type.calculateSummary(66, 66, 0, 0.2), 1320);
    }
}