package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] salesOfMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(salesOfMonth);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAvg() {
        StatsService service = new StatsService();
        int[] salesOfMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAvg(salesOfMonth);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMax() {
        StatsService service = new StatsService();
        int[] salesOfMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMax(salesOfMonth);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMin() {
        StatsService service = new StatsService();
        int[] salesOfMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMin(salesOfMonth);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldBelowAvg() {
        StatsService service = new StatsService();
        int[] salesOfMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.belowAvg(salesOfMonth);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldOverAvg() {
        StatsService service = new StatsService();
        int[] salesOfMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.overAvg(salesOfMonth);
        assertEquals(expected, actual);
    }
}