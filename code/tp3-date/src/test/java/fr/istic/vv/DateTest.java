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

    @Test
    void testIsLeapYear4() {
        assertTrue(Date.isLeapYear(8));
    }

    @Test
    void testIsNotLeapYear() {
        assertFalse(Date.isLeapYear(200));
    }

    @Test
    void testIsLeapYear400() {
        assertTrue(Date.isLeapYear(800));
    }

    @Test
    void testIsNotLeapYear4() {
        assertFalse(Date.isLeapYear(10));
    }

    @Test
    void testIsNotLeapYear100() {
        assertFalse(Date.isLeapYear(150));
    }

    @Test
    void testIsBefore() throws Exception {
        Date date = new Date(12, 6, 120);
        Date otherdate = new Date(27, 8, 2018);
        assertEquals(1, date.compareTo(otherdate));
    }

    @Test
    void testIsEquals() throws Exception {
        Date date = new Date(5, 3, 2024);
        Date otherdate = new Date(5, 3, 2024);
        assertEquals(0, date.compareTo(otherdate));
    }

    @Test
    void testIsAfter() throws Exception {
        Date date = new Date(5, 3, 3007);
        Date otherdate = new Date(2, 7, 1932);
        assertEquals(-1, date.compareTo(otherdate));
    }

    @Test
    void testNextDate() throws Exception {
        Date date = new Date(5, 3, 2024);
        Date otherdate = new Date(6, 3, 2024);
        assertEquals(0, date.nextDate().compareTo(otherdate));
    }

    @Test
    void testNextDateEndOfMonth() throws Exception {
        Date date = new Date(31, 1, 2018);
        Date otherdate = new Date(1, 2, 2018);
        assertEquals(0, date.nextDate().compareTo(otherdate));
    }

    @Test
    void testNextDateEndOfYear() throws Exception {
        Date date = new Date(31, 12, 1872);
        Date otherdate = new Date(1, 1, 1873);
        assertEquals(0, date.nextDate().compareTo(otherdate));
    }

    @Test
    void testPreviousDateBeginningOfMonth() throws Exception {
        Date date = new Date(1, 6, 2018);
        Date otherdate = new Date(31, 5, 2018);
        assertEquals(0, date.previousDate().compareTo(otherdate));
    }

    @Test
    void testPreviousDateBeginningOfYear() throws Exception {
        Date date = new Date(1, 1, -100);
        Date otherdate = new Date(31, 12, -101);
        assertEquals(0, date.previousDate().compareTo(otherdate));
    }

    @Test
    void testPreviousDate() throws Exception {
        Date date = new Date(5, 3, 2024);
        Date otherdate = new Date(4, 3, 2024);
        assertEquals(0, date.previousDate().compareTo(otherdate));
    }

}