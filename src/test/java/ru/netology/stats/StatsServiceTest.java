package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void salesSummTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        // long expected = 170;
        long expected = 180;
        long actual = service.salesSumm(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void salesAverageSummTest() {
        // long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, /* 14, 14, 18 */}
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        // long expected = 14;
        long expected = 15;
        long actual = service.salesAverageSumm(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageMonths() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.belowAverageMonths(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void aboveAverageMonths() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.aboveAverageMonths((sales));

        Assertions.assertEquals(expected, actual);
    }

}