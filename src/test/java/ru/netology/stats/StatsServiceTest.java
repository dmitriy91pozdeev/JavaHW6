package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void salesAmountCalculation() {
        StatsService service = new StatsService();


        int expected = 180;

        int actual = service.getSaleseAmount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageSalesCalculation() {
        StatsService service = new StatsService();


        int expected = 15;

        int actual = service.getAverageSaleseAmount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchMaxSales() {
        StatsService service = new StatsService();


        int expected = 8;

        int actual = service.getMaxMount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchMinSales() {
        StatsService service = new StatsService();


        int expected = 9;

        int actual = service.getMinMount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchOverAverageSales() {
        StatsService service = new StatsService();


        int expected = 5;

        int actual = service.getOverAverageSaleseAmount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchUnderAverageSales() {
        StatsService service = new StatsService();


        int expected = 7;

        int actual = service.getUnderAverageSaleseAmount();
        Assertions.assertEquals(expected, actual);
    }
}
