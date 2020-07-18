package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumSalesTest() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumSales();

        assertEquals(expected, actual);
    }

    @Test
    void averageMonthlySalesTest() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageMonthlySales();

        assertEquals(expected, actual);
    }

    @Test
    void peakSalesTest() {
        StatsService service = new StatsService();

        long expected = 6;
        long actual = service.peakSales();

        assertEquals(expected, actual);
    }

    @Test
    void minSalesTest() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales();

        assertEquals(expected, actual);
    }

    @Test
    void sumMonthsPeakSalesTest() {
        StatsService service = new StatsService();

        long expected = 6;
        long actual = service.sumMonthsPeakSales();

        assertEquals(expected, actual);
    }

    @Test
    void sumMonthsMinSalesTest() {
        StatsService service = new StatsService();

        long expected = 4;
        long actual = service.sumMonthsMinSales();

        assertEquals(expected, actual);
    }
}