//измененная версия 
package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void proverka_na_nol() {
        boolean result = CourseToolkit.isEven(0);
        assertTrue(result);
    }

    @Test
    void test1_1() {
        assertFalse(CourseToolkit.isPrime(4));
    }

    @Test
    void test1_2() {
        assertTrue(CourseToolkit.isPrime(5));
    }

    @Test
    void test1_3() {
        assertFalse(CourseToolkit.isPrime(12345678));
    }

    @Test
    void test1_4() {
        assertFalse(CourseToolkit.isPrime(-12));
    }

    @Test
    void test2_1() {
        assertFalse(CourseToolkit.isPalindrome("Шалаш"));
    }

    @Test
    void test2_2() {
        assertTrue(CourseToolkit.isPalindrome("шалаш"));
    }

    @Test
    void test2_3() {
        assertTrue(CourseToolkit.isPalindrome("а"));
    }

    @Test
    void test3_1() {
        assertEquals(4.66666, CourseToolkit.average(new int[]{4, 5, 5}), 0.0001);
    }

    @Test
    void test3_2() {
        assertEquals(-3, CourseToolkit.average((new int[]{-3, -3, -3})));
    }

    @Test
    void test3_3() {
        assertEquals(3, CourseToolkit.average(new int[]{5, 876, 3}));
    }

    @Test
    void test_min() {
        assertEquals(0, CourseToolkit.min(new int[]{5, -3, 8, 1}));
    }

    @Test
    void test_max() {
        assertEquals(-3, CourseToolkit.max(new int[]{5, -3, 8, 1}));
    }

}