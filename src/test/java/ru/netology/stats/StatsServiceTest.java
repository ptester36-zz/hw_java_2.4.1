package ru.netology.stats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumSalesTest() {
        StatsService service = new StatsService();

        long [] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(purchase);

        assertEquals(expected, actual);
    }

    @Test
    void averageMonthlySalesTest() {
        StatsService service = new StatsService();

        long [] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageMonthlySales(purchase);

        assertEquals(expected, actual);
    }

    @Test
    void peakSalesTest() {
        StatsService service = new StatsService();

        long [] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.peakSales(purchase);

        assertEquals(expected, actual);
    }

    @Test
    void minSalesTest() {
        StatsService service = new StatsService();

        long [] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(purchase);

        assertEquals(expected, actual);
    }

    @Test
    void sumMonthsPeakSalesTest() {
        StatsService service = new StatsService();

        long [] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.sumMonthsPeakSales(purchase);

        assertEquals(expected, actual);
    }

    @Test
    void sumMonthsMinSalesTest() {
        StatsService service = new StatsService();

        long [] purchase = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.sumMonthsMinSales(purchase);

        assertEquals(expected, actual);
    }
}