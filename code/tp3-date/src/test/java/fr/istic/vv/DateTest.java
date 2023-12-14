package fr.istic.vv;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {

    @Test
    void testValidYear() {
        assertTrue(Date.isValidDate(1, 1, -1));
    }

    @Test
    void testInvalidDayMonthYear() {
        assertFalse(Date.isValidDate(-1, -1, 0));
    }

    @Test
    void testInvalidDayNull() {
        assertFalse(Date.isValidDate(0, 4, 2020));
    }

    @Test
    void testInvalidDayNegativeMonthNull() {
        assertFalse(Date.isValidDate(-2, 0, 2019));
    }

    @Test
    void testInvalidNotLeapYear() {
        assertFalse(Date.isValidDate(29, 2, 2019));
    }

    @Test
    void testInvalidDayNullMonth13() {
        assertFalse(Date.isValidDate(0, 4, 2020));
    }
}